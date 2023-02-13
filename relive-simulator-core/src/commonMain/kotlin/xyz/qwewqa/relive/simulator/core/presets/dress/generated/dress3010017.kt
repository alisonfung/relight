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
import xyz.qwewqa.relive.simulator.core.presets.dress.generated.dress3010017
import xyz.qwewqa.relive.simulator.core.stage.Act
import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.CountableBuff
import xyz.qwewqa.relive.simulator.core.stage.dress.DressCategory
import xyz.qwewqa.relive.simulator.core.stage.autoskill.new
import xyz.qwewqa.relive.simulator.core.stage.dress.blueprint
import xyz.qwewqa.relive.simulator.core.stage.buff.*
import xyz.qwewqa.relive.simulator.core.stage.passive.*
import xyz.qwewqa.relive.simulator.core.stage.stageeffect.*

val dress = dress3010017(
    name = "舞台少女",
    acts = listOf(
        ActType.Act1.blueprint("浄化の狙撃") {
            Act {
                /*
                継続マイナス効果解除
                  target: 味方全体
                  hit_rate1: 100
                  values1: [0, 0, 0, 0, 0]
                  times1: [0, 0, 0, 0, 0]
                継続マイナス効果耐性アップ(%value%)
                  target: 味方全体
                  hit_rate2: 100
                  values2: [100, 100, 100, 100, 100]
                  times2: [3, 3, 3, 3, 3]
                %attr%属性攻撃(威力%value%)
                  target: 後ろから1番目の敵役
                  hit_rate3: 100
                  values3: [165, 173, 181, 189, 198]
                  times3: 1
                */
            }
        },
        ActType.Act2.blueprint("雷光の狙撃") {
            Act {
                /*
                継続プラス効果解除
                  target: 後ろから1番目の敵役
                  hit_rate1: 100
                  values1: [0, 0, 0, 0, 0]
                  times1: [0, 0, 0, 0, 0]
                %attr%属性攻撃(威力%value%)
                  target: 後ろから1番目の敵役
                  hit_rate2: 100
                  values2: [165, 173, 181, 189, 198]
                  times2: 1
                キラめき回復(%value%)
                  target: 自身
                  hit_rate3: 100
                  values3: [20, 20, 20, 20, 20]
                  times3: [0, 0, 0, 0, 0]

                field_effects:
                  自縄自縛 (value: 1, time: 2, target: enemies)
                */
            }
        },
        ActType.Act3.blueprint("激励の狙撃") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 後ろから1番目の敵役
                  hit_rate1: 100
                  values1: [165, 173, 181, 189, 198]
                  times1: 1
                AP減少
                  target: 味方全体
                  hit_rate2: 100
                  values2: [0, 0, 0, 0, 0]
                  times2: [2, 2, 2, 2, 2]
                クリティカル威力アップ(%value%)
                  target: 味方全体
                  hit_rate3: 100
                  values3: [20, 22, 24, 27, 30]
                  times3: [3, 3, 3, 3, 3]
                有利属性ダメージアップ(%value%)
                  target: 味方全体
                  hit_rate4: 100
                  values4: [20, 22, 24, 27, 30]
                  times4: [3, 3, 3, 3, 3]
                */
            }
        },
        ActType.ClimaxAct.blueprint("いどめ向かい風すすめフロンティア！") {
            Act {
                /*
                起死回生(%value%) (回復量は対象の最大HPに依存する)
                  target: 自身
                  hit_rate1: 100
                  values1: [50, 50, 50, 50, 50]
                  times1: [2, 2, 2, 2, 2]
                継続プラス効果解除
                  target: 敵役全体
                  hit_rate2: 100
                  values2: [0, 0, 0, 0, 0]
                  times2: [0, 0, 0, 0, 0]
                %attr%属性攻撃(威力%value%) (1HITごとに33%の確率で錯乱を1回付与)
                  target: 敵役全体から1HITごとにランダムに1体
                  hit_rate3: 100
                  values3: [450, 460, 470, 480, 500]
                  times3: [10, 10, 10, 10, 10]

                field_effects:
                  百発百中、一発必中 (value: 1, time: 2, target: allies)
                */
            }
        }
    ),
    autoSkills = listOf(
        listOf(
        /*
        auto skill 1:
          クリティカル率アップ(%value%)
            target: 味方全体
            hit_rate: 100
            value: 20
            time: 3
          クリティカル威力アップ(%value%)
            target: 味方全体
            hit_rate: 100
            value: 20
            time: 3
          有利属性ダメージアップ(%value%)
            target: 味方全体
            hit_rate: 100
            value: 20
            time: 3
        */
        ),
        listOf(
        /*
        auto skill 2:
          AP減少
            target: 味方全体
            hit_rate: 100
            value: 0
            time: 1
          AP減少
            target: 味方のフロンティア芸術学校
            hit_rate: 100
            value: 0
            time: 2
        */
        ),
        listOf(
        /*
        auto skill 3:
          キラめき回復(%value%)
            target: 味方全体
            hit_rate: 100
            value: 20
            time: 0
        */
        ),
    ),
    unitSkill = null /* 花・陽属性の舞台少女のACTパワーアップ %opt1_value%%(MAX50%) クリティカル威力アップ %opt2_value%%(MAX50%) */,
    multipleCA = false,
    categories = setOf(),
)
*/

