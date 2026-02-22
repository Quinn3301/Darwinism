package net.mcreator.potionofdarwinism.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.potionofdarwinism.procedures.AdaptationLogicProcedure;

public class DarwinismMobEffect extends MobEffect {
	public DarwinismMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6684724);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		AdaptationLogicProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return super.applyEffectTick(entity, amplifier);
	}
}