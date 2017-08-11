package models

import models.vault.Room
import org.scalatest.FlatSpec
import play.api.libs.json.Json

class RoomSpec extends FlatSpec {
  "Room" should "convert to model" in {
    val roomjson = Json.parse(
      """
        |   {
        |          "emergencyDone": false,
        |          "type": "Elevator",
        |          "class": "Utility",
        |          "mergeLevel": 1,
        |          "row": 1,
        |          "col": 0,
        |          "power": true,
        |          "roomHealth": {
        |            "damageValue": 0.00,
        |            "initialValue": 0.00
        |          },
        |          "mrHandyList": [],
        |          "rushTask": -1,
        |          "level": 1,
        |          "dwellers": [],
        |          "deadDwellers": [],
        |          "currentStateName": "Idle",
        |          "currentState": {},
        |          "deserializeID": 2029,
        |          "assignedDecoration": "",
        |          "roomVisibility": false,
        |          "roomOutline": false,
        |          "withHole": false
        |        }
      """.stripMargin)
    println(roomjson.as[Room])
  }
}
