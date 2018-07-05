package at.behiftika.cc.mod.items;

import at.behiftika.cc.mod.Main;
import net.minecraft.item.ItemSword;

public class ItemBaseballBat extends ItemSword{
	
	public String name;

	public ItemBaseballBat(ToolMaterial material) {
		super(material);
		name = "baseball_bat";
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(Main.communismTab);
	}
	
	public void registerItemModel() {
		Main.clientProxy.registerItemRenderer(this, 0, name);
	}

}
