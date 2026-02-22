/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.potionofdarwinism.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.potionofdarwinism.potion.DarwinismMobEffect;
import net.mcreator.potionofdarwinism.PotionOfDarwinismMod;

public class PotionOfDarwinismModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, PotionOfDarwinismMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> DARWINISM = REGISTRY.register("darwinism", () -> new DarwinismMobEffect());
}