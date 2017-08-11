package models.vault

import play.api.libs.json.{Format, JsNumber, Json}

object Common {

  implicit val resourcesFormats: Format[Resources] = Json.format[Resources]
  implicit val resourceFormats: Format[Resource] = Json.format[Resource]

}

case class Resource(resources: Resources, bonus: Resources)

case class Resources(Nuka: JsNumber, Food: JsNumber, Energy: JsNumber, Water: JsNumber, StimPack: JsNumber, RadAway: JsNumber,
                     Lunchbox: JsNumber, MrHandy: JsNumber, PetCarrier: JsNumber, CraftedOutfit: JsNumber, CraftedWeapon: JsNumber,
                     NukaColaQuantum: JsNumber, CraftedTheme: JsNumber)