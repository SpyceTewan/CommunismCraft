package at.behiftika.cc.mod.items;

import at.behiftika.cc.mod.tools.ItemDrinkBase;
import at.behiftika.cc.mod.tools.Items;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

public class ItemKvass extends ItemDrinkBase{

	public ItemKvass() {
		super("kvass", Items.jar);
	}
	
	
	@Override
	public void onConsumed(EntityLivingBase entity) {
		entity.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 80, 0));
	}
	
	

}
