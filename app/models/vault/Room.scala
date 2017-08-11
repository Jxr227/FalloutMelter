package models.vault

import play.api.libs.functional.syntax._
import play.api.libs.json._
import Common._
case class Room(
                 emergencyDone: Boolean,
                 `type`: String,
                 `class`: String,
                 mergeLevel: JsNumber,
                 row: JsNumber,
                 col: JsNumber,
                 power: Boolean,
                 roomHealth: RoomHealth,
                 mrHandyList: List[JsNumber],
                 rushTask: JsNumber,
                 level: JsNumber,
                 dwellers: List[JsNumber],
                 deadDwellers: List[JsNumber],
                 currentStateName: String,
                 currentState: TeamState,
                 deserializeID: JsNumber,
                 assignedDecoration: String,
                 roomVisibility: Boolean,
                 roomOutline: Boolean,
                 broken: Option[Boolean],
                 withHole: Option[Boolean],
                 storage: Option[Resource],
                 numberOfProductionCycle: Option[JsNumber],
                 ExperienceRewardIsDirty: Option[Boolean]
               )

case class RoomHealth(damageValue: JsNumber, initialValue: JsNumber)

case class State(taskId: Option[JsNumber], notificationId: Option[String])


object Room {

  implicit def optionFormat[T: Format]: Format[Option[T]] = new Format[Option[T]]{
    override def reads(json: JsValue): JsResult[Option[T]] = json.validateOpt[T]

    override def writes(o: Option[T]): JsValue = o match {
      case Some(t) ⇒ implicitly[Writes[T]].writes(t)
      case None ⇒ JsNull
    }
  }
  implicit val roomHealthFormats: Format[RoomHealth] = Json.format[RoomHealth]
  implicit val stateFormats: Format[TeamState] = Json.format[TeamState]

  val room1Format: OFormat[(Boolean, String, String, JsNumber, JsNumber, JsNumber, Boolean,
    RoomHealth, List[JsNumber], JsNumber, JsNumber, List[JsNumber],
    List[JsNumber], String, TeamState)] = {
    (
      (JsPath \ "emergencyDone").format[Boolean] and
        (JsPath \ "type").format[String] and
        (JsPath \ "class").format[String] and
        (JsPath \ "mergeLevel").format[JsNumber] and
        (JsPath \ "row").format[JsNumber] and
        (JsPath \ "col").format[JsNumber] and
        (JsPath \ "power").format[Boolean] and
        (JsPath \ "roomHealth").format[RoomHealth] and
        (JsPath \ "mrHandyList").format[List[JsNumber]] and
        (JsPath \ "rushTask").format[JsNumber] and
        (JsPath \ "level").format[JsNumber] and
        (JsPath \ "dwellers").format[List[JsNumber]] and
        (JsPath \ "deadDwellers").format[List[JsNumber]] and
        (JsPath \ "currentStateName").format[String] and
        (JsPath \ "currentState").format[TeamState]
      ).tupled
  }

    val room2Format: OFormat[(JsNumber, String, Boolean, Boolean, Option[Boolean], Option[Boolean], Option[Resource], Option[JsNumber], Option[Boolean])] = {
      (
        (JsPath \ "deserializeID").format[JsNumber] and
        (JsPath \ "assignedDecoration").format[String] and
        (JsPath \ "roomVisibility").format[Boolean] and
        (JsPath \ "roomOutline").format[Boolean] and
        (JsPath \ "broken").formatNullable[Boolean] and
        (JsPath \ "withHole").formatNullable[Boolean] and
        (JsPath \ "storage").formatNullable[Resource] and
        (JsPath \ "numberOfProductionCycle").formatNullable[JsNumber] and
        (JsPath \ "ExperienceRewardIsDirty").formatNullable[Boolean]
      ).tupled
    }

    implicit val roomFormat: Format[Room] =
      (room1Format and room2Format).apply(
        {
          case((emergencyDone, roomType, roomClass, mergeLevel, row, col, power, roomHealth, handyList, rushTask, level, dwellers, deadDwellers, currentStateName, currentState),
          (deserializeId, assignedDecoration, roomVisibility, roomOutline, broken, withHole, storage, numberOfProdCycle, expRewardDirty)) =>
            Room(emergencyDone, roomType, roomClass, mergeLevel, row, col, power, roomHealth, handyList,
              rushTask, level, dwellers, deadDwellers, currentStateName, currentState,deserializeId,
              assignedDecoration, roomVisibility, roomOutline, broken, withHole, storage, numberOfProdCycle,
              expRewardDirty)
        },
        room =>
          (
            (room.emergencyDone, room.`type`, room.`class`, room.mergeLevel, room.row, room.col, room.power, room.roomHealth, room.mrHandyList, room.rushTask, room.level, room.dwellers, room.deadDwellers, room.currentStateName, room.currentState),
              (room.deserializeID, room.assignedDecoration, room.roomVisibility, room.roomOutline, room.broken, room.withHole, room.storage, room.numberOfProductionCycle, room.ExperienceRewardIsDirty)
            )
      )

}
