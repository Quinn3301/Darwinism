package net.mcreator.potionofdarwinism.procedures;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.potionofdarwinism.network.PotionOfDarwinismModVariables;

public class AdaptationLogicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sprintCounter = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.swinging) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, false, false));
		}
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) < 2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 220, 0, false, false));
		}
		if (entity.isSprinting()) {
			{
				PotionOfDarwinismModVariables.PlayerVariables _vars = entity.getData(PotionOfDarwinismModVariables.PLAYER_VARIABLES);
				_vars.sprintCounter = entity.getData(PotionOfDarwinismModVariables.PLAYER_VARIABLES).sprintCounter + 1;
				_vars.markSyncDirty();
			}
			if (entity.getData(PotionOfDarwinismModVariables.PLAYER_VARIABLES).sprintCounter > 60) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1, false, false));
			}
		} else {
			{
				PotionOfDarwinismModVariables.PlayerVariables _vars = entity.getData(PotionOfDarwinismModVariables.PLAYER_VARIABLES);
				_vars.sprintCounter = 0;
				_vars.markSyncDirty();
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 7) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1, false, false));
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 4, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 4, false, false));
		}
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 2 && Math.random() < 0.05) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1, 0, false, false));
		}
		if (entity instanceof LivingEntity _livEnt13 && _livEnt13.swinging
				&& entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(4)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getType() == HitResult.Type.BLOCK) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 100, 1, false, false));
		}
	}
}