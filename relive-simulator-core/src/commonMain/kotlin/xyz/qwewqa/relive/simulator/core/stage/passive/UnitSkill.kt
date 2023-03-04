package xyz.qwewqa.relive.simulator.core.stage.passive

import xyz.qwewqa.relive.simulator.core.stage.autoskill.PassiveEffect
import xyz.qwewqa.relive.simulator.core.stage.condition.NamedCondition
import xyz.qwewqa.relive.simulator.core.stage.condition.plus

data class UnitSkill(
    val values: List<List<Int>>,
    val effects: List<Pair<PassiveEffect, NamedCondition?>>,
) {
  constructor(
      values: List<List<Int>>,
      effects: List<PassiveEffect>,
      condition: NamedCondition? = null,
  ) : this(values, effects.map { it to condition })

  fun forLevel(level: Int) =
      effects.mapIndexed { i, (effect, condition) ->
        PassiveData(
            effect,
            values[i][level - 1],
            0,
            condition,
        )
      }

  operator fun plus(condition: NamedCondition) =
      UnitSkill(
          values,
          effects.map { (effect, cond) -> effect to cond + condition },
      )

  operator fun plus(other: UnitSkill) =
      UnitSkill(
          values + other.values,
          effects + other.effects,
      )
}

val EmptyUnitSkill =
    UnitSkill(
        listOf(),
        listOf<PassiveEffect>(),
    )

val ActCritical50UnitSkill =
    UnitSkill(
        listOf(
            listOf(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 30, 32, 34, 36, 40, 50),
            listOf(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 30, 32, 34, 36, 40, 50),
        ),
        listOf(TeamActUpPassive, TeamCriticalUpPassive))

val ActCritical75UnitSkill =
    UnitSkill(
        listOf(
            listOf(
                15,
                16,
                18,
                19,
                21,
                22,
                24,
                25,
                27,
                28,
                30,
                33,
                36,
                39,
                42,
                45,
                48,
                51,
                54,
                60,
                75,
            ),
            listOf(
                15,
                16,
                18,
                19,
                21,
                22,
                24,
                25,
                27,
                28,
                30,
                33,
                36,
                39,
                42,
                45,
                48,
                51,
                54,
                60,
                75,
            ),
        ),
        listOf(TeamActUpPassive, TeamCriticalUpPassive))

val ActCritical100UnitSkill =
    UnitSkill(
        listOf(
            listOf(
                30,
                32,
                34,
                36,
                38,
                40,
                42,
                44,
                46,
                49,
                52,
                55,
                58,
                61,
                64,
                67,
                71,
                75,
                79,
                85,
                100,
            ),
            listOf(
                30,
                32,
                34,
                36,
                38,
                40,
                42,
                44,
                46,
                49,
                52,
                55,
                58,
                61,
                64,
                67,
                71,
                75,
                79,
                85,
                100,
            ),
        ),
        listOf(TeamActUpPassive, TeamCriticalUpPassive))

val SelfActCritical50UnitSkill =
    UnitSkill(
        listOf(
            listOf(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 30, 32, 34, 36, 40, 50),
            listOf(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 30, 32, 34, 36, 40, 50),
        ),
        listOf(ActUpPassive, CriticalUpPassive))

val ActCritical30UnitSkill =
    UnitSkill(
        listOf(
            listOf(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30),
            listOf(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30),
        ),
        listOf(TeamActUpPassive, TeamCriticalUpPassive))

val ActCritical30UnitSkillStageGirl =
    UnitSkill(
        listOf(
            listOf(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 30),
            listOf(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 30),
        ),
        listOf(TeamActUpPassive, TeamCriticalUpPassive))

val ActCritical25UnitSkill =
    UnitSkill(
        listOf(
            listOf(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
            listOf(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
        ),
        listOf(TeamActUpPassive, TeamCriticalUpPassive))

val SelfActCritical25UnitSkill =
    UnitSkill(
        listOf(
            listOf(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
            listOf(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25),
        ),
        listOf(ActUpPassive, CriticalUpPassive))

val HPDef75UnitSkill =
    UnitSkill(
        listOf(
            listOf(
                10,
                12,
                14,
                16,
                18,
                20,
                22,
                24,
                26,
                28,
                30,
                33,
                36,
                39,
                42,
                45,
                50,
                55,
                60,
                65,
                75,
            ),
            listOf(
                10,
                12,
                14,
                16,
                18,
                20,
                22,
                24,
                26,
                28,
                30,
                33,
                36,
                39,
                42,
                45,
                50,
                55,
                60,
                65,
                75,
            ),
            listOf(
                10,
                12,
                14,
                16,
                18,
                20,
                22,
                24,
                26,
                28,
                30,
                33,
                36,
                39,
                42,
                45,
                50,
                55,
                60,
                65,
                75,
            ),
        ),
        listOf(TeamHpUpPassive, TeamNormalDefenseUpPassive, TeamSpecialDefenseUpPassive))

val HP50Def30UnitSkill =
    UnitSkill(
        listOf(
            listOf(
                20,
                21,
                22,
                23,
                24,
                25,
                26,
                27,
                28,
                29,
                30,
                32,
                34,
                36,
                38,
                40,
                42,
                44,
                46,
                48,
                50,
            ),
            listOf(
                10,
                11,
                12,
                13,
                14,
                15,
                16,
                17,
                18,
                19,
                20,
                21,
                22,
                23,
                24,
                25,
                26,
                27,
                28,
                29,
                30,
            ),
            listOf(
                10,
                11,
                12,
                13,
                14,
                15,
                16,
                17,
                18,
                19,
                20,
                21,
                22,
                23,
                24,
                25,
                26,
                27,
                28,
                29,
                30,
            ),
        ),
        listOf(TeamHpUpPassive, TeamNormalDefenseUpPassive, TeamSpecialDefenseUpPassive))

val HP50Def50UnitSkill =
    UnitSkill(
        listOf(
            listOf(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 30, 32, 34, 36, 40, 50),
            listOf(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 30, 32, 34, 36, 40, 50),
            listOf(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 30, 32, 34, 36, 40, 50),
        ),
        listOf(TeamHpUpPassive, TeamNormalDefenseUpPassive, TeamSpecialDefenseUpPassive))
