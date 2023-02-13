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
import xyz.qwewqa.relive.simulator.core.presets.dress.generated.dress1070014
import xyz.qwewqa.relive.simulator.core.stage.Act
import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.CountableBuff
import xyz.qwewqa.relive.simulator.core.stage.dress.DressCategory
import xyz.qwewqa.relive.simulator.core.stage.autoskill.new
import xyz.qwewqa.relive.simulator.core.stage.dress.blueprint
import xyz.qwewqa.relive.simulator.core.stage.buff.*
import xyz.qwewqa.relive.simulator.core.stage.passive.*
import xyz.qwewqa.relive.simulator.core.stage.stageeffect.*

val dress = dress1070014(
    name = "スクールアイドル",
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
        ActType.Act2.blueprint("聖域の舞") {
            Act {
                /*
                継続マイナス効果耐性アップ(%value%)
                  target: 後ろから3体の味方
                  hit_rate1: 100
                  values1: [100, 100, 100, 100, 100]
                  times1: [3, 3, 3, 3, 3]
                */
            }
        },
        ActType.Act3.blueprint("真理の領域") {
            Act {
                /*
                月属性被ダメージダウン(%value%)
                  target: 味方全体
                  hit_rate1: 100
                  values1: [30, 35, 40, 45, 50]
                  times1: [3, 3, 3, 3, 3]
                宙属性被ダメージダウン(%value%)
                  target: 味方全体
                  hit_rate2: 100
                  values2: [30, 35, 40, 45, 50]
                  times2: [3, 3, 3, 3, 3]
                雲属性被ダメージダウン(%value%)
                  target: 味方全体
                  hit_rate3: 100
                  values3: [30, 35, 40, 45, 50]
                  times3: [3, 3, 3, 3, 3]
                */
            }
        },
        ActType.ClimaxAct.blueprint("キラキラのスマイル") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 後ろから3体の敵役
                  hit_rate1: 100
                  values1: [186, 200, 214, 228, 243]
                  times1: 3
                継続マイナス効果解除
                  target: 味方全体
                  hit_rate2: 100
                  values2: [0, 0, 0, 0, 0]
                  times2: [0, 0, 0, 0, 0]
                継続マイナス効果耐性アップ(%value%)
                  target: 味方全体
                  hit_rate3: 100
                  values3: [100, 100, 100, 100, 100]
                  times3: [3, 3, 3, 3, 3]
                */
            }
        }
    ),
    autoSkills = listOf(
        listOf(
        /*
        auto skill 1:
          混乱耐性アップ(%value%)
            target: 自身
            values: [100, 100, 100, 100, 200]
        */
        ),
        listOf(
        /*
        auto skill 2:
          スタン耐性アップ(%value%)
            target: 自身
            values: [100, 100, 100, 100, 200]
        */
        ),
        listOf(
        /*
        auto skill 3:
          毎ターンHP回復(%value%)
            target: 自身
            values: [1000, 1000, 1000, 1000, 1000]
        */
        ),
    ),
    unitSkill = null /* 立ち位置後の舞台少女の最大HPアップ %opt1_value%%(MAX50%) 通常防御力アップ %opt2_value%%(MAX30%) 特殊防御力アップ %opt3_value%%(MAX30%) */,
    multipleCA = false,
    categories = setOf(),
)
*/

val dress1070014 = PartialDressBlueprint(
  id = 1070014,
  name = "スクールアイドル",
  baseRarity = 4,
  cost = 12,
  character = Character.Nana,
  attribute = Attribute.Snow,
  damageType = DamageType.Normal,
  position = Position.Back,
  positionValue = 35050,
  stats = StatData(
    hp = 1224,
    actPower = 173,
    normalDefense = 111,
    specialDefense = 48,
    agility = 200,
    dexterity = 5,
    critical = 50,
    accuracy = 0,
    evasion = 0,
  ),
  growthStats = StatData(
    hp = 40320,
    actPower = 2850,
    normalDefense = 1840,
    specialDefense = 800,
    agility = 3300,
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
      name = "聖域の舞",
      type = ActType.Act2,
      apCost = 1,
      icon = 26,
      parameters = listOf(
        actParameters53,
        actParameters1,
        actParameters1,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.Act3 to ActBlueprint(
      name = "真理の領域",
      type = ActType.Act3,
      apCost = 3,
      icon = 114,
      parameters = listOf(
        actParameters217,
        actParameters217,
        actParameters217,
        actParameters1,
        actParameters1,
      ),
    ),
    ActType.ClimaxAct to ActBlueprint(
      name = "キラキラのスマイル",
      type = ActType.ClimaxAct,
      apCost = 2,
      icon = 10005,
      parameters = listOf(
        actParameters97,
        actParameters30,
        actParameters53,
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
      hp = 5400,
      actPower = 390,
      normalDefense = 240,
      specialDefense = 150,
      agility = 150,
    ),
    StatData(
      hp = 9000,
      actPower = 650,
      normalDefense = 400,
      specialDefense = 250,
      agility = 250,
    ),
    StatData(
      hp = 14400,
      actPower = 1040,
      normalDefense = 640,
      specialDefense = 400,
      agility = 400,
    ),
    StatData(
      hp = 18000,
      actPower = 1300,
      normalDefense = 800,
      specialDefense = 500,
      agility = 500,
    ),
  ),
)
