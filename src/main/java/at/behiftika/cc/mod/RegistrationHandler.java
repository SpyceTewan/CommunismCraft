package at.behiftika.cc.mod;

import at.behiftika.cc.mod.tools.Blocks;
import at.behiftika.cc.mod.tools.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistrationHandler {
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> e) {
		Items.register(e);
		Blocks.registerItemBlocks(e);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> e) {
		Blocks.register(e);
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent e) {
		Items.registerItemModels();
		Blocks.registerItemModels();
		Blocks.registerBlockModels();
	}
}