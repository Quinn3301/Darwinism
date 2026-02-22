/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.potionofdarwinism.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.potionofdarwinism.PotionOfDarwinismMod;

public class PotionOfDarwinismModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, PotionOfDarwinismMod.MODID);
	public static final DeferredHolder<Potion, Potion> DARWINISM_POTION = REGISTRY.register("darwinism_potion", () -> new Potion(new MobEffectInstance(PotionOfDarwinismModMobEffects.DARWINISM, 3600, 0, false, true)));
}