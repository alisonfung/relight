package xyz.qwewqa.relive.simulator.core.presets.dress.boss.tr.tr34

import xyz.qwewqa.relive.simulator.core.presets.dress.boss.tr.FullNegativeEffectResistancePassive
import xyz.qwewqa.relive.simulator.core.presets.dress.boss.tr.TrDamageReductionPassive
import xyz.qwewqa.relive.simulator.core.presets.dress.boss.tr.trEventBonusPassive2023V2
import xyz.qwewqa.relive.simulator.core.stage.HitMode
import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.Attribute
import xyz.qwewqa.relive.simulator.core.stage.actor.Character
import xyz.qwewqa.relive.simulator.core.stage.actor.DamageType
import xyz.qwewqa.relive.simulator.core.stage.actor.Position
import xyz.qwewqa.relive.simulator.core.stage.actor.actsOf
import xyz.qwewqa.relive.simulator.core.stage.actor.defaultDressStats
import xyz.qwewqa.relive.simulator.core.stage.autoskill.AbnormalGuardPassive
import xyz.qwewqa.relive.simulator.core.stage.autoskill.BossElementResistPassive
import xyz.qwewqa.relive.simulator.core.stage.autoskill.new
import xyz.qwewqa.relive.simulator.core.stage.buff.Buffs
import xyz.qwewqa.relive.simulator.core.stage.dress.Dress
import xyz.qwewqa.relive.simulator.core.stage.loadout.ActorLoadout
import xyz.qwewqa.relive.simulator.core.stage.strategy.FixedStrategy

val tr34MusketeerKaren =
    ActorLoadout(
        "TR34 Musketeer Karen",
        Dress(
            name = "Musketeer Karen",
            character = Character.Karen,
            attribute = Attribute.Dream,
            damageType = DamageType.Normal,
            position = Position.None,
            stats =
            defaultDressStats.copy(
                hp = 90_000_000,
                actPower = 2300,
                normalDefense = 650,
                specialDefense = 650,
                agility = 9999,
            ),
            acts =
            actsOf(
                ActType.Act1("Slash", 2) {
                  targetFront().act {
                    attack(
                        modifier = 100,
                        hitCount = 1,
                    )
                  }
                },
                ActType.Act2("Violent Slash", 2) {
                  targetFront().act {
                    attack(
                        modifier = 150,
                        hitCount = 1,
                    )
                  }
                },
                ActType.Act3("Violent Dual Slash", 2) {
                  targetFront(2).act {
                    attack(
                        modifier = 120,
                        hitCount = 2,
                    )
                  }
                },
                ActType.Act4("Triple Slash", 2) {
                  targetFront(3).act {
                    attack(
                        modifier = 70,
                        hitCount = 3,
                    )
                  }
                },
                ActType.Act5("Tri-Slash", 2) {
                  targetFront(3).act {
                    attack(
                        modifier = 100,
                        hitCount = 3,
                    )
                  }
                },
                ActType.Act6("Counter Concerto", 2) {
                  targetAoe().act {
                    attack(
                        modifier = 150,
                        hitCount = 3,
                    )
                  }
                },
                ActType.Act7("Weakening Concerto", 2) {
                  targetAoe().act {
                    applyContinuousBuff(
                        effect = Buffs.ActPowerDownBuff,
                        value = 50,
                        turns = 3,
                    )
                  }
                },
                ActType.Act8("Accuracy Concerto", 2) {
                  targetSelf().act {
                    applyContinuousBuff(
                        effect = Buffs.PerfectAimBuff,
                        turns = 1,
                    )
                  }
                  targetAoe().act {
                    attack(
                        modifier = 150,
                        hitCount = 3,
                    )
                    applyContinuousBuff(
                        effect = Buffs.GreaterFrostbiteBuff,
                        value = 99999,
                        turns = 1,
                    )
                  }
                },
                ActType.ClimaxAct("Dance of Hope NEO", 2) {
                  targetSelf().act {
                    applyContinuousBuff(
                        effect = Buffs.PerfectAimBuff,
                        turns = 1,
                    )
                  }
                  targetAoe().act {
                    attack(
                        modifier = 200,
                        hitCount = 3,
                    )
                    applyContinuousBuff(
                        effect = Buffs.GreaterFrostbiteBuff,
                        value = 99999,
                        turns = 1,
                    )
                  }
                },
                ActType.ConfusionAct("Slash", 2) {
                  targetAllyRandom().act {
                    attack(
                        modifier = 105,
                        hitCount = 1,
                    )
                  }
                },
            ),
            autoSkills =
            listOf(
                trEventBonusPassive2023V2(1070022),
                AbnormalGuardPassive.new(),
            ),
        ),
    )

