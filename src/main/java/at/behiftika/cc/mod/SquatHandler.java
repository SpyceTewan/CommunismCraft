package at.behiftika.cc.mod;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class SquatHandler {
	public static KeyBinding keybind;
	public static boolean isSquatting;
	
	public static void init() {
		keybind = new KeyBinding("key.squat.desc", Keyboard.KEY_I, "key." + Constants.MOD_ID + ".category");
		ClientRegistry.registerKeyBinding(keybind);
		
		isSquatting = false;
	}
	
	public static void startSquat() {
		isSquatting = true;
		
	}
	
	public static void stopSquat() {
		isSquatting = false;
		
	}
}
