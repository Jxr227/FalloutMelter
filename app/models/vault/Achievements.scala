package models.vault

import play.api.libs.json.{Format, Json}

object Achievements {
  implicit val formats: Format[Achievements] = Json.format[Achievements]
}

case class Achievements(objectivesInProgress: List[Objective], completed: List[String])
