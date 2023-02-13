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
import xyz.qwewqa.relive.simulator.core.presets.dress.generated.dress3050013
import xyz.qwewqa.relive.simulator.core.stage.Act
import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.CountableBuff
import xyz.qwewqa.relive.simulator.core.stage.dress.DressCategory
import xyz.qwewqa.relive.simulator.core.stage.autoskill.new
import xyz.qwewqa.relive.simulator.core.stage.dress.blueprint
import xyz.qwewqa.relive.simulator.core.stage.buff.*
import xyz.qwewqa.relive.simulator.core.stage.passive.*
import xyz.qwewqa.relive.simulator.core.stage.stageeffect.*

val dress = dress3050013(
    name = "カラミティ・キング",
    acts = listOf(
        ActType.Act1.blueprint("激化の斬撃") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 前から3体の敵役
                  hit_rate1: 100
                  values1: [91, 95, 99, 104, 109]
                  times1: 1
                */
            }
        },
        ActType.Act2.blueprint("夕闇の地平線") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 敵役全体
                  hit_rate1: 100
                  values1: [54, 56, 59, 62, 64]
                  times1: 2
                スタン (解除不可)
                  target: 敵役全体
                  hit_rate2: 75
                  values2: [0, 0, 0, 0, 0]
                  times2: [2, 2, 2, 2, 2]
                */
            }
        },
        ActType.Act3.blueprint("夕暮れの空") {
            Act {
                /*
                継続マイナス効果解除
                  target: 味方全体
                  hit_rate1: 100
                  values1: [0, 0, 0, 0, 0]
                  times1: [0, 0, 0, 0, 0]
                継続プラス効果解除
                  target: 敵役全体
                  hit_rate2: 100
                  values2: [0, 0, 0, 0, 0]
                  times2: [0, 0, 0, 0, 0]
                %attr%属性攻撃(威力%value%)
                  target: 敵役全体
                  hit_rate3: 100
                  values3: [84, 88, 92, 97, 101]
                  times3: 2
                */
            }
        },
        ActType.ClimaxAct.blueprint("黄昏の用心棒") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 敵役全体
                  hit_rate1: 100
                  values1: [200, 210, 220, 230, 240]
                  times1: 5

                field_effects:
                  希望の荒野 (value: 1, time: 6, target: allies)
                */
            }
        }
    ),
    autoSkills = listOf(
        listOf(
        /*
        auto skill 1:
          AP減少
            target: 味方のフロンティア芸術学校
            hit_rate: 100
            value: 0
            time: 1
        */
        ),
        listOf(
        /*
        auto skill 2:
          キラめき回復(%value%)
            target: 味方のフロンティア芸術学校
            hit_rate: 100
            value: 10
            time: 0
        */
        ),
        listOf(
        /*
        auto skill 3:
          最大HPアップ(%value%)
            target: 味方のフロンティア芸術学校
            values: [100, 100, 100, 100, 100]
        */
        ),
    ),
    unitSkill = null /* 立ち位置後の舞台少女のACTパワーアップ %opt1_value%%(MAX30%) クリティカル威力アップ %opt2_value%%(MAX30%) */,
    multipleCA = false,
    categories = setOf(),
)
*/

val dress3050013 = PartialDressBlueprint(
  id = 3050013,
  name = "カラミティ・キング",
  baseRarity = 4,
  cost = 13,
  character = Character.Shizuha,
  attribute = Attribute.Snow,
  damageType = DamageType.Special,
  position = Position.Back,
  positionValue = 33050,
  stats = StatData(
    hp = 1134,
    actPower = 260,
    normalDefense = 76,
    specialDefense = 113,
    agility = 217,
    dexterity = 5,
    critical = 50,
    accuracy = 0,
    evasion = 0,
  ),
  growthStats = StatData(
    hp = 37360,
    actPower = 4300,
    normalDefense = 1260,
    specialDefense = 1860,
    agility = 3580,
  ),
  actParameters = mapOf(
    ActType.Act1 to ActBlueprint(
      name = "激化の斬撃",
      type = ActType.Act1,
      apCost = 2,
      icon = 1,
      parameters = listOf(
        actParameters143,
        actParameters1,
        actParameters1,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.Act2 to ActBlueprint(
      name = "夕闇の地平線",
      type = ActType.Act2,
      apCost = 2,
      icon = 57,
      parameters = listOf(
        actParameters56,
        actParameters198,
        actParameters1,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.Act3 to ActBlueprint(
      name = "夕暮れの空",
      type = ActType.Act3,
      apCost = 2,
      icon = 10005,
      parameters = listOf(
        actParameters30,
        actParameters30,
        actParameters46,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.ClimaxAct to ActBlueprint(
      name = "黄昏の用心棒",
      type = ActType.ClimaxAct,
      apCost = 2,
      icon = 1019,
      parameters = listOf(
        actParameters54,
        actParameters1,
        actParameters1,
        actParameters1,
        actParameters1,
      ),
    ),
  ),
  autoSkillRanks = listOf(1, 4, 9, null),
  autoSkillPanels = listOf(0, 0, 5, 0),
  rankPanels = growthBoard4,
  friendshipPanels = friendshipPattern0,
  remakeParameters = listOf(
    StatData(
      hp = 6300,
      actPower = 390,
      normalDefense = 90,
      specialDefense = 390,
      agility = 240,
    ),
    StatData(
      hp = 10500,
      actPower = 650,
      normalDefense = 150,
      specialDefense = 650,
      agility = 400,
    ),
    StatData(
      hp = 16800,
      actPower = 1040,
      normalDefense = 240,
      specialDefense = 1040,
      agility = 640,
    ),
    StatData(
      hp = 21000,
      actPower = 1300,
      normalDefense = 300,
      specialDefense = 1300,
      agility = 800,
    ),
  ),
)
