package at.behiftika.cc.mod;

import at.behiftika.cc.mod.tools.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CommunismTab extends CreativeTabs{

	public CommunismTab() {
		super(Constants.MOD_ID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.semechki);
	}

}
