package models.vault

import play.api.libs.json._
import play.api.libs.json.{Format, JsNumber, Json}

object Objective {




  def allKeys(json: JsValue): collection.Set[String] = json match {
    case o: JsObject => o.keys ++ o.values.flatMap(allKeys)
    case JsArray(as) => as.flatMap(allKeys).toSet
    case _ => Set()
  }

  implicit val requirementReads: Reads[Requirement] = {
    js =>
      val keys = allKeys(js)
      val progKey = if(keys.last.equals("isAchievement")) keys.dropRight(1).last else keys.last
      println(allKeys(js))
      JsSuccess(
        Requirement(
          (js \ "requirementID").as[String],
          (js \ "satisfied").as[Boolean],
          (js \ progKey).as[JsNumber],
          progKey,
          (js \ "isAchievement").asOpt[Boolean].getOrElse(false)
        )
      )
  }

  implicit val requirementWrites: Writes[Requirement] = {
    requirement =>
      JsObject(
        Map(
          "requirementID" -> JsString(requirement.requirementID),
          "satisfied" -> JsBoolean(requirement.satisfied),
          requirement.progressTitle -> requirement.progress
        )
    )
  }

  implicit val objectiveFormats: Format[Objective] = Json.format[Objective]
}

case class Objective(objectiveID: String, requirements: List[Requirement], completed: Boolean, incrementLevel: JsNumber)

case class Requirement(requirementID: String, satisfied: Boolean, progress: JsNumber, progressTitle: String, isAchievement: Boolean = false)


