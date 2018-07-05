package at.behiftika.cc.mod.items;

import at.behiftika.cc.mod.tools.ItemArmorBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemGasmask extends ItemArmorBase{

	public ItemGasmask(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 1, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 1, 1, false, false));
	}
}
