package at.behiftika.cc.mod.tools;

import at.behiftika.cc.mod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item{
	
	protected String name;
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
	
		this.name = name;
	}
	
	public void registerItemModel() {
		Main.clientProxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
