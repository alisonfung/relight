package xyz.qwewqa.relive.simulator.core.presets.dress.generated

import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.Attribute
import xyz.qwewqa.relive.simulator.core.stage.actor.StatData
import xyz.qwewqa.relive.simulator.core.stage.dress.ActParameters
import xyz.qwewqa.relive.simulator.core.stage.dress.ActBlueprint
import xyz.qwewqa.relive.simulator.core.stage.dress.PartialDressBlueprint
import xyz.qwewqa.relive.simulator.core.stage.dress.StatBoost
import xyz.qwewqa.relive.simulator.core.stage.dress.StatBoostType
import xyz.qwewqa.relive.simulator.stage.character.Character
import xyz.qwewqa.relive.simulator.stage.character.DamageType
import xyz.qwewqa.relive.simulator.stage.character.Position

/*
import xyz.qwewqa.relive.simulator.core.presets.condition.*
import xyz.qwewqa.relive.simulator.core.presets.dress.generated.dress1050009
import xyz.qwewqa.relive.simulator.core.stage.Act
import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.CountableBuff
import xyz.qwewqa.relive.simulator.core.stage.dress.DressCategory
import xyz.qwewqa.relive.simulator.core.stage.autoskill.new
import xyz.qwewqa.relive.simulator.core.stage.dress.blueprint
import xyz.qwewqa.relive.simulator.core.stage.buff.*
import xyz.qwewqa.relive.simulator.core.stage.passive.*
import xyz.qwewqa.relive.simulator.core.stage.stageeffect.*

val dress = dress1050009(
    name = "トリスタン",
    acts = listOf(
        ActType.Act1.blueprint("キラめきの斬撃") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 前から1番目の敵役
                  hit_rate1: 100
                  values1: [93, 98, 102, 107, 112]
                  times1: 1
                キラめき回復(%value%)
                  target: 自身
                  hit_rate2: 100
                  values2: [20, 20, 20, 20, 20]
                  times2: [0, 0, 0, 0, 0]
                */
            }
        },
        ActType.Act2.blueprint("騎士の一撃") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 敵役全体
                  hit_rate1: 100
                  values1: [54, 56, 59, 62, 64]
                  times1: 1
                刻印
                  target: 敵役全体
                  hit_rate2: 50
                  values2: [0, 0, 0, 0, 0]
                  times2: [2, 2, 2, 2, 2]
                */
            }
        },
        ActType.Act3.blueprint("究追の合奏") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: HP割合が低い3体の敵役
                  hit_rate1: 100
                  values1: [97, 102, 106, 111, 116]
                  times1: 2
                */
            }
        },
        ActType.ClimaxAct.blueprint("イゾルデへの想い") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 前から3体の敵役
                  hit_rate1: 100
                  values1: [164, 172, 181, 189, 197]
                  times1: 1
                ACT1封印
                  target: 前から3体の敵役
                  hit_rate2: 100
                  values2: [0, 0, 0, 0, 0]
                  times2: [4, 4, 4, 4, 4]
                */
            }
        }
    ),
    autoSkills = listOf(
        listOf(
        /*
        auto skill 1:
          与ダメージアップ(%value%)
            target: 自身
            values: [5, 6, 6, 7, 8]
        */
        ),
        listOf(
        /*
        auto skill 2:
          キラめき回復(%value%)
            target: 自身
            hit_rate: 100
            value: 10
            time: 0
        */
        ),
        listOf(
        /*
        auto skill 3:
          暗闇耐性アップ(%value%)
            target: 自身
            values: [100, 100, 100, 100, 200]
        */
        ),
    ),
    unitSkill = null /* 風・陽属性の舞台少女のACTパワーアップ %opt1_value%%(MAX15%) クリティカル威力アップ %opt2_value%%(MAX15%) */,
    multipleCA = false,
    categories = setOf(),
)
*/

val dress1050009 = PartialDressBlueprint(
  id = 1050009,
  name = "トリスタン",
  baseRarity = 4,
  cost = 12,
  character = Character.Maya,
  attribute = Attribute.Wind,
  damageType = DamageType.Normal,
  position = Position.Back,
  positionValue = 32050,
  stats = StatData(
    hp = 1207,
    actPower = 234,
    normalDefense = 137,
    specialDefense = 90,
    agility = 186,
    dexterity = 5,
    critical = 50,
    accuracy = 0,
    evasion = 0,
  ),
  growthStats = StatData(
    hp = 39780,
    actPower = 3860,
    normalDefense = 2260,
    specialDefense = 1500,
    agility = 3070,
  ),
  actParameters = mapOf(
    ActType.Act1 to ActBlueprint(
      name = "キラめきの斬撃",
      type = ActType.Act1,
      apCost = 2,
      icon = 89,
      parameters = listOf(
        actParameters2,
        actParameters3,
        actParameters1,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.Act2 to ActBlueprint(
      name = "騎士の一撃",
      type = ActType.Act2,
      apCost = 3,
      icon = 150,
      parameters = listOf(
        actParameters21,
        actParameters29,
        actParameters1,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.Act3 to ActBlueprint(
      name = "究追の合奏",
      type = ActType.Act3,
      apCost = 3,
      icon = 1,
      parameters = listOf(
        actParameters170,
        actParameters1,
        actParameters1,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.ClimaxAct to ActBlueprint(
      name = "イゾルデへの想い",
      type = ActType.ClimaxAct,
      apCost = 2,
      icon = 178,
      parameters = listOf(
        actParameters123,
        actParameters94,
        actParameters1,
        actParameters1,
        actParameters1,
      ),
    ),
  ),
  autoSkillRanks = listOf(1, 4, 9, null),
  autoSkillPanels = listOf(0, 0, 5, 0),
  rankPanels = growthBoard6,
  friendshipPanels = friendshipPattern0,
  remakeParameters = listOf(
    StatData(
      hp = 7500,
      actPower = 330,
      normalDefense = 150,
      specialDefense = 90,
      agility = 210,
    ),
    StatData(
      hp = 12500,
      actPower = 550,
      normalDefense = 250,
      specialDefense = 150,
      agility = 350,
    ),
    StatData(
      hp = 20000,
      actPower = 880,
      normalDefense = 400,
      specialDefense = 240,
      agility = 560,
    ),
    StatData(
      hp = 25000,
      actPower = 1100,
      normalDefense = 500,
      specialDefense = 300,
      agility = 700,
    ),
  ),
)
