package at.behiftika.cc.mod.tools;


import at.behiftika.cc.mod.Constants;
import at.behiftika.cc.mod.Main;
import at.behiftika.cc.mod.items.ItemBaseballBat;
import at.behiftika.cc.mod.items.ItemDiscAnthem;
import at.behiftika.cc.mod.items.ItemDiscTripaloski;
import at.behiftika.cc.mod.items.ItemGasmask;
import at.behiftika.cc.mod.items.ItemKvass;
import at.behiftika.cc.mod.items.ItemSemechki;
import at.behiftika.cc.mod.items.ItemShoe;
import at.behiftika.cc.mod.items.ItemVodka;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class Items {
	
	public static ItemArmor.ArmorMaterial tracksuit;
	public static ItemArmor.ArmorMaterial gasmaskMaterial;
	
	public static ItemSemechki semechki;
	public static ItemBase sunflower;
	public static ItemArmorBase tracksuit_helmet;
	public static ItemArmorBase tracksuit_chest;
	public static ItemArmorBase tracksuit_legs;
	public static ItemArmorBase tracksuit_boots;
	public static ItemDiscAnthem anthem;
	public static ItemDiscTripaloski tripaloski;
	public static ItemGasmask gasmask;
	public static ItemKvass kvass;
	public static ItemBase jar;
	public static ItemBaseballBat baseballBat;
	public static ItemFoodBase blin;
	public static ItemVodka vodka;
	public static ItemShoe shoe;
	
	public static ToolMaterial baseballBatMaterial;
	public static ToolMaterial shoeMaterial;
	
	
	public static void register(RegistryEvent.Register<Item> e) {
		IForgeRegistry<Item> registry = e.getRegistry();
		tracksuit = EnumHelper.addArmorMaterial("tracksuit", Constants.MOD_ID + ":tracksuit", 1000, new int[] {3, 4, 4, 2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
		gasmaskMaterial = EnumHelper.addArmorMaterial("gasmask", Constants.MOD_ID + ":gasmask", 500, new int[] {4, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0);
		baseballBatMaterial = EnumHelper.addToolMaterial("baseball_bat", 0, 200, 2, 9, 0);
		shoeMaterial = EnumHelper.addToolMaterial("shoe", 0, 300, 3, 4, 0);
		
		semechki = new ItemSemechki().setCreativeTab(Main.communismTab);
		sunflower = new ItemBase("sunflower").setCreativeTab(Main.communismTab);
		
		anthem = new ItemDiscAnthem().setCreativeTab(Main.communismTab);
		tripaloski = new ItemDiscTripaloski().setCreativeTab(Main.communismTab);
		
		tracksuit_helmet = new ItemArmorBase("tracksuit_hat", tracksuit, 0, EntityEquipmentSlot.HEAD).setCreativeTab(Main.communismTab);
		tracksuit_chest = new ItemArmorBase("tracksuit_chest", tracksuit, 0, EntityEquipmentSlot.CHEST).setCreativeTab(Main.communismTab);
		tracksuit_legs = new ItemArmorBase("tracksuit_legs", tracksuit, 0, EntityEquipmentSlot.LEGS).setCreativeTab(Main.communismTab);
		tracksuit_boots = new ItemArmorBase("tracksuit_boots", tracksuit, 0, EntityEquipmentSlot.FEET).setCreativeTab(Main.communismTab);
		
		gasmask = new ItemGasmask("gasmask", gasmaskMaterial, 0, EntityEquipmentSlot.HEAD);
		gasmask.setCreativeTab(Main.communismTab);
		
		kvass = new ItemKvass();
		kvass.setCreativeTab(Main.communismTab);
		vodka = new ItemVodka();
		vodka.setCreativeTab(Main.communismTab);
		jar = new ItemBase("jar");
		jar.setCreativeTab(Main.communismTab);
		blin = new ItemFoodBase("blin", 5, 3,false).setCreativeTab(Main.communismTab);
		
		baseballBat = new ItemBaseballBat(baseballBatMaterial);
		
		shoe = new ItemShoe("babushka_shoe", shoeMaterial);
		
		
		
		registry.registerAll(
				semechki, 
				tracksuit_helmet, 
				tracksuit_chest, 
				tracksuit_legs, 
				tracksuit_boots, 
				sunflower, 
				anthem, 
				tripaloski, 
				gasmask,
				kvass,
				jar,
				baseballBat,
				blin,
				vodka,
				shoe);
		
		
	}
	
	public static void registerItemModels() {
		semechki.registerItemModel();
		tracksuit_helmet.registerItemModel();
		tracksuit_chest.registerItemModel();
		tracksuit_legs.registerItemModel();
		tracksuit_boots.registerItemModel();
		sunflower.registerItemModel();
		anthem.registerItemModel();
		tripaloski.registerItemModel();
		gasmask.registerItemModel();
		kvass.registerItemModel();
		jar.registerItemModel();
		baseballBat.registerItemModel();
		blin.registerItemModel();
		vodka.registerItemModel();
		shoe.registerItemModel();
	}
	
	
}
