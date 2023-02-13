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
import xyz.qwewqa.relive.simulator.core.presets.dress.generated.dress1070018
import xyz.qwewqa.relive.simulator.core.stage.Act
import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.CountableBuff
import xyz.qwewqa.relive.simulator.core.stage.dress.DressCategory
import xyz.qwewqa.relive.simulator.core.stage.autoskill.new
import xyz.qwewqa.relive.simulator.core.stage.dress.blueprint
import xyz.qwewqa.relive.simulator.core.stage.buff.*
import xyz.qwewqa.relive.simulator.core.stage.passive.*
import xyz.qwewqa.relive.simulator.core.stage.stageeffect.*

val dress = dress1070018(
    name = "マッドサイエンティスト",
    acts = listOf(
        ActType.Act1.blueprint("創壁の斬撃") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 前から1番目の敵役
                  hit_rate1: 100
                  values1: [88, 92, 96, 101, 105]
                  times1: 1
                通常バリア(%value%)
                  target: 自身
                  hit_rate2: 100
                  values2: [3000, 3500, 4000, 4500, 5000]
                  times2: [3, 3, 3, 3, 3]
                */
            }
        },
        ActType.Act2.blueprint("逆転の可能性") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 前から3体の敵役
                  hit_rate1: 100
                  values1: [97, 102, 106, 111, 116]
                  times1: 2
                プラス効果反転(%value%)
                  target: 前から3体の敵役
                  hit_rate2: 100
                  values2: [2, 2, 2, 2, 2]
                  times2: [0, 0, 0, 0, 0]
                */
            }
        },
        ActType.Act3.blueprint("能力の解放") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 敵役全体
                  hit_rate1: 100
                  values1: [84, 88, 92, 97, 101]
                  times1: 2
                ACTパワーアップ(%value%)
                  target: 味方全体
                  hit_rate2: 100
                  values2: [20, 22, 24, 27, 30]
                  times2: [3, 3, 3, 3, 3]
                AP減少
                  target: 味方全体
                  hit_rate3: 100
                  values3: [0, 0, 0, 0, 0]
                  times3: [2, 2, 2, 2, 2]
                */
            }
        },
        ActType.ClimaxAct.blueprint("モアッド・スネェェイク！！") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 敵役全体
                  hit_rate1: 100
                  values1: [200, 210, 220, 230, 240]
                  times1: 5
                継続マイナス効果耐性アップ(%value%)
                  target: 味方全体
                  hit_rate2: 100
                  values2: [100, 100, 100, 100, 100]
                  times2: [3, 3, 3, 3, 3]
                HP回復(%value%) (回復量は対象の最大HPに依存する)
                  target: 味方全体
                  hit_rate3: 100
                  values3: [25, 26, 27, 28, 33]
                  times3: [0, 0, 0, 0, 0]
                */
            }
        }
    ),
    autoSkills = listOf(
        listOf(
        /*
        auto skill 1:
          花属性被ダメージダウン(%value%)
            target: 味方全体
            hit_rate: 100
            value: 80
            time: 2
        */
        ),
        listOf(
        /*
        auto skill 2:
          ACTパワーアップ(%value%)
            target: 味方全体
            hit_rate: 100
            value: 10
            time: 3
        */
        ),
        listOf(
        /*
        auto skill 3:
          回避率アップ(%value%)
            target: 味方全体
            hit_rate: 100
            value: 52
            time: 2
        */
        ),
        listOf(
        /*
        auto skill 4:
          クリティカル率アップ(%value%)
            target: 味方全体
            hit_rate: 100
            value: 10
            time: 3
        */
        ),
    ),
    unitSkill = null /* ACTタイプ[通常]の舞台少女の最大HPアップ %opt1_value%%(MAX50%) 通常防御力アップ %opt2_value%%(MAX30%) 特殊防御力アップ %opt3_value%%(MAX30%) */,
    multipleCA = false,
    categories = setOf(),
)
*/

val dress1070018 = PartialDressBlueprint(
  id = 1070018,
  name = "マッドサイエンティスト",
  baseRarity = 4,
  cost = 12,
  character = Character.Nana,
  attribute = Attribute.Snow,
  damageType = DamageType.Normal,
  position = Position.Back,
  positionValue = 32050,
  stats = StatData(
    hp = 965,
    actPower = 217,
    normalDefense = 106,
    specialDefense = 71,
    agility = 220,
    dexterity = 5,
    critical = 50,
    accuracy = 0,
    evasion = 0,
  ),
  growthStats = StatData(
    hp = 31800,
    actPower = 3580,
    normalDefense = 1760,
    specialDefense = 1170,
    agility = 3630,
  ),
  actParameters = mapOf(
    ActType.Act1 to ActBlueprint(
      name = "創壁の斬撃",
      type = ActType.Act1,
      apCost = 2,
      icon = 30,
      parameters = listOf(
        actParameters0,
        actParameters82,
        actParameters1,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.Act2 to ActBlueprint(
      name = "逆転の可能性",
      type = ActType.Act2,
      apCost = 2,
      icon = 151,
      parameters = listOf(
        actParameters170,
        actParameters72,
        actParameters1,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.Act3 to ActBlueprint(
      name = "能力の解放",
      type = ActType.Act3,
      apCost = 3,
      icon = 157,
      parameters = listOf(
        actParameters46,
        actParameters32,
        actParameters14,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.ClimaxAct to ActBlueprint(
      name = "モアッド・スネェェイク！！",
      type = ActType.ClimaxAct,
      apCost = 2,
      icon = 26,
      parameters = listOf(
        actParameters54,
        actParameters53,
        actParameters237,
        actParameters1,
        actParameters1,
      ),
    ),
  ),
  autoSkillRanks = listOf(1, 4, 9, 9),
  autoSkillPanels = listOf(0, 0, 5, 5),
  rankPanels = growthBoard4,
  friendshipPanels = friendshipPattern0,
  remakeParameters = listOf(
    StatData(
      hp = 6900,
      actPower = 300,
      normalDefense = 360,
      specialDefense = 90,
      agility = 90,
    ),
    StatData(
      hp = 11500,
      actPower = 500,
      normalDefense = 600,
      specialDefense = 150,
      agility = 150,
    ),
    StatData(
      hp = 18400,
      actPower = 800,
      normalDefense = 960,
      specialDefense = 240,
      agility = 240,
    ),
    StatData(
      hp = 23000,
      actPower = 1000,
      normalDefense = 1200,
      specialDefense = 300,
      agility = 300,
    ),
  ),
)
