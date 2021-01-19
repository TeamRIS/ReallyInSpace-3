package org.risteam.ris3.procedures;

import org.risteam.ris3.block.MetorStoneBlock;
import org.risteam.ris3.Ris3ModElements;
import org.risteam.ris3.Ris3Mod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import java.util.logging.Level;
import java.util.Map;

@Ris3ModElements.ModElement.Tag
public class MetorStrikeProcedure extends Ris3ModElements.ModElement {
	public MetorStrikeProcedure(Ris3ModElements instance) {
		super(instance, 82);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				Ris3Mod.LOGGER.warn("Failed to load dependency entity for procedure MetorStrike!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				Ris3Mod.LOGGER.warn("Failed to load dependency x for procedure MetorStrike!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				Ris3Mod.LOGGER.warn("Failed to load dependency y for procedure MetorStrike!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				Ris3Mod.LOGGER.warn("Failed to load dependency z for procedure MetorStrike!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				Ris3Mod.LOGGER.warn("Failed to load dependency world for procedure MetorStrike!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean LaunchStatus = false;
		double RandomZ = 0;
		double RandomX = 0;
		double Y = 0;
		double Level = 0;
		if ((((new java.util.Random()).nextInt((int) 1000000 + 1)) == 23442)) {
			LaunchStatus = (boolean) (false);
			while (((LaunchStatus) == (false))) {
				if ((Math.random() < 0.01)) {
					if ((Math.random() < 0.01)) {
						LaunchStatus = (boolean) (true);
					}
				}
			}
			if (((LaunchStatus) == (true))) {
				if ((Math.random() < 0.5)) {
					Level = (double) 2;
				} else {
					Level = (double) 1;
				}
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity)
							.sendStatusMessage(new StringTextComponent((("PREPARE FOR A METOR STRIKE!") + "" + ((Level)) + "" + (" !"))), (false));
				}
				for (int index1 = 0; index1 < (int) ((10 * (Level))); index1++) {
					if ((Math.random() < 0.5)) {
						RandomX = (double) (x + (Math.random() * 60));
					} else {
						RandomX = (double) (x - (Math.random() * 60));
					}
					if ((Math.random() < 0.5)) {
						RandomZ = (double) (z + (Math.random() * 60));
					} else {
						RandomZ = (double) (z - (Math.random() * 60));
					}
					Y = (double) (y + 40);
					if (world instanceof ServerWorld) {
						LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
						_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (RandomX), (int) (Y), (int) (RandomZ))));
						_ent.setEffectOnly(false);
						((World) world).addEntity(_ent);
					}
				}
				for (int index2 = 0; index2 < (int) ((7 * (Level))); index2++) {
					if ((Math.random() < 0.5)) {
						RandomX = (double) (x + (Math.random() * 40));
					} else {
						RandomX = (double) (x - (Math.random() * 40));
					}
					if ((Math.random() < 0.5)) {
						RandomZ = (double) (z + (Math.random() * 40));
					} else {
						RandomZ = (double) (z - (Math.random() * 40));
					}
					Y = (double) (y + 70);
					if (world instanceof ServerWorld) {
						LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
						_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (RandomX), (int) (Y), (int) (RandomZ))));
						_ent.setEffectOnly(false);
						((World) world).addEntity(_ent);
					}
				}
				for (int index3 = 0; index3 < (int) ((4 * (Level))); index3++) {
					if ((Math.random() < 0.5)) {
						RandomX = (double) (x + (Math.random() * 40));
					} else {
						RandomX = (double) (x - (Math.random() * 40));
					}
					if ((Math.random() < 0.5)) {
						RandomZ = (double) (z + (Math.random() * 40));
					} else {
						RandomZ = (double) (z - (Math.random() * 40));
					}
					Y = (double) (y + 100);
					if (world instanceof ServerWorld) {
						LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
						_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) (RandomX), (int) (Y), (int) (RandomZ))));
						_ent.setEffectOnly(false);
						((World) world).addEntity(_ent);
					}
					world.setBlockState(new BlockPos((int) (RandomX), (int) (Y), (int) (RandomZ)), MetorStoneBlock.block.getDefaultState(), 3);
					entity.attackEntityFrom(DamageSource.HOT_FLOOR, (float) 5);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity)
							.sendStatusMessage(new StringTextComponent("\u00C2\u00A78\u00C2\u00A7nA meteor srtike is occuring nearby!"), (false));
				}
			}
		}
	}
}
