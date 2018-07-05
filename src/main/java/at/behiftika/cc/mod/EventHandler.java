package at.behiftika.cc.mod;

import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EventHandler {
	
	private static boolean pressed = false;
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onKeyPressed(KeyInputEvent e) {
		
		if(SquatHandler.keybind.isPressed() && !pressed) {
			pressed = true;
			if(SquatHandler.isSquatting) {
				SquatHandler.stopSquat();
				
			}else {
				SquatHandler.startSquat();
				
			}
		}else if(!SquatHandler.keybind.isPressed()){
			pressed = false;
		}
	}
}