val dress3010017 = PartialDressBlueprint(
  id = 3010017,
  name = "舞台少女",
  baseRarity = 4,
  cost = 15,
  character = Character.Aruru,
  attribute = Attribute.Flower,
  damageType = DamageType.Normal,
  position = Position.Middle,
  positionValue = 24050,
  stats = StatData(
    hp = 3000,
    actPower = 330,
    normalDefense = 230,
    specialDefense = 120,
    agility = 230,
    dexterity = 5,
    critical = 50,
    accuracy = 0,
    evasion = 0,
  ),
  growthStats = StatData(
    hp = 83000,
    actPower = 4600,
    normalDefense = 3000,
    specialDefense = 2000,
    agility = 3850,
  ),
  actParameters = mapOf(
    ActType.Act1 to ActBlueprint(
      name = "浄化の狙撃",
      type = ActType.Act1,
      apCost = 2,
      icon = 26,
      parameters = listOf(
        actParameters30,
        actParameters53,
        actParameters44,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.Act2 to ActBlueprint(
      name = "雷光の狙撃",
      type = ActType.Act2,
      apCost = 2,
      icon = 1022,
      parameters = listOf(
        actParameters30,
        actParameters44,
        actParameters3,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.Act3 to ActBlueprint(
      name = "激励の狙撃",
      type = ActType.Act3,
      apCost = 2,
      icon = 157,
      parameters = listOf(
        actParameters44,
        actParameters14,
        actParameters32,
        actParameters32,
        actParameters1,
      ),
    ),
    ActType.ClimaxAct to ActBlueprint(
      name = "いどめ向かい風すすめフロンティア！",
      type = ActType.ClimaxAct,
      apCost = 2,
      icon = 1035,
      parameters = listOf(
        actParameters149,
        actParameters30,
        actParameters241,
        actParameters1,
        actParameters1,
      ),
    ),
  ),
  autoSkillRanks = listOf(1, 4, 9, null),
  autoSkillPanels = listOf(0, 0, 5, 0),
  rankPanels = growthBoard2,
  friendshipPanels = friendshipPattern0,
  remakeParameters = listOf(
    StatData(
      hp = 9000,
      actPower = 330,
      normalDefense = 900,
      specialDefense = 150,
      agility = 270,
    ),
    StatData(
      hp = 15000,
      actPower = 550,
      normalDefense = 1500,
      specialDefense = 250,
      agility = 450,
    ),
    StatData(
      hp = 24000,
      actPower = 880,
      normalDefense = 2400,
      specialDefense = 400,
      agility = 720,
    ),
    StatData(
      hp = 30000,
      actPower = 1100,
      normalDefense = 3000,
      specialDefense = 500,
      agility = 900,
    ),
  ),
)
