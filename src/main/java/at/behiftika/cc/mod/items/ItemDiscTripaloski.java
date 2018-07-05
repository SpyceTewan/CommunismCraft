package at.behiftika.cc.mod.items;

import at.behiftika.cc.mod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;

public class ItemDiscTripaloski extends ItemRecord{
	
	public static String name = "record_tripaloski";
	
	public ItemDiscTripaloski() {
		super(name, Main.tripaloskiEvent);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		Main.clientProxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemDiscTripaloski setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
