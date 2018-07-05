package at.behiftika.cc.mod.proxy;

import at.behiftika.cc.mod.Main;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	
	@SuppressWarnings("deprecation")
	public void registerEventHandlers() {
		MinecraftForge.EVENT_BUS.register(Main.eventHandler);
		FMLCommonHandler.instance().bus().register(Main.eventHandler);
	}

}
