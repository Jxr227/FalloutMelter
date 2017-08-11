package models

import org.scalatest.FlatSpec
import play.api.libs.json.Json

import scala.io.Source

class InventorySpec extends FlatSpec {

  "inventory" should "convert to model" in {
    println(invenJson.as[Inventory])
  }







  private val invenJson = Json.parse(
    Source.fromFile("conf/resources/LargeInventory.json").mkString
  )
}
