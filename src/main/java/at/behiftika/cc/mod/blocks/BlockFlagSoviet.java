package at.behiftika.cc.mod.blocks;

import at.behiftika.cc.mod.Main;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockFlagSoviet extends BlockHorizontal{
	
	public String name;
	//LOL HAHAHA XDD MARKO IST EIN DOMA IDIOT :D:DDDD SEN NUDES TO 423 32523 634723 
	protected static final AxisAlignedBB FLAG_AABB = new AxisAlignedBB(0.6875, 0.0D, 0.4375, 0.8125, 1.875, 0.5625);
	
	public BlockFlagSoviet() {
		super(Material.WOOD);
		name = "flag_soviet";
		setRegistryName(name);
		setUnlocalizedName(name);
		setHardness(1);
		setResistance(1);
		setCreativeTab(Main.communismTab);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	public void registerItemModel(Item itemBlock) {
		Main.clientProxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}
	
	@Override
	public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos) {
		return false;
	}
	
	@Override
	public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side) {
		return side == EnumFacing.UP;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return FLAG_AABB;
	}
	
	@Override
	public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
		return true;
	}
		
	
}
