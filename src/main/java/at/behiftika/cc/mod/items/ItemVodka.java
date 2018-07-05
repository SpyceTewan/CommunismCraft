package at.behiftika.cc.mod.items;

import at.behiftika.cc.mod.tools.ItemDrinkBase;
import at.behiftika.cc.mod.tools.Items;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class ItemVodka extends ItemDrinkBase{

	public ItemVodka() {
		super("vodka", Items.jar);
	}
	
	@Override
	public void onConsumed(EntityLivingBase entity) {
		entity.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 200, 0));
		entity.addPotionEffect(new PotionEffect(MobEffects.POISON, 40, 0));
	}

}
