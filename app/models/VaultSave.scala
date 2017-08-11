//package models
//
//case class TimeMgr(
//                    gameTime: Double,
//                    questTime: Double,
//                    time: Double,
//                    timeSaveDate: Double,
//                    timeGameBegin: Double
//                  )
//case class LocalNotificationMgr(
//                                 UniqueIDS: List[UniqueIDS]
//                               )
//case class Tasks(
//                  startTime: Double,
//                  endTime: Double,
//                  id: Double,
//                  paused: Boolean,
//                  rescheduleToOldest: Boolean
//                )
//case class PausedTasks(
//                        startTime: Double,
//                        endTime: Double,
//                        id: Double,
//                        paused: Boolean,
//                        rescheduleToOldest: Boolean,
//                        pausedRemainingTime: Double
//                      )
//case class TaskMgr(
//                    id: Double,
//                    time: Double,
//                    tasks: List[Tasks],
//                    pausedTasks: List[PausedTasks]
//                  )
//case class Ratings(
//                    rating: Double,
//                    time: Double,
//                    collected: Boolean
//                  )
//case class RatingMgr(
//                      sampleId: Double,
//                      dayRatingId: Double,
//                      currentSamples: List[Double],
//                      ratings: List[Ratings],
//                      ratingsLast: List[Ratings],
//                      hasWeekRating: Boolean,
//                      hasLastWeekRating: Boolean,
//                      weekRating: Double,
//                      lastWeekRating: Double
//                    )
//case class ThemeByRoomType(
//
//                          )
//case class ExtraData(
//                      partsCollectedCount: Double,
//                      IsCraftingInProgress: Boolean,
//                      IsCrafted: Boolean,
//                      IsClaimed: Boolean,
//                      IsClaimedInCraftingRoom: Boolean,
//                      IsNew: Boolean
//                    )
//case class Cafeteria_Xmas(
//                           id: String,
//                           `type`: String,
//                           hasBeenAssigned: Boolean,
//                           hasRandonWeaponBeenAssigned: Boolean,
//                           extraData: ExtraData
//                         )
//case class EventsThemes(
//                         Cafeteria_Xmas: Cafeteria_Xmas,
//                         Cafeteria_Halloween: Cafeteria_Xmas,
//                         Cafeteria_ThanksGiving: Cafeteria_Xmas,
//                         LivingQuarters_Xmas: Cafeteria_Xmas,
//                         LivingQuarters_Halloween: Cafeteria_Xmas,
//                         LivingQuarters_ThanksGiving: Cafeteria_Xmas
//                       )
//case class SpecialTheme(
//                         themeByRoomType: ThemeByRoomType,
//                         eventsThemes: EventsThemes,
//                         lastOverallTheme: String
//                       )
//
//
//case class ConstructMgr(
//                         roomDeserializeID: Double
//                       )
//case class Resources(
//                      Nuka: Double,
//                      Food: Double,
//                      Energy: Double,
//                      Water: Double,
//                      StimPack: Double,
//                      RadAway: Double,
//                      Lunchbox: Double,
//                      MrHandy: Double,
//                      PetCarrier: Double,
//                      CraftedOutfit: Double,
//                      CraftedWeapon: Double,
//                      NukaColaQuantum: Double,
//                      CraftedTheme: Double
//                    )
//case class Storage(
//                    resources: Resources,
//                    bonus: Resources
//                  )
//case class Inventory(
//                      items: String
//                    )
//case class EmergencyData(
//                          active: Boolean,
//                          randomEventTaskId: Double
//                        )
//case class RoomConsumption(
//                            taskIdOnline: Double,
//                            taskIDShutDown: Double
//                          )
//case class DwellerWaterConsumption(
//                                    taskIdOnline: Double
//                                  )
//case class Requirements(
//                         requirementID: String,
//                         satisfied: Boolean,
//                         rushCount: Double
//                       )
//case class ObjectivesInProgress(
//                                 objectiveID: String,
//                                 requirements: List[Requirements],
//                                 completed: Boolean,
//                                 incrementLevel: Double
//                               )
//case class Achievements(
//                         objectivesInProgress: List[ObjectivesInProgress],
//                         completed: List[String]
//                       )
//case class State(
//                  name: String
//                )
//case class CollectedThemes(
//                            themeList: List[ThemeList]
//                          )
//case class TeamEquipment(
//                          storage: Storage,
//                          inventory: Inventory,
//                          dwellers: List[Dwellers],
//                          questClues: List[QuestClues],
//                          collectedThemes: CollectedThemes
//                        )
//case class QuestOverallPerformance(
//                                    numberCombatsWon: Double,
//                                    numberCriticalHitsPerformed: Double,
//                                    numberPerfectCriticalHitsPerformed: Double,
//                                    numberContainersCollected: Double,
//                                    numberCapsCollected: Double,
//                                    numberLevelsGained: Double,
//                                    numberLevelsGainedWithBonus: Double
//                                  )
//case class InitialItems(
//                         initWeapon: String,
//                         initOutfit: String,
//                         initPet: String
//                       )
//case class Teams(
//                  dwellers: List[Double],
//                  returnTripDuration: Double,
//                  elapsedTimeAliveExploring: Double,
//                  elapsedReturningTime: Double,
//                  teamIndex: Double,
//                  teamType: String,
//                  status: String,
//                  logs: List[String],
//                  missedEncounters: Double,
//                  introMessages: Double,
//                  notificationID: Double,
//                  notificationQuestArrivalID: Double,
//                  isForceReturningToVault: Boolean,
//                  isSkippingTime: Boolean,
//                  isDoingQuest: Boolean,
//                  questSucceeded: Boolean,
//                  questDone: Boolean,
//                  teamEquipment: TeamEquipment,
//                  questteamQuestSeed: Double,
//                  retryCount: Double,
//                  questOverallPerformance: QuestOverallPerformance,
//                  actors: List[Actors],
//                  initialItems: List[InitialItems],
//                  postQuestStimpakDifference: Double,
//                  postQuestRadawayDifference: Double,
//                  initialRadDamage: List[InitialRadDamage]
//                )
//case class MrHandyCycles(
//                          cycleType: String,
//                          taskId: Double
//                        )
//case class Wasteland(
//                      state: State,
//                      teams: List[Teams],
//                      cycles: String,
//                      mrHandyCycles: List[MrHandyCycles],
//                      questCycles: List[QuestCycles],
//                      allTimeTeamsCounter: Double,
//                      lastSurpriseQuest: String,
//                      lastSurprisePopupTime: Double
//                    )
//case class Vault(
//                  rocks: List[Rocks],
//                  rooms: String,
//                  storage: Storage,
//                  inventory: Inventory,
//                  emergencyData: EmergencyData,
//                  roomConsumption: RoomConsumption,
//                  dwellerWaterConsumption: DwellerWaterConsumption,
//                  dwellerFoodConsumption: DwellerWaterConsumption,
//                  lunchboxRandomGenerator: String,
//                  LunchBoxesByType: List[Double],
//                  LunchBoxesCount: Double,
//                  VaultName: String,
//                  VaultMode: String,
//                  VaultTheme: Double,
//                  Achievements: Achievements,
//                  wasteland: Wasteland
//                )
//case class DwellerSpawner(
//                           dwellersWaiting: List[DwellersWaiting]
//                         )
//case class TutorialManager(
//                            phase: String,
//                            taskNumber: Double,
//                            objectivesTutorialMessage: Boolean,
//                            lunchboxTutorialMessage: Boolean,
//                            showingObjectiveTutorialMessage: Boolean,
//                            showingLunchboxTutorialMessage: Boolean,
//                            showWastelandMessageTime: Double,
//                            showExploreWastelandMessageTime: Double,
//                            exploreWastelandMessageShown: Boolean,
//                            skippedTutorial: Double,
//                            questTutorialCompleted: Double,
//                            intialTimerTasks: List[IntialTimerTasks],
//                            ContextualVaultTecObjectives: Boolean,
//                            ContextualAddFriends: Boolean,
//                            ContextualWasteland: Boolean,
//                            ContextualRadioRoom: Boolean,
//                            ContextualWeaponsAndOutfits: Boolean,
//                            ContextualTrainDweller: Boolean,
//                            ContextualBabies: Boolean,
//                            ContextualDestroyRocks: Boolean,
//                            ContextualStorage: Boolean,
//                            ContextualNoRoomForDwellers: Boolean,
//                            ContextualUnequipedDweller: Boolean,
//                            ContextualBuildAnElevator: Boolean,
//                            ContextualDestroyRockToBuild: Boolean,
//                            ContextualNoBuildZonesAvailableByRock: Boolean,
//                            ContextualDestroyRockToAccessNextFloor: Boolean,
//                            ContextualResourcesAlert: Boolean,
//                            ContextualIncidentOcurs: Boolean,
//                            ContextualLowPowerAlert: Boolean,
//                            ContextualStorageFull: Boolean,
//                            ContextualMergeOrUpgradeRoom: Boolean,
//                            ContextualWastelandMessage: Boolean,
//                            ContextualObjectivesCompleted: Boolean,
//                            ContextualBabiesTutorial: Boolean,
//                            ContextualStimpackMessage: Boolean,
//                            ContextualLunchboxTutorial: Boolean,
//                            ContextualRadwayMessage: Boolean,
//                            ContextualRoomMerge2: Boolean,
//                            ContextualRoomMerge3: Boolean,
//                            ContextualStorage2: Boolean,
//                            ContextualEquippingItemsWeapon: Boolean,
//                            ContextualLuck: Boolean,
//                            ContextualEquppingItemsPet: Boolean,
//                            ContextualCrafting: Boolean,
//                            ContextualDecorations: Boolean,
//                            ContextualRequestJunk: Boolean,
//                            ContextualJunk: Boolean,
//                            ContextualTriggeredBirth: Boolean,
//                            ContextualInventoryFull: Boolean,
//                            ContextualInventoryFullWindow: Boolean,
//                            ContextualJunkGiveAway: Boolean,
//                            ContextualScrapping: Boolean,
//                            ContextualAssignWith3DTouch: Boolean,
//                            ContextualNukaQuantum: Boolean,
//                            ContextualSurpriseQuests: Boolean,
//                            ContextualReturningFromQuests: Boolean,
//                            ContextualRadioRoomToggle: Boolean,
//                            ContextualCraftTheme: Boolean,
//                            ContextualJoystickNavigationInVault: Boolean,
//                            MaleTasksQuant: Double,
//                            FemaleTasksQuant: Double
//                          )
//case class SlotArray(
//                      objective: ObjectivesInProgress,
//                      incLevel: Double,
//                      lottery: List[Boolean]
//                    )
//case class ObjectiveMgr(
//                         taskID: Double,
//                         canDiscard: Boolean,
//                         nukaQuantumIncrement: Double,
//                         shuffleBags: String,
//                         slotArray: List[SlotArray]
//                       )
//case class UnlockableMgr(
//                          objectivesInProgress: List[ObjectivesInProgress],
//                          completed: List[Completed],
//                          claimed: List[String]
//                        )
//case class SurvivalW(
//                      weapons: List[String],
//                      outfits: List[String],
//                      dwellers: List[String],
//                      pets: List[String],
//                      breeds: List[String],
//                      decorations: List[Decorations],
//                      junk: List[String],
//                      recipes: List[String],
//                      claimedRecipes: List[String],
//                      collectedThemes: CollectedThemes
//                    )
//case class ShopWindow(
//                       isStarterPackPurchased: Boolean,
//                       hasStarterPackPopupShown: Boolean
//                     )
//case class Room1626(
//                     `type`: Double,
//                     rh: Double,
//                     in: Boolean,
//                     dc: Double
//                   )
//case class Dweller15(
//                      `type`: Double,
//                      rh: Double,
//                      in: Boolean
//                    )
//case class HappinessManager(
//                             room1626: List[Room1626],
//                             room1561: List[Room1626],
//                             room2037: List[Room1626],
//                             room2058: List[Room1626],
//                             room2015: List[Room1626],
//                             room2048: List[Room1626],
//                             room2040: List[Room1626],
//                             room2045: List[Room1626],
//                             room2053: List[Room1626],
//                             room2020: List[Room1626],
//                             room2023: List[Room1626],
//                             room1848: List[Room1626],
//                             room2325: List[Room1626],
//                             room2372: List[Room1626],
//                             room2349: List[Room1626],
//                             room2352: List[Room1626],
//                             room2357: List[Room1626],
//                             room2362: List[Room1626],
//                             room2341: List[Room1626],
//                             room2344: List[Room1626],
//                             room2028: List[Room1626],
//                             room2333: List[Room1626],
//                             room2375: List[Room1626],
//                             room2472: List[Room1626],
//                             room2475: List[Room1626],
//                             room2480: List[Room1626],
//                             room2488: List[Room1626],
//                             room2483: List[Room1626],
//                             room2237: List[Room1626],
//                             rooms: List[Double],
//                             dweller15: List[Dweller15],
//                             dweller21: List[Dweller15],
//                             dweller1: List[Dweller15],
//                             dweller8: List[Dweller15],
//                             dweller59: List[Dweller15],
//                             dweller3: List[Dweller15],
//                             dweller24: List[Dweller15],
//                             dweller20: List[Dweller15],
//                             dweller23: List[Dweller15],
//                             dweller25: List[Dweller15],
//                             dweller22: List[Dweller15],
//                             dweller44: List[Dweller15],
//                             dweller47: List[Dweller15],
//                             dweller48: List[Dweller15],
//                             dweller46: List[Dweller15],
//                             dweller66: List[Dweller15],
//                             dweller82: List[Dweller15],
//                             dweller72: List[Dweller15],
//                             dweller71: List[Dweller15],
//                             dweller81: List[Dweller15],
//                             dweller74: List[Dweller15],
//                             dweller26: List[Dweller15],
//                             dweller83: List[Dweller15],
//                             dweller85: List[Dweller15],
//                             dwellers: List[Double]
//                           )
//case class RefugeeSpawner(
//                           newGameTask: Double,
//                           succeed: Double,
//                           currentPool: String,
//                           collectedAllRefugees: Boolean
//                         )
//case class DeathclawManager(
//                             deathclawTotalExtraChance: Double,
//                             canDeathclawEmergencyOccurs: Boolean,
//                             deathclawCooldownID: Double
//                           )
//case class MysteriousStranger(
//                               currentState: String,
//                               canAppear: Boolean,
//                               timeToAppear: Double,
//                               remainingTimeToAppear: Double
//                             )
//case class VaultData(
//                      collectedRes: Resources,
//                      collectedOutfits: Double,
//                      collectedWeapons: Double,
//                      collectedDecorations: Double,
//                      collectedPets: Double,
//                      raidersKilled: Double,
//                      elevatorRides: Double,
//                      lunchBoxesOpened: Double,
//                      petCarriersOpened: Double,
//                      totalLifetimeDwellers: Double,
//                      babiesBorn: Double,
//                      dwellersRevived: Double,
//                      levelsGained: Double,
//                      specialStatTrained: Double,
//                      takenStimpack: Double,
//                      takenRadaway: Double,
//                      deadDwellers: Double,
//                      evictedDwellers: Double,
//                      soldWeapons: Double,
//                      soldOutfits: Double,
//                      soldDecorations: Double,
//                      soldPets: Double,
//                      scrappedOutfits: Double,
//                      scrappedWeapons: Double,
//                      craftedWeapons: Double,
//                      craftedOutfits: Double,
//                      craftedDecorations: Double,
//                      craftedThemes: Double,
//                      collectedJunk: Double,
//                      soldJunk: Double,
//                      successfulRushes: Double,
//                      failRushes: Double,
//                      firesExtinguised: Double,
//                      emergencyStopRaider: Double,
//                      emergencyStopDeathClaw: Double,
//                      emergencyStopGhoul: Double,
//                      emergencyStopRadroach: Double,
//                      emergencyStopRadscorpion: Double,
//                      emergencyStopMolerat: Double,
//                      dwellersSentWasteland: Double,
//                      wastelandTotalTime: Double,
//                      wastelandCreaturesKilled: Double,
//                      vaultCreatedBeforeUpdate: Boolean,
//                      dwellersCustomized: Double,
//                      measuringSince: Double,
//                      previousVResources: Resources,
//                      weaponFactoryBuilt: Boolean,
//                      outfitFactoryBuilt: Boolean
//                    )
//case class StatsWindow(
//                        vaultData: VaultData
//                      )
//case class BottleAndCappyMgrSerializeKey(
//                                          SerializeAccumulatedTriggerChance: Double,
//                                          SerializeLocked: Boolean
//                                        )
//case class StandaloneQuestPicker(
//                                  currentStandalone: String
//                                )
//case class CurrentDailies(
//                           startDate: String,
//                           endDate: String,
//                           officialStartDate: String,
//                           questName: String
//                         )
//case class DailyQuestPicker(
//                             currentDailies: List[CurrentDailies],
//                             historyDailies: List[CurrentDailies]
//                           )
//case class WeeklyQuestPicker(
//                              currentWeeklies: List[CurrentDailies],
//                              historyWeeklies: List[CurrentDailies]
//                            )
//case class StandaloneQuestSkipper(
//                                   skippedQuests: List[SkippedQuests]
//                                 )
//case class CompletedQuestDataManager(
//                                      taskID: Double,
//                                      completedQuests: List[String],
//                                      foundClues: List[FoundClues],
//                                      standaloneQuestPicker: StandaloneQuestPicker,
//                                      dailyQuestPicker: DailyQuestPicker,
//                                      weeklyQuestPicker: WeeklyQuestPicker,
//                                      nukaQuantumIncrement: Double,
//                                      standaloneQuestSkipper: StandaloneQuestSkipper,
//                                      dailyQuestSkipper: StandaloneQuestSkipper,
//                                      weeklyQuestSkipper: StandaloneQuestSkipper
//                                    )
//case class SwrveEventsManager(
//                               currentIncidentTypeInt: Double,
//                               currentIncidentModeInt: Double,
//                               initialDwellerCount: Double,
//                               deadDwellerCount: Double,
//                               initialFoodAmount: Double,
//                               initialPowerAmount: Double,
//                               initialWaterAmount: Double,
//                               vaultLastSentMsgHour: Double,
//                               alreadyBoughtRooms: List[String],
//                               alreadyUpgradedRoomsLvl2: List[String],
//                               alreadyUpgradedRoomsLvl3: List[String],
//                               hasSentFTBuyAnyRoom: Double,
//                               hasSentFTUpgradeLvl2AnyRoom: Double,
//                               hasSentFTUpgradeLvl3AnyRoom: Double,
//                               hasSentFTMerge2AnyRoom: Double,
//                               hasSentFTMerge3AnyRoom: Double,
//                               hasSentFTBabyFlirt: Double,
//                               hasSentFTBabyMakeBaby: Double,
//                               hasSentFTBabyBorn: Double,
//                               hasSentWastelandFTStartExplore: Double,
//                               hasSentWastelandFTDeadDweller: Double,
//                               hasSentWastelandFTReviveDweller: Double,
//                               hasSentWastelandFTRecall: Double,
//                               hasSentDwellerCount50: Double,
//                               hasSentDwellerCount100: Double,
//                               hasSentDwellerCount150: Double,
//                               hasSentDwellerCount200: Double,
//                               m_alreadyMergedRoomsLvl2: List[String],
//                               m_alreadyMergedRoomsLvl3: List[String]
//                             )
//case class RoomHealth(
//                       damageValue: Double,
//                       initialValue: Double
//                     )
//case class Wasteland(
//                      emergencyDone: Boolean,
//                      `type`: String,
//                      `class`: String,
//                      mergeLevel: Double,
//                      row: Double,
//                      col: Double,
//                      power: Boolean,
//                      roomHealth: RoomHealth,
//                      mrHandyList: List[MrHandyList],
//                      rushTask: Double,
//                      level: Double,
//                      dwellers: List[Dwellers],
//                      deadDwellers: List[DeadDwellers],
//                      currentStateName: String,
//                      currentState: ThemeByRoomType,
//                      deserializeID: Double,
//                      assignedDecoration: String,
//                      roomVisibility: Boolean,
//                      roomOutline: Boolean
//                    )
//case class QuestSetup(
//                       buildingLenght: Double,
//                       buildingHeight: Double,
//                       buildingUnderground: Double,
//                       seed: Double,
//                       entry: Double,
//                       questConstructionMgr: ConstructMgr,
//                       roomList: String,
//                       wasteland: Wasteland,
//                       entranceId: Double
//                     )
//case class Loots(
//                  LootType: Double,
//                  LootID: String,
//                  LootQuantity: Double,
//                  FromVaultQuantity: Double,
//                  InitialEquippedQuantity: Double,
//                  CurrentlyEquippedQuantity: Double
//                )
//
