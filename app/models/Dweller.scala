package models

import play.api.libs.functional.syntax._
import play.api.libs.json._

case class Dweller(
                    serializeId: JsNumber,
                    name: String,
                    lastName: String,
                    happiness: Happiness,
                    health: Health,
                    experience: Experience,
                    relations: Relations,
                    gender: JsNumber,
                    stats: StatsList,
                    pregnant: Boolean,
                    babyReady: Boolean,
                    assigned: Boolean,
                    sawIncident: Boolean,
                    WillGoToWasteland: Boolean,
                    WillBeEvicted: Boolean,
                    IsEvictedWaitingForFollowers: Boolean,
                    skinColor: JsNumber,
                    hairColor: JsNumber,
                    outfitColor: JsNumber,
                    pendingExperienceReward: JsNumber,
                    uniqueData: String,
                    hair: String,
                    faceMask: String,
                    equipedOutfit: EquipedOutfit,
                    equipedWeapon: EquipedOutfit,
                    savedRoom: JsNumber,
                    lastChildBorn: JsNumber,
                    rarity: String,
                    deathTime: JsNumber
                  ) {
}

object Dweller {
  implicit val happinessFormat: Format[Happiness] = Json.format[Happiness]
  implicit val healthFormat: Format[Health] = Json.format[Health]
  implicit val experienceFormat: Format[Experience] = Json.format[Experience]
  implicit val relationsFormat: Format[Relations] = Json.format[Relations]
  implicit val statsFormat: Format[Stats] = Json.format[Stats]
  implicit val statsListFormat: Format[StatsList] = Json.format[StatsList]
  implicit val outfitsFormat: Format[EquipedOutfit] = Json.format[EquipedOutfit]

  val dweller1Format: OFormat[
    (JsNumber, String, String, Happiness, Health, Experience, Relations, JsNumber, StatsList, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean)
    ] = {
    (
      (JsPath \ "serializeId").format[JsNumber] and
        (JsPath \ "name").format[String] and
        (JsPath \ "lastName").format[String] and
        (JsPath \ "happiness").format[Happiness] and
        (JsPath \ "health").format[Health] and
        (JsPath \ "experience").format[Experience] and
        (JsPath \ "relations").format[Relations] and
        (JsPath \ "gender").format[JsNumber] and
        (JsPath \ "stats").format[StatsList] and
        (JsPath \ "pregnant").format[Boolean] and
        (JsPath \ "babyReady").format[Boolean] and
        (JsPath \ "assigned").format[Boolean] and
        (JsPath \ "sawIncident").format[Boolean] and
        (JsPath \ "WillGoToWasteland").format[Boolean] and
        (JsPath \ "WillBeEvicted").format[Boolean]
      ).tupled
  }

  val dweller2Format: OFormat[
    (Boolean, JsNumber, JsNumber, JsNumber, JsNumber, String, String, String, EquipedOutfit, EquipedOutfit, JsNumber, JsNumber, String, JsNumber)
    ] = {
    (
      (JsPath \ "IsEvictedWaitingForFollowers").format[Boolean] and
      (JsPath \ "skinColor").format[JsNumber] and
      (JsPath \ "hairColor").format[JsNumber] and
      (JsPath \ "outfitColor").format[JsNumber] and
      (JsPath \ "pendingExperienceReward").format[JsNumber] and
      (JsPath \ "uniqueData").format[String] and
      (JsPath \ "hair").format[String] and
      (JsPath \ "faceMask").format[String] and
      (JsPath \ "equipedOutfit").format[EquipedOutfit] and
      (JsPath \ "equipedWeapon").format[EquipedOutfit] and
      (JsPath \ "savedRoom").format[JsNumber] and
      (JsPath \ "lastChildBorn").format[JsNumber] and
      (JsPath \ "rarity").format[String] and
      (JsPath \ "deathTime").format[JsNumber]
      ).tupled
  }
  
  implicit val dwellerFormats: Format[Dweller] =
    (dweller1Format and dweller2Format).apply(
      {
        case((a,b,c,d,e,f,g,h,i,j,k,l,m,n,o), (p,q,r,s,t,u,v,w,x,y,z,a1,b1,c1)) =>
          Dweller(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,a1,b1,c1)
      }, dweller => ((dweller.serializeId, dweller.name, dweller.lastName, dweller.happiness, dweller.health, dweller.experience, dweller.relations, dweller.gender, dweller.stats, dweller.pregnant, dweller.babyReady,
      dweller.assigned, dweller.sawIncident, dweller.WillGoToWasteland, dweller.WillBeEvicted),(dweller.IsEvictedWaitingForFollowers, dweller.skinColor, dweller.hairColor, dweller.outfitColor,
      dweller.pendingExperienceReward, dweller.uniqueData, dweller.hair, dweller.faceMask, dweller.equipedOutfit, dweller.equipedWeapon, dweller.savedRoom, dweller.lastChildBorn, dweller.rarity, dweller.deathTime))
    )
}


case class Happiness(
                      happinessValue: JsNumber
                    ) {

}

case class Health(
                   healthValue: JsNumber,
                   radiationValue: JsNumber,
                   permaDeath: Boolean,
                   lastLevelUpdated: JsNumber,
                   maxHealth: JsNumber
                 )

case class Experience(
                       experienceValue: JsNumber,
                       currentLevel: JsNumber,
                       storage: JsNumber,
                       accum: JsNumber,
                       needLvUp: Boolean,
                       wastelandExperience: JsNumber
                     )

case class Relations(
                      relations: List[Relations],
                      partner: JsNumber,
                      lastPartner: JsNumber,
                      ascendants: List[JsNumber]
                    )

case class StatsList(
                      stats: List[Stats]
                    )

case class Stats(
                  value: JsNumber,
                  mod: JsNumber,
                  exp: JsNumber
                )

case class EquipedOutfit(
                          id: String,
                          `type`: String,
                          hasBeenAssigned: Boolean,
                          hasRandonWeaponBeenAssigned: Boolean
                        )


object Happiness {
  implicit val happinessFormat = Json.format[Happiness]
}
