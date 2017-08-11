package models

import java.math.MathContext

import org.scalatest.FlatSpec
import play.api.libs.json.{JsNumber, Json}

import scala.math.BigDecimal.RoundingMode

class DwellerSpec extends FlatSpec {
  "Dweller" should "convert to json" in {
//    val validDweller = Dweller(JsNumber(43), "Abraham", "Washington", Happiness(JsNumber(99.36)), Health(JsNumber(BigDecimal(644.00)), JsNumber(0.00), false, JsNumber(50), JsNumber(644.00)), Experience(JsNumber(2916000.00), JsNumber(50), JsNumber(0), JsNumber(0), false, JsNumber(0)), Relations(List(), JsNumber(-1),JsNumber(-1), List(JsNumber(-1),JsNumber(-1),JsNumber(-1),JsNumber(-1),JsNumber(-1),JsNumber(-1))), JsNumber(2),
//      StatsList(List(Stats(JsNumber(10),JsNumber(0),JsNumber(0.00)), Stats(JsNumber(10),JsNumber(0),JsNumber(3600.00)), Stats(JsNumber(10),JsNumber(0),JsNumber(302400.00)), Stats(JsNumber(10),JsNumber(0),JsNumber(126000.00)), Stats(JsNumber(10),JsNumber(0),JsNumber(126000.00)), Stats(JsNumber(10),JsNumber(2),JsNumber(302400.00)), Stats(JsNumber(10),JsNumber(2),JsNumber(36000.00)), Stats(JsNumber(10),JsNumber(2),JsNumber(126000.00)))),
//      false, false, false, false, false, false, false, JsNumber(BigDecimal("4294899917")), JsNumber(BigDecimal("4294901502")), JsNumber(BigDecimal("4294901502")), JsNumber(BigDecimal("0")), "L_Abraham Washington", "18", "wrinkles",
//      EquipedOutfit("AbrahamSpecial", "Outfit", false, false), EquipedOutfit("Rifle_LincolnsRepeater", "Weapon", false, false), JsNumber(2045), JsNumber(-1), "Legendary", JsNumber(-1))
//    println(Json.toJson(validDweller))

    val dwell = Json.parse(
      """
        |{
        |  "serializeId": 43,
        |  "name": "Abraham",
        |  "lastName": "Washington",
        |  "happiness": {
        |    "happinessValue": 99.36
        |  },
        |  "health": {
        |    "healthValue": 644.00,
        |    "radiationValue": 0.00,
        |    "permaDeath": false,
        |    "lastLevelUpdated": 50,
        |    "maxHealth": 644.00
        |  },
        |  "experience": {
        |    "experienceValue": 2916000.00,
        |    "currentLevel": 50,
        |    "storage": 0,
        |    "accum": 0,
        |    "needLvUp": false,
        |    "wastelandExperience": 0
        |  },
        |  "relations": {
        |    "relations": [
        |
        |    ],
        |    "partner": -1,
        |    "lastPartner": -1,
        |    "ascendants": [
        |      -1,
        |      -1,
        |      -1,
        |      -1,
        |      -1,
        |      -1
        |    ]
        |  },
        |  "gender": 2,
        |  "stats": {
        |    "stats": [
        |      {
        |        "value": 10,
        |        "mod": 0,
        |        "exp": 0.00
        |      },
        |      {
        |        "value": 10,
        |        "mod": 0,
        |        "exp": 3600.00
        |      },
        |      {
        |        "value": 10,
        |        "mod": 0,
        |        "exp": 302400.00
        |      },
        |      {
        |        "value": 10,
        |        "mod": 1,
        |        "exp": 126000.00
        |      },
        |      {
        |        "value": 10,
        |        "mod": 0,
        |        "exp": 126000.00
        |      },
        |      {
        |        "value": 10,
        |        "mod": 2,
        |        "exp": 302400.00
        |      },
        |      {
        |        "value": 10,
        |        "mod": 2,
        |        "exp": 36000.00
        |      },
        |      {
        |        "value": 10,
        |        "mod": 2,
        |        "exp": 126000.00
        |      }
        |    ]
        |  },
        |  "pregnant": false,
        |  "babyReady": false,
        |  "assigned": false,
        |  "sawIncident": false,
        |  "WillGoToWasteland": false,
        |  "WillBeEvicted": false,
        |  "IsEvictedWaitingForFollowers": false,
        |  "skinColor": 4294899917,
        |  "hairColor": 4294901502,
        |  "outfitColor": 4283745743,
        |  "pendingExperienceReward": 0,
        |  "uniqueData": "L_Abraham Washington",
        |  "hair": "18",
        |  "faceMask": "wrinkles",
        |  "equipedOutfit": {
        |    "id": "AbrahamSpecial",
        |    "type": "Outfit",
        |    "hasBeenAssigned": false,
        |    "hasRandonWeaponBeenAssigned": false
        |  },
        |  "equipedWeapon": {
        |    "id": "Rifle_LincolnsRepeater",
        |    "type": "Weapon",
        |    "hasBeenAssigned": false,
        |    "hasRandonWeaponBeenAssigned": false
        |  },
        |  "savedRoom": 2045,
        |  "lastChildBorn": -1,
        |  "rarity": "Legendary",
        |  "deathTime": -1
        |}
      """.stripMargin).as[Dweller]
    println(dwell)
    println(Json.toJson(dwell))
    val x = Json.toJson(dwell)
    println((x \\ ""))

//    val validHappiness = Happiness(2)
//    println(Json.toJson(validHappiness))
  }
}