val tr34MusketeerKarenStrategy = FixedStrategy {
  val boss = this.team.actors.values.first()

  when (turn) {
    1 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act4]
    }
    2 -> {
      +boss[ActType.Act1]
      +boss[ActType.Act5]
      +boss[ActType.Act6]
    }
    3 -> {
      +boss[ActType.Act7]
      +boss[ActType.ClimaxAct]
    }
    4 -> {
      +boss[ActType.Act2]
      +boss[ActType.Act3]
      +boss[ActType.Act6]
    }
    5 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act8]
    }
    6 -> {
      +boss[ActType.Act3]
      +boss[ActType.Act5]
      +boss[ActType.Act6]
    }
    else -> error("Not supported.")
  }
}

val tr34MusketeerKarenDiff4 =
    ActorLoadout(
        "TR34 Musketeer Karen Difficulty 4",
        Dress(
            name = "Musketeer Karen",
            character = Character.Karen,
            attribute = Attribute.Dream,
            damageType = DamageType.Normal,
            position = Position.None,
            stats =
            defaultDressStats.copy(
                hp = 1_200_000_000,
                actPower = 10000,
                normalDefense = 10000,
                specialDefense = 10000,
                agility = 9999,
            ),
            acts =
            actsOf(
                ActType.Act1("Slash", 2) {
                  targetFront().act {
                    attack(
                        modifier = 100,
                        hitCount = 1,
                    )
                  }
                },
                ActType.Act2("Violent Slash", 2) {
                  targetFront().act {
                    attack(
                        modifier = 150,
                        hitCount = 1,
                    )
                  }
                },
                ActType.Act3("Violent Dual Slash", 2) {
                  targetFront(2).act {
                    attack(
                        modifier = 120,
                        hitCount = 2,
                    )
                  }
                },
                ActType.Act4("Triple Slash", 2) {
                  targetFront(3).act {
                    attack(
                        modifier = 70,
                        hitCount = 3,
                    )
                  }
                },
                ActType.Act5("Tri-Slash", 2) {
                  targetFront(3).act {
                    attack(
                        modifier = 100,
                        hitCount = 3,
                    )
                  }
                },
                ActType.Act6("Counter Concerto", 2) {
                  targetAoe().act {
                    attack(
                        modifier = 150,
                        hitCount = 3,
                    )
                  }
                },
                ActType.Act7("Weakening Concerto", 2) {
                  targetAoe().act {
                    applyContinuousBuff(
                        effect = Buffs.ActPowerDownBuff,
                        value = 50,
                        turns = 3,
                    )
                  }
                },
                ActType.Act8("Accuracy Concerto", 2) {
                  targetSelf().act {
                    applyContinuousBuff(
                        effect = Buffs.PerfectAimBuff,
                        turns = 1,
                    )
                  }
                  targetAoe().act {
                    attack(
                        modifier = 150,
                        hitCount = 3,
                    )
                    applyContinuousBuff(
                        effect = Buffs.GreaterFrostbiteBuff,
                        value = 99999,
                        turns = 1,
                    )
                  }
                },
                ActType.ClimaxAct("Dance of Hope NEO", 2) {
                  targetSelf().act {
                    applyContinuousBuff(
                        effect = Buffs.PerfectAimBuff,
                        turns = 1,
                    )
                  }
                  targetAoe().act {
                    attack(
                        modifier = 99999,
                        hitCount = 3,
                        mode = HitMode.FIXED,
                    )
                    applyContinuousBuff(
                        effect = Buffs.GreaterFrostbiteBuff,
                        value = 99999,
                        turns = 1,
                    )
                  }
                },
                ActType.ConfusionAct("Slash", 2) {
                  targetAllyRandom().act {
                    attack(
                        modifier = 105,
                        hitCount = 1,
                    )
                  }
                },
            ),
            autoSkills =
            listOf(
                trEventBonusPassive2023V2(1070022),
                FullNegativeEffectResistancePassive.new(100),
                BossElementResistPassive.new(50),
                TrDamageReductionPassive.new(90),
            ),
        ),
    )

val tr34MusketeerKarenDiff4Strategy = FixedStrategy {
  val boss = this.team.actors.values.first()

  when (turn) {
    1 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act4]
    }
    2 -> {
      +boss[ActType.Act1]
      +boss[ActType.Act5]
      +boss[ActType.Act6]
    }
    3 -> {
      +boss[ActType.Act7]
      +boss[ActType.ClimaxAct]
    }
    4 -> {
      +boss[ActType.Act2]
      +boss[ActType.Act3]
      +boss[ActType.Act6]
    }
    5 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act8]
    }
    6 -> {
      +boss[ActType.Act3]
      +boss[ActType.Act5]
      +boss[ActType.Act6]
    }
    else -> error("Not supported.")
  }
}


