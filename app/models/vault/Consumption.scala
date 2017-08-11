package models.vault

import play.api.libs.json.{Format, JsNumber, Json}

object Consumption {
  implicit val roomConsumptionFormats: Format[Consumption] = Json.format[Consumption]
}

case class Consumption(taskIdOnline: JsNumber, taskIdShutDown: Option[JsNumber])
