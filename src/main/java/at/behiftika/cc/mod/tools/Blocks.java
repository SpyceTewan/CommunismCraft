package at.behiftika.cc.mod.tools;

import at.behiftika.cc.mod.Main;
import at.behiftika.cc.mod.blocks.BlockFlagSoviet;
import at.behiftika.cc.mod.blocks.BlockSunflower;
import at.behiftika.cc.mod.proxy.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class Blocks {
	
	public static BlockSunflower sunflower;
	public static BlockFlagSoviet flagSoviet;
	
	public static void register(RegistryEvent.Register<Block> e) {
		IForgeRegistry<Block> registry = e.getRegistry();
		
		sunflower = new BlockSunflower();
		flagSoviet = new BlockFlagSoviet();
		
		
		registry.registerAll(sunflower, flagSoviet);
		
	}
	
	public static void registerBlockModels() {
		ClientProxy proxy = Main.clientProxy;
		proxy.registerItemRenderer(Item.getItemFromBlock(sunflower), 0, sunflower.name);
		proxy.registerItemRenderer(Item.getItemFromBlock(flagSoviet), 0, flagSoviet.name);
	}
	
	public static void registerItemBlocks(RegistryEvent.Register<Item> e) {
		IForgeRegistry<Item> registry = e.getRegistry();
		registry.register(new ItemBlock(sunflower).setRegistryName(sunflower.name));
		registry.register(flagSoviet.createItemBlock());
	}
	
	public static void registerItemModels() {
		flagSoviet.registerItemModel(Item.getItemFromBlock(flagSoviet));
	}
}
