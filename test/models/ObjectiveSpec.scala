package models

import models.vault.Objective._
import models.vault.{Objective, Requirement}
import org.scalatest.FlatSpec
import play.api.libs.json.Json

class ObjectiveSpec extends FlatSpec {
  "requirement" should "work" in {
    val x = Json.parse(
      """
        |              {
        |                "requirementID": "rush_success_01",
        |                "satisfied": false,
        |                "rushCount": 27
        |              }
      """.stripMargin)
    println(x.as[Requirement])
    println(Json.toJson(x.as[Requirement]))
  }

  "objective" should "work" in {
    val x = Json.parse(
      """
        |[
        |          {
        |            "objectiveID": "rush_success_01",
        |            "requirements": [
        |              {
        |                "requirementID": "rush_success_01",
        |                "satisfied": false,
        |                "rushCount": 27
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "merge_power_01",
        |            "requirements": [
        |              {
        |                "requirementID": "merge_power_01",
        |                "satisfied": true,
        |                "higherMergeLevelFound": 3
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "wasteland_kill_01",
        |            "requirements": [
        |              {
        |                "requirementID": "wasteland_kill_01",
        |                "satisfied": false,
        |                "currentCreatures": 250
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "merge_food_01",
        |            "requirements": [
        |              {
        |                "requirementID": "merge_food_01",
        |                "satisfied": true,
        |                "higherMergeLevelFound": 3
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "merge_water_01",
        |            "requirements": [
        |              {
        |                "requirementID": "merge_water_01",
        |                "satisfied": false,
        |                "higherMergeLevelFound": 0
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "make_baby_01",
        |            "requirements": [
        |              {
        |                "requirementID": "make_baby_01",
        |                "satisfied": false,
        |                "currentBabies": 18
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "upgrade_room_01",
        |            "requirements": [
        |              {
        |                "requirementID": "upgrade_room_01",
        |                "satisfied": true,
        |                "acceptedRoom": 20
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "levelup_dweller_01",
        |            "requirements": [
        |              {
        |                "requirementID": "levelup_dweller_01",
        |                "satisfied": false,
        |                "dweller": 23
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "levelup_dweller_02",
        |            "requirements": [
        |              {
        |                "requirementID": "levelup_dweller_02",
        |                "satisfied": true,
        |                "dweller": 23
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "levelup_dweller_03",
        |            "requirements": [
        |              {
        |                "requirementID": "levelup_dweller_03",
        |                "satisfied": true,
        |                "dweller": 23
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "build_rooms_01",
        |            "requirements": [
        |              {
        |                "requirementID": "build_rooms_01",
        |                "satisfied": true,
        |                "acceptedRoom": 25
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "build_nukacola_01",
        |            "requirements": [
        |              {
        |                "requirementID": "build_nukacola_01",
        |                "satisfied": true,
        |                "acceptedRoom": 1
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "build_rooms_02",
        |            "requirements": [
        |              {
        |                "requirementID": "build_rooms_02",
        |                "satisfied": true,
        |                "acceptedRoom": 50
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "stop_raider_01",
        |            "requirements": [
        |              {
        |                "requirementID": "stop_raider_01",
        |                "satisfied": false,
        |                "currentInvasions": 9
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "build_each_rooms_01",
        |            "requirements": [
        |              {
        |                "requirementID": "build_each_rooms_01_casino",
        |                "satisfied": true,
        |                "acceptedRoom": 9
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_storage",
        |                "satisfied": true,
        |                "acceptedRoom": 45
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_nukeCola",
        |                "satisfied": true,
        |                "acceptedRoom": 8
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_superRoom2",
        |                "satisfied": true,
        |                "acceptedRoom": 12
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_hydroponic",
        |                "satisfied": true,
        |                "acceptedRoom": 8
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_scienceLab",
        |                "satisfied": true,
        |                "acceptedRoom": 7
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_medBay",
        |                "satisfied": true,
        |                "acceptedRoom": 24
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_classroom",
        |                "satisfied": true,
        |                "acceptedRoom": 4
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_armory",
        |                "satisfied": true,
        |                "acceptedRoom": 8
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_radio",
        |                "satisfied": true,
        |                "acceptedRoom": 6
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_water2",
        |                "satisfied": true,
        |                "acceptedRoom": 8
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_energy2",
        |                "satisfied": true,
        |                "acceptedRoom": 37
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_gym",
        |                "satisfied": true,
        |                "acceptedRoom": 12
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_bar",
        |                "satisfied": true,
        |                "acceptedRoom": 9
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_dojo",
        |                "satisfied": true,
        |                "acceptedRoom": 5
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_livingquarters",
        |                "satisfied": true,
        |                "acceptedRoom": 26
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_geothermal",
        |                "satisfied": true,
        |                "acceptedRoom": 24
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_cafeteria",
        |                "satisfied": true,
        |                "acceptedRoom": 10
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_waterplant",
        |                "satisfied": true,
        |                "acceptedRoom": 18
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_overseer",
        |                "satisfied": true,
        |                "acceptedRoom": 3
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_weaponfactory",
        |                "satisfied": true,
        |                "acceptedRoom": 2
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_outfitfactory",
        |                "satisfied": true,
        |                "acceptedRoom": 3
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_designfactory",
        |                "satisfied": false,
        |                "acceptedRoom": 0
        |              },
        |              {
        |                "requirementID": "build_each_rooms_01_barbershop",
        |                "satisfied": true,
        |                "acceptedRoom": 1
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "completed_objectives_01",
        |            "requirements": [
        |              {
        |                "requirementID": "completed_objectives_01",
        |                "satisfied": false,
        |                "numberOfObjectivesCompleted": 36
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "collect_caps_01",
        |            "requirements": [
        |              {
        |                "requirementID": "collect_caps_01",
        |                "satisfied": false,
        |                "nukaCount": 1000.00,
        |                "isAchievement": true
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "collect_caps_02",
        |            "requirements": [
        |              {
        |                "requirementID": "collect_caps_02",
        |                "satisfied": false,
        |                "nukaCount": 10121.00,
        |                "isAchievement": true
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "complete_quests_10",
        |            "requirements": [
        |              {
        |                "requirementID": "complete_quests_10",
        |                "satisfied": false,
        |                "currentNumberQuestsCompleted": 10
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "complete_quests_30",
        |            "requirements": [
        |              {
        |                "requirementID": "complete_quests_30",
        |                "satisfied": false,
        |                "currentNumberQuestsCompleted": 16
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "complete_quests_60",
        |            "requirements": [
        |              {
        |                "requirementID": "complete_quests_60",
        |                "satisfied": false,
        |                "currentNumberQuestsCompleted": 16
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "complete_quests_100",
        |            "requirements": [
        |              {
        |                "requirementID": "complete_quests_100",
        |                "satisfied": false,
        |                "currentNumberQuestsCompleted": 16
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "barbershop_10",
        |            "requirements": [
        |              {
        |                "requirementID": "barbershop_10",
        |                "satisfied": false,
        |                "acceptedRoom": 0
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "craft_10_weapons",
        |            "requirements": [
        |              {
        |                "requirementID": "craft_10_weapons",
        |                "satisfied": false,
        |                "currentNumberItems": 6
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "craft_10_outfits",
        |            "requirements": [
        |              {
        |                "requirementID": "craft_10_outfits",
        |                "satisfied": false,
        |                "currentNumberItems": 0
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "craft_outfit_weapon_theme",
        |            "requirements": [
        |              {
        |                "requirementID": "craft_outfit",
        |                "satisfied": false,
        |                "currentNumberItems": 0
        |              },
        |              {
        |                "requirementID": "craft_weapon",
        |                "satisfied": true,
        |                "currentNumberItems": 6
        |              },
        |              {
        |                "requirementID": "craft_theme",
        |                "satisfied": false,
        |                "currentNumberItems": 0
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "",
        |            "requirements": [
        |              {
        |                "requirementID": "scrap_items_500",
        |                "satisfied": false,
        |                "currentNumberItems": 0
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "collect_theme_all_parts_1",
        |            "requirements": [
        |              {
        |                "requirementID": "collect_theme_all_parts_1",
        |                "satisfied": false,
        |                "currentAllThemeParts": 1
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "collect_theme_all_parts_4",
        |            "requirements": [
        |              {
        |                "requirementID": "collect_theme_all_parts_4",
        |                "satisfied": false,
        |                "currentAllThemeParts": 4
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "quest_dialog_choices_01",
        |            "requirements": [
        |              {
        |                "requirementID": "quest_dialog_choices_01",
        |                "satisfied": false,
        |                "currentNumberQuestDialogChoicesMade": 23
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "craft_themes_8",
        |            "requirements": [
        |              {
        |                "requirementID": "craft_themes_8",
        |                "satisfied": false,
        |                "currentNumberItems": 0
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "kill_on_quests_500",
        |            "requirements": [
        |              {
        |                "requirementID": "kill_on_quests_500",
        |                "satisfied": false,
        |                "currentNumberQuestEnemiesToKill": 394
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "stimpacks_100_radaway_100",
        |            "requirements": [
        |              {
        |                "requirementID": "stimpack_100",
        |                "satisfied": true,
        |                "currentNumberLoot": 108
        |              },
        |              {
        |                "requirementID": "radaway_100",
        |                "satisfied": false,
        |                "currentNumberLoot": 40
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "boss_kill_10",
        |            "requirements": [
        |              {
        |                "requirementID": "boss_kill_10",
        |                "satisfied": false,
        |                "currentNumberQuestEnemiesToKill": 10
        |              }
        |            ],
        |            "completed": true,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "build_rooms_stat",
        |            "requirements": [
        |              {
        |                "requirementID": "build_rooms_stat",
        |                "satisfied": false,
        |                "acceptedRoom": 289
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          },
        |          {
        |            "objectiveID": "collect_caps_stat",
        |            "requirements": [
        |              {
        |                "requirementID": "collect_caps_stat",
        |                "satisfied": false,
        |                "nukaCount": 2101630.00,
        |                "isAchievement": true
        |              }
        |            ],
        |            "completed": false,
        |            "incrementLevel": 0
        |          }
        |        ]
      """.stripMargin)
    println(x.as[List[Objective]])

  }
}
