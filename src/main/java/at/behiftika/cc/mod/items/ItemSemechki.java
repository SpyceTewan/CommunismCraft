package at.behiftika.cc.mod.items;

import at.behiftika.cc.mod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSemechki extends ItemSeedFood{	
	
	public ItemSemechki() {
		super(1, 1, at.behiftika.cc.mod.tools.Blocks.sunflower, Blocks.FARMLAND);
		setUnlocalizedName("semechki");
		setRegistryName("semechki");
		setAlwaysEdible();
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 16;
	}
	
	public void registerItemModel() {
		Main.clientProxy.registerItemRenderer(this, 0, "semechki");
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		super.onFoodEaten(stack, worldIn, player);
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 60, 1));
	}
	
	@Override
	public ItemSemechki setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
