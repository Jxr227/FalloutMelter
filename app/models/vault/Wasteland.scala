package models.vault

import models.{Dwellers, Inventory}
import play.api.libs.json._
import play.api.libs.functional.syntax._
import Common._

case class Wasteland(state: TeamState)


case class TeamState(name: String)

object Wasteland {
  implicit val themeFormat: Format[Theme] = Json.format[Theme]
  implicit val themesFormat: Format[Themes] = Json.format[Themes]
  implicit val questClueFormat: Format[QuestClue] = Json.format[QuestClue]
  implicit val teamEquipFormat: Format[TeamEquipment] = Json.format[TeamEquipment]
  implicit val stateFormat: Format[TeamState] = Json.format[TeamState]
  implicit val questPerfFormat: Format[QuestPerformance] = Json.format[QuestPerformance]
  implicit val actorFormat: Format[Actor] = Json.format[Actor]
  implicit val initialItemsFormat: Format[InitialItems] = Json.format[InitialItems]
  implicit val wasteFormat: Format[Wasteland] = Json.format[Wasteland]


  val team1Format: OFormat[
    (List[JsNumber], JsNumber, JsNumber, JsNumber, JsNumber, String, String, List[String], JsNumber,
      JsNumber, JsNumber, JsNumber, Boolean, Boolean, Boolean, Boolean, Boolean)
    ] = {
    (
      (JsPath \ "dwellers").format[List[JsNumber]] and
        (JsPath \ "returnTripDuration").format[JsNumber] and
        (JsPath \ "elapsedTimeAliveExploring").format[JsNumber] and
        (JsPath \ "elapsedReturningTime").format[JsNumber] and
        (JsPath \ "teamIndex").format[JsNumber] and
        (JsPath \ "teamType").format[String] and
        (JsPath \ "status").format[String] and
        (JsPath \ "logs").format[List[String]] and
        (JsPath \ "missedEncounters").format[JsNumber] and
        (JsPath \ "introMessages").format[JsNumber] and
        (JsPath \ "notificationID").format[JsNumber] and
        (JsPath \ "notificationQuestArrivalID").format[JsNumber] and
        (JsPath \ "isForceReturningToVault").format[Boolean] and
        (JsPath \ "isSkippingTime").format[Boolean] and
        (JsPath \ "isDoingQuest").format[Boolean] and
        (JsPath \ "questSucceeded").format[Boolean] and
        (JsPath \ "questDone").format[Boolean]
      ).tupled
  }

    val team2Format: OFormat[(TeamEquipment, JsNumber, JsNumber, QuestPerformance, List[Actor], List[InitialItems], JsNumber, JsNumber, List[String])] = {
      ((JsPath \ "teamEquipment").format[TeamEquipment] and
      (JsPath \ "questteamQuestSeed").format[JsNumber] and
      (JsPath \ "retryCount").format[JsNumber] and
      (JsPath \ "questOverallPerformance").format[QuestPerformance] and
      (JsPath \ "actors").format[List[Actor]] and
      (JsPath \ "initialItems").format[List[InitialItems]] and
      (JsPath \ "postQuestStimpakDifference").format[JsNumber] and
      (JsPath \ "postQuestRadawayDifference").format[JsNumber] and
      (JsPath \ "initialRadDamage").format[List[String]]).tupled
    }

    
    implicit val teamFormat: Format[Team] = {
      (team1Format and team2Format).apply(
        {
          case(
            (dwellers, returnTripDuration, elapsedTimeAliveExploring, elapsedReturningTime, teamIndex, teamType, status, logs, missedEncounters,
            introMessages, notificationID, notificationQuestArrivalID, isForceReturningToVault, isSkippingTime, isDoingQuest, questSucceeded, questDone),
            (teamEquipment, questteamQuestSeed, retryCount, questOverallPerformance, actors, initialItems, postQuestStimpakDifference, postQuestRadawayDifference, initialRadDamage)
            ) =>
            Team(dwellers, returnTripDuration, elapsedTimeAliveExploring, elapsedReturningTime, teamIndex, teamType, status, logs, missedEncounters,
              introMessages, notificationID, notificationQuestArrivalID, isForceReturningToVault, isSkippingTime, isDoingQuest, questSucceeded, questDone,
              teamEquipment, questteamQuestSeed, retryCount, questOverallPerformance, actors, initialItems, postQuestStimpakDifference, postQuestRadawayDifference,
              initialRadDamage)
        },
        team =>
          {
            (
              (team.dwellers, team.returnTripDuration, team.elapsedTimeAliveExploring, team.elapsedReturningTime, team.teamIndex, team.teamType, team.status, team.logs, team.missedEncounters,
                team.introMessages, team.notificationID, team.notificationQuestArrivalID, team.isForceReturningToVault, team.isSkippingTime, team.isDoingQuest, team.questSucceeded, team.questDone),
              (team.teamEquipment, team.questteamQuestSeed, team.retryCount, team.questOverallPerformance, team.actors, team.initialItems, team.postQuestStimpakDifference, team.postQuestRadawayDifference, team.initialRadDamage)
            )
          }
      )
    }
  }


case class Team(
                 dwellers: List[JsNumber],
                 returnTripDuration: JsNumber,
                 elapsedTimeAliveExploring: JsNumber,
                 elapsedReturningTime: JsNumber,
                 teamIndex: JsNumber,
                 teamType: String,
                 status: String,
                 logs: List[String],
                 missedEncounters: JsNumber,
                 introMessages: JsNumber,
                 notificationID: JsNumber,
                 notificationQuestArrivalID: JsNumber,
                 isForceReturningToVault: Boolean,
                 isSkippingTime: Boolean,
                 isDoingQuest: Boolean,
                 questSucceeded: Boolean,
                 questDone: Boolean,
                 teamEquipment: TeamEquipment,
                 questteamQuestSeed: JsNumber,
                 retryCount: JsNumber,
                 questOverallPerformance: QuestPerformance,
                 actors: List[Actor],
                 initialItems: List[InitialItems],
                 postQuestStimpakDifference: JsNumber,
                 postQuestRadawayDifference: JsNumber,
                 initialRadDamage: List[String]
               )

case class TeamEquipment(storage: Resource, inventory: Inventory, dwellers: List[String], questClues: List[QuestClue], collectedThemes: Themes)

case class QuestClue(clue: String)

case class Themes(themeList: List[Theme])

case class Theme(theme: String)

case class QuestPerformance(numberCombatsWon: JsNumber, numberCriticalHitsPerformed: JsNumber, numberPerfectCriticalHitsPerformed: JsNumber, numberContainersCollected: JsNumber,
                            numberCapsCollected: JsNumber, numberLevelsGained: JsNumber, numberLevelsGainedWithBonus: JsNumber)

case class Actor(actor: String)

case class InitialItems(initWeapon: String, initOutfit: String, initPet: String)

