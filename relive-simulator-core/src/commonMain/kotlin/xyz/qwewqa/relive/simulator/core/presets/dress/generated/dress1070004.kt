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

val dress1070004 = PartialDressBlueprint(
  id = 1070004,
  name = "正義",
  baseRarity = 4,
  character = Character.Nana,
  attribute = Attribute.Space,
  damageType = DamageType.Normal,
  position = Position.Back,
  positionValue = 35050,
  stats = StatData(
    hp = 1877,
    actPower = 306,
    normalDefense = 142,
    specialDefense = 92,
    agility = 220,
    dexterity = 5,
    critical = 50,
    accuracy = 0,
    evasion = 0,
  ),
  growthStats = StatData(
    hp = 61830,
    actPower = 5050,
    normalDefense = 2340,
    specialDefense = 1520,
    agility = 3630,
  ),
  actParameters = mapOf(
    ActType.Act1 to ActBlueprint(
      name = "キラめきの剣撃",
      type = ActType.Act1,
      apCost = 2,
      icon = 89,
      parameters = listOf(
        ActParameters(
          values = listOf(93, 98, 102, 107, 112),
          times = listOf(0, 0, 0, 0, 0),
        ),
        ActParameters(
          values = listOf(20, 20, 20, 20, 20),
          times = listOf(0, 0, 0, 0, 0),
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
        ),
      ),
    ),
    ActType.Act2 to ActBlueprint(
      name = "正義の剣",
      type = ActType.Act2,
      apCost = 2,
      icon = 157,
      parameters = listOf(
        ActParameters(
          values = listOf(54, 56, 59, 62, 64),
          times = listOf(0, 0, 0, 0, 0),
        ),
        ActParameters(
          values = listOf(10, 12, 14, 17, 20),
          times = listOf(3, 3, 3, 3, 3),
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(2, 2, 2, 2, 2),
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
        ),
      ),
    ),
    ActType.Act3 to ActBlueprint(
      name = "正しき裁き",
      type = ActType.Act3,
      apCost = 2,
      icon = 6,
      parameters = listOf(
        ActParameters(
          values = listOf(165, 173, 181, 189, 198),
          times = listOf(0, 0, 0, 0, 0),
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
        ),
        ActParameters(
          values = listOf(20, 22, 24, 27, 30),
          times = listOf(0, 0, 0, 0, 0),
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
        ),
      ),
    ),
    ActType.ClimaxAct to ActBlueprint(
      name = "絶対正義　強制断罪",
      type = ActType.ClimaxAct,
      apCost = 2,
      icon = 8,
      parameters = listOf(
        ActParameters(
          values = listOf(10, 12, 14, 17, 20),
          times = listOf(3, 3, 3, 3, 3),
        ),
        ActParameters(
          values = listOf(10, 12, 14, 17, 20),
          times = listOf(3, 3, 3, 3, 3),
        ),
        ActParameters(
          values = listOf(10, 12, 14, 17, 20),
          times = listOf(3, 3, 3, 3, 3),
        ),
        ActParameters(
          values = listOf(200, 210, 220, 230, 240),
          times = listOf(0, 0, 0, 0, 0),
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
        ),
      ),
    ),
  ),
  autoSkillRanks = listOf(1, 4, 9, null),
  autoSkillPanels = listOf(0, 0, 5, 0),
  rankPanels = listOf(
    listOf(
      StatBoost(StatBoostType.SpecialDefense, 1),
      StatBoost(StatBoostType.ActPower, 1),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.NormalDefense, 1),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 1),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.Hp, 2),
    ),
    listOf(
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 7),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 3),
      StatBoost(StatBoostType.Act1Level, 0),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 3),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.SpecialDefense, 5),
      StatBoost(StatBoostType.Hp, 3),
      StatBoost(StatBoostType.ActPower, 3),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.Hp, 4),
    ),
    listOf(
      StatBoost(StatBoostType.SpecialDefense, 3),
      StatBoost(StatBoostType.NormalDefense, 7),
      StatBoost(StatBoostType.Hp, 4),
      StatBoost(StatBoostType.Agility, 8),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 4),
      StatBoost(StatBoostType.NormalDefense, 3),
      StatBoost(StatBoostType.Act1Level, 0),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 4),
      StatBoost(StatBoostType.Act1Level, 0),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.SpecialDefense, 8),
      StatBoost(StatBoostType.ActPower, 5),
      StatBoost(StatBoostType.NormalDefense, 4),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.Hp, 5),
    ),
    listOf(
      StatBoost(StatBoostType.SpecialDefense, 5),
      StatBoost(StatBoostType.NormalDefense, 8),
      StatBoost(StatBoostType.SpecialDefense, 5),
      StatBoost(StatBoostType.Agility, 9),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 5),
      StatBoost(StatBoostType.NormalDefense, 8),
      StatBoost(StatBoostType.Hp, 5),
    ),
    listOf(
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.Agility, 11),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.Act1Level, 0),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.SpecialDefense, 6),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
    ),
  ),
  friendshipPanels = listOf(
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 1),
      StatBoost(StatBoostType.Hp, 1),
      StatBoost(StatBoostType.NormalDefense, 1),
      StatBoost(StatBoostType.SpecialDefense, 1),
      StatBoost(StatBoostType.Agility, 1),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 1),
      StatBoost(StatBoostType.Hp, 1),
      StatBoost(StatBoostType.NormalDefense, 1),
      StatBoost(StatBoostType.SpecialDefense, 1),
      StatBoost(StatBoostType.Agility, 1),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 1),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
  ),
  remakeParameters = listOf(
    StatData(
      hp = 6000,
      actPower = 480,
      normalDefense = 450,
      specialDefense = 90,
      agility = 270,
    ),
    StatData(
      hp = 10000,
      actPower = 800,
      normalDefense = 750,
      specialDefense = 150,
      agility = 450,
    ),
    StatData(
      hp = 16000,
      actPower = 1280,
      normalDefense = 1200,
      specialDefense = 240,
      agility = 720,
    ),
    StatData(
      hp = 20000,
      actPower = 1600,
      normalDefense = 1500,
      specialDefense = 300,
      agility = 900,
    ),
  ),
)
