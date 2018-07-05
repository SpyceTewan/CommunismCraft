package at.behiftika.cc.mod.blocks;

import at.behiftika.cc.mod.tools.Items;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;

public class BlockSunflower extends BlockCrops{
	
	public String name;
	
	public BlockSunflower() {
		name = "sunflower_crops";
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
	}
	
	@Override
	protected Item getSeed() {
		return Items.semechki;
	}
	
	@Override
	protected Item getCrop() {
		return Items.sunflower;
	}
	
	
}
