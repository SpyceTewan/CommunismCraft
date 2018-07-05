package at.behiftika.cc.mod.proxy;

import at.behiftika.cc.mod.Constants;
import at.behiftika.cc.mod.SquatHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Constants.MOD_ID + ":" + id, "inventory"));
	}
	
	public void initClient() {
		SquatHandler.init();
	}
}
