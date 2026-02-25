# Darwinism

**Darwinism** is a Minecraft mod that introduces a dynamic biological adaptation system. Instead of static buffs, your character evolves in real-time based on environmental triggers, physical health, and movement patterns.

## 🧬 Biological Adaptations

The core of the mod is the **Adaptation Logic**, which monitors your state 20 times per second to trigger specific "evolutions":

### 🏃 Kinetic Evolution
* **Speed Burst:** Sprinting for more than 3 seconds (60 ticks) adapts your muscle fibers, granting a **Speed II** burst.
* **Survival Instinct:** Swinging a tool or arm while facing blocks triggers **Haste II**, allowing for rapid-fire excavation.
* **Charge Jump:** Sneaking on the ground allows you to "charge" a leap. Once fully charged, you receive a powerful **Jump Boost IV**.

### 🛡️ Emergency Stabilization
The serum enters an "overdrive" state when your life is threatened:
* **Adrenaline Recovery:** Dropping below 3.5 hearts (7 HP) triggers a steady **Regeneration II** pulse.
* **Critical Overdrive:** Dropping below 1 heart (2 HP) grants **Resistance V** (total invulnerability) and **Regen V** for 10 seconds.
* **Metabolic Jumpstart:** When starving (below 1 hunger shank), there is a 5% chance per tick to instantly regain hunger via **Saturation**.

### 👁️ Environmental Awareness
* **Optic Sensitivity:** Automatically grants **Night Vision** when entering near-total darkness (light level < 3).

## 🧪 Attribute Mutations
While the Darwinism effect is active, your base physical attributes are modified:
* **Aquatic Mastery:** Increased Swim Speed and Submerged Mining Speed.
* **Impact Resistance:** Reduced Fall Damage and increased Safe Fall Distance.
* **Resilience:** Enhanced Knockback and Explosion Resistance.

## 🛠️ Technical Details & Optimization
This mod is built with performance in mind:
* **Attribute Management:** Attributes are set via `On Potion Applied` and `On Potion Expired` triggers to prevent server-side packet spam.
* **Logic Efficiency:** Conditionals are prioritized (lowest health checks first) to ensure the most critical buffs take precedence.
* **Safety Nets:** Includes global procedures to force-reset attributes on player respawn or world join, preventing "permanent mutations" after death.

## 📜 Changelog (v1.2.0)
* Optimized **Jump Boost** logic to prevent redundant per-tick execution.
* Re-ordered **Health Logic** to prioritize emergency stabilization over standard recovery.
* Migrated **Attribute Overrides** to event-based triggers for 90% better performance.
* Refined **Night Vision** light-level triggers.

---
*Developed by m-xie_ using MCreator.*
