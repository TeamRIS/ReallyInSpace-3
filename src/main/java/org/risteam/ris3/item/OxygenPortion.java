
package org.risteam.ris3.item;

import org.risteam.ris3.potion.OxygenPotionEffect;
import org.risteam.ris3.Ris3ModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.EffectInstance;

@Ris3ModElements.ModElement.Tag
public class OxygenPortion extends Ris3ModElements.ModElement {
	@ObjectHolder("ris3:oxygen_portion")
	public static final Potion potionType = null;
	public OxygenPortion(Ris3ModElements instance) {
		super(instance, 57);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(OxygenPotionEffect.potion, 3600, 1));
			setRegistryName("oxygen_portion");
		}
	}
}
