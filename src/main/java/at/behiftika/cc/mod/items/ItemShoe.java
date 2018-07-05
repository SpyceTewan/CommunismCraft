package at.behiftika.cc.mod.items;

import at.behiftika.cc.mod.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemShoe extends ItemSword{
	
	public String name;
	
	public ItemShoe(String name, ToolMaterial material) {
		super(material);
		this.name = name;
		setRegistryName(name);
		setUnlocalizedName(name);
		
	}
	
	public void registerItemModel() {
		Main.clientProxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemShoe setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
