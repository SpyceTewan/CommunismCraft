package at.behiftika.cc.mod;

import at.behiftika.cc.mod.proxy.ClientProxy;
import at.behiftika.cc.mod.proxy.CommonProxy;
import api.player.model.ModelPlayerAPI;
import api.player.render.RenderPlayerAPI;
import at.behiftika.cc.mod.Constants;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * For this I followed the Forge API Documentation and the shadowfacts.net tutorial.
 * 
 * @author Tewan
 * @category mod
 */

@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, version = Constants.MOD_VERSION)
public class Main {
	
	@Mod.Instance(Constants.MOD_ID)
	public static Main instance;
	
	@SidedProxy(serverSide = Constants.PROXY_PATH_COMMON, clientSide = Constants.PROXY_PATH_CLIENT)
	public static CommonProxy proxy;
	public static ClientProxy clientProxy;
	
	public static EventHandler eventHandler;
	
	public static final CommunismTab communismTab = new CommunismTab();
	
	public static ResourceLocation anthemLocation = new ResourceLocation(Constants.MOD_ID, "anthem");
	public static SoundEvent anthemEvent = new SoundEvent(anthemLocation);
	
	public static ResourceLocation tripaloskiLocation = new ResourceLocation(Constants.MOD_ID, "tripaloski");
	public static SoundEvent tripaloskiEvent = new SoundEvent(tripaloskiLocation);
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy = new CommonProxy();
		clientProxy = new ClientProxy();
		eventHandler = new EventHandler();
		
		RenderPlayerAPI.register(Constants.MOD_ID + "_squat_render", SquatRenderPlayer.class);
		ModelPlayerAPI.register(Constants.MOD_ID + "_squat_model", SquatModelPlayer.class);
		
		clientProxy.initClient();
		proxy.registerEventHandlers();
		
		System.out.println("CommunismCraft Loading!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
}
