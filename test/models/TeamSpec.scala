package models

import models.vault.Team
import models.vault.Wasteland._
import org.scalatest.FlatSpec
import play.api.libs.json.Json

class TeamSpec extends FlatSpec {
  "team" should "convert to model" in {
    println(json.as[Team])
  }


  val json = Json.parse(
    """
      |{
      |            "dwellers": [
      |              16
      |            ],
      |            "returnTripDuration": 0.00,
      |            "elapsedTimeAliveExploring": 174,
      |            "elapsedReturningTime": 0,
      |            "teamIndex": 0,
      |            "teamType": "Explore",
      |            "status": "Exploring",
      |            "logs": [
      |              "0000@l2W",
      |              "0000@l48",
      |              "0001@lh#ls",
      |              "0001@lt",
      |              "0001@lu",
      |              "0001@l2a#s35",
      |              "0002@l1Z#l1e",
      |              "0002@l1j"
      |            ],
      |            "missedEncounters": 0,
      |            "introMessages": 1,
      |            "notificationID": -1,
      |            "notificationQuestArrivalID": -1,
      |            "isForceReturningToVault": true,
      |            "isSkippingTime": false,
      |            "isDoingQuest": false,
      |            "questSucceeded": false,
      |            "questDone": false,
      |            "teamEquipment": {
      |              "storage": {
      |                "resources": {
      |                  "Nuka": 0.00,
      |                  "Food": 0.00,
      |                  "Energy": 0.00,
      |                  "Water": 0.00,
      |                  "StimPack": 25.00,
      |                  "RadAway": 25.00,
      |                  "Lunchbox": 0.00,
      |                  "MrHandy": 0.00,
      |                  "PetCarrier": 0.00,
      |                  "CraftedOutfit": 0.00,
      |                  "CraftedWeapon": 0.00,
      |                  "NukaColaQuantum": 0.00,
      |                  "CraftedTheme": 0.00
      |                },
      |                "bonus": {
      |                  "Nuka": 0.00,
      |                  "Food": 0.00,
      |                  "Energy": 0.00,
      |                  "Water": 0.00,
      |                  "StimPack": 0.00,
      |                  "RadAway": 0.00,
      |                  "Lunchbox": 0.00,
      |                  "MrHandy": 0.00,
      |                  "PetCarrier": 0.00,
      |                  "CraftedOutfit": 0.00,
      |                  "CraftedWeapon": 0.00,
      |                  "NukaColaQuantum": 0.00,
      |                  "CraftedTheme": 0.00
      |                }
      |              },
      |              "inventory": {
      |                "items": []
      |              },
      |              "dwellers": [],
      |              "questClues": [],
      |              "collectedThemes": {
      |                "themeList": []
      |              }
      |            },
      |            "questteamQuestSeed": -1,
      |            "retryCount": 0,
      |            "questOverallPerformance": {
      |              "numberCombatsWon": 0,
      |              "numberCriticalHitsPerformed": 0,
      |              "numberPerfectCriticalHitsPerformed": 0,
      |              "numberContainersCollected": 0,
      |              "numberCapsCollected": 0,
      |              "numberLevelsGained": 0,
      |              "numberLevelsGainedWithBonus": 0
      |            },
      |            "actors": [],
      |            "initialItems": [
      |              {
      |                "initWeapon": "Fatman_Mirv",
      |                "initOutfit": "EngineerSpecial",
      |                "initPet": "pallascat_r"
      |              }
      |            ],
      |            "postQuestStimpakDifference": 0,
      |            "postQuestRadawayDifference": 0,
      |            "initialRadDamage": []
      |          }
    """.stripMargin)
}
