package models.vault

import play.api.libs.json.{Format, JsNumber, Json}

object EmergencyData {
  implicit val emergencyDataFormats: Format[EmergencyData] = Json.format[EmergencyData]
}

case class EmergencyData(active: Boolean, randomEventTaskId: JsNumber)
