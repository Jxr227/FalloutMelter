package models

import play.api.libs.json.{JsNumber, Json}

case class Dwellers(
                     dwellers: String,
                     actors: String,
                     id: JsNumber,
                     mrhId: JsNumber,
                     min_happiness: JsNumber
                   )

object Dwellers{
  implicit val dwellersFormat = Json.format[Dwellers]
}
