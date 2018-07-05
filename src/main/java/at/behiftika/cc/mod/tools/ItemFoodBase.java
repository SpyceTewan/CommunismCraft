package at.behiftika.cc.mod.tools;

import at.behiftika.cc.mod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood{
	
	protected String name;
	
	public ItemFoodBase(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
	
		this.name = name;
	}
	
	public void registerItemModel() {
		Main.clientProxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemFoodBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
