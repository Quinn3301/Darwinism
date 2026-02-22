package net.mcreator.potionofdarwinism.procedures;

import net.minecraft.world.level.LevelAccessor;
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
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 2, false, false));
		}
		if (world.getMaxLocalRawBrightness(BlockPos.containing(x, y, z)) < 5) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 220, 1, false, false));
		}
		if (entity.isSprinting()) {
			{
				PotionOfDarwinismModVariables.PlayerVariables _vars = entity.getData(PotionOfDarwinismModVariables.PLAYER_VARIABLES);
				_vars.sprintCounter = entity.getData(PotionOfDarwinismModVariables.PLAYER_VARIABLES).sprintCounter + 1;
				_vars.markSyncDirty();
			}
			if (entity.getData(PotionOfDarwinismModVariables.PLAYER_VARIABLES).sprintCounter > 60) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 3, false, false));
			}
		} else {
			{
				PotionOfDarwinismModVariables.PlayerVariables _vars = entity.getData(PotionOfDarwinismModVariables.PLAYER_VARIABLES);
				_vars.sprintCounter = 0;
				_vars.markSyncDirty();
			}
		}
	}
}