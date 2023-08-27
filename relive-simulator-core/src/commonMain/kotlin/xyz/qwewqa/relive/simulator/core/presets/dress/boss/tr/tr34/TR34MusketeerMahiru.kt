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

val tr34MusketeerMahiru =
    ActorLoadout(
        "TR34 Musketeer Mahiru",
        Dress(
            name = "Musketeer Mahiru",
            character = Character.Mahiru,
            attribute = Attribute.Dream,
            damageType = DamageType.Special,
            position = Position.None,
            stats =
            defaultDressStats.copy(
                hp = 135_000_000,
                actPower = 2300,
                normalDefense = 650,
                specialDefense = 650,
                agility = 9999,
            ),
            acts =
            actsOf(
                ActType.Act1("Smash", 2) {
                  targetFront().act {
                    attack(
                        modifier = 100,
                        hitCount = 1,
                    )
                  }
                },
                ActType.Act2("Strong Smash", 2) {
                  targetFront().act {
                    attack(
                        modifier = 150,
                        hitCount = 1,
                    )
                  }
                },
                ActType.Act3("Triple Smash", 2) {
                  targetFront(3).act {
                    attack(
                        modifier = 70,
                        hitCount = 3,
                    )
                  }
                },
                ActType.Act4("Strong Triple Smash", 2) {
                  targetFront(3).act {
                    attack(
                        modifier = 100,
                        hitCount = 3,
                    )
                  }
                },
                ActType.Act5("Accuracy Smash", 2) {
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
                  }
                },
                ActType.Act6("Counter Concerto", 2) {
                  targetAoe().act {
                    attack(
                        modifier = 150,
                        hitCount = 2,
                    )
                  }
                },
                ActType.Act7("Softening Concerto", 2) {
                  targetAoe().act {
                    applyContinuousBuff(
                        effect = Buffs.NormalDefenseDownBuff,
                        value = 50,
                        turns = 3,
                    )
                    applyContinuousBuff(
                        effect = Buffs.SpecialDefenseDownBuff,
                        value = 50,
                        turns = 3,
                    )
                  }
                },
                ActType.Act8("Heavy Pressure Concerto", 2) {
                  targetAoe().act {
                    attack(
                        modifier = 200,
                        hitCount = 3,
                    )
                    applyContinuousBuff(
                        effect = Buffs.ApUpBuff,
                        turns = 2,
                    )
                    applyContinuousBuff(
                        effect = Buffs.GreaterFrostbiteBuff,
                        value = 99999,
                        turns = 1,
                    )
                  }
                },
                ActType.ClimaxAct("Buttercup Carpet NEO", 2) {
                  targetAoe().act {
                    attack(
                        modifier = 250,
                        hitCount = 3,
                    )
                    applyContinuousBuff(
                        effect = Buffs.ApUpBuff,
                        turns = 2,
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

val tr34MusketeerMahiruStrategy = FixedStrategy {
  val boss = this.team.actors.values.first()

  when (turn) {
    1 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act1]
      +boss[ActType.Act4]
    }
    2 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act3]
      +boss[ActType.Act4]
    }
    3 -> {
      +boss[ActType.ClimaxAct]
      +boss[ActType.Act2]
      +boss[ActType.Act6]
    }
    4 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act6]
      +boss[ActType.Act5]
    }
    5 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act6]
      +boss[ActType.Act8]
    }
    6 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act6]
      +boss[ActType.Act5]
    }
    else -> error("Not supported.")
  }
}

val tr34MusketeerMahiruDiff4 =
    ActorLoadout(
        "TR34 Musketeer Mahiru Difficulty 4",
        Dress(
            name = "Musketeer Mahiru",
            character = Character.Mahiru,
            attribute = Attribute.Dream,
            damageType = DamageType.Special,
            position = Position.None,
            stats =
            defaultDressStats.copy(
                hp = 1_800_000_000,
                actPower = 10000,
                normalDefense = 10000,
                specialDefense = 10000,
                agility = 9999,
            ),
            acts =
            actsOf(
                ActType.Act1("Smash", 2) {
                  targetFront().act {
                    attack(
                        modifier = 100,
                        hitCount = 1,
                    )
                  }
                },
                ActType.Act2("Strong Smash", 2) {
                  targetFront().act {
                    attack(
                        modifier = 150,
                        hitCount = 1,
                    )
                  }
                },
                ActType.Act3("Triple Smash", 2) {
                  targetFront(3).act {
                    attack(
                        modifier = 70,
                        hitCount = 3,
                    )
                  }
                },
                ActType.Act4("Strong Triple Smash", 2) {
                  targetFront(3).act {
                    attack(
                        modifier = 100,
                        hitCount = 3,
                    )
                  }
                },
                ActType.Act5("Accuracy Smash", 2) {
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
                  }
                },
                ActType.Act6("Counter Concerto", 2) {
                  targetAoe().act {
                    attack(
                        modifier = 150,
                        hitCount = 2,
                    )
                  }
                },
                ActType.Act7("Softening Concerto", 2) {
                  targetAoe().act {
                    applyContinuousBuff(
                        effect = Buffs.NormalDefenseDownBuff,
                        value = 50,
                        turns = 3,
                    )
                    applyContinuousBuff(
                        effect = Buffs.SpecialDefenseDownBuff,
                        value = 50,
                        turns = 3,
                    )
                  }
                },
                ActType.Act8("Heavy Pressure Concerto", 2) {
                  targetAoe().act {
                    attack(
                        modifier = 200,
                        hitCount = 3,
                    )
                    applyContinuousBuff(
                        effect = Buffs.ApUpBuff,
                        turns = 2,
                    )
                    applyContinuousBuff(
                        effect = Buffs.GreaterFrostbiteBuff,
                        value = 99999,
                        turns = 1,
                    )
                  }
                },
                ActType.ClimaxAct("Buttercup Carpet NEO", 2) {
                  targetAoe().act {
                    attack(
                        modifier = 99999,
                        hitCount = 3,
                        mode = HitMode.FIXED,
                    )
                    applyContinuousBuff(
                        effect = Buffs.ApUpBuff,
                        turns = 2,
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

val tr34MusketeerMahiruDiff4Strategy = FixedStrategy {
  val boss = this.team.actors.values.first()

  when (turn) {
    1 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act1]
      +boss[ActType.Act4]
    }
    2 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act3]
      +boss[ActType.Act4]
    }
    3 -> {
      +boss[ActType.ClimaxAct]
      +boss[ActType.Act2]
      +boss[ActType.Act6]
    }
    4 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act6]
      +boss[ActType.Act5]
    }
    5 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act6]
      +boss[ActType.Act8]
    }
    6 -> {
      +boss[ActType.Act7]
      +boss[ActType.Act6]
      +boss[ActType.Act5]
    }
    else -> error("Not supported.")
  }
}

