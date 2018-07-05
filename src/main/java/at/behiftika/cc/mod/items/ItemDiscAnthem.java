package at.behiftika.cc.mod.items;

import at.behiftika.cc.mod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;

public class ItemDiscAnthem extends ItemRecord{
	
	public static String name = "record_anthem";
	
	public ItemDiscAnthem() {
		super(name, Main.anthemEvent);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		Main.clientProxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemDiscAnthem setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
