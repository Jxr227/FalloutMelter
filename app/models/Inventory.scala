package models

import play.api.libs.json.{Format, JsNumber, Json}

object Inventory{
  implicit val extraDataReads: Format[ExtraData] = Json.format[ExtraData]
  implicit val itemReads: Format[Item] = Json.format[Item]
  implicit val inventoryReads: Format[Inventory] = Json.format[Inventory]
}

case class Inventory(items: List[Item])

case class Item(id: String, `type`: String, hasBeenAssigned: Boolean, hasRandonWeaponBeenAssigned: Boolean, extraData: Option[ExtraData])

case class ExtraData(uniqueName: String, bonus: String, bonusValue: JsNumber)