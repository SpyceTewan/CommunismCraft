package at.behiftika.cc.mod;

import api.player.model.ModelPlayerAPI;
import api.player.model.ModelPlayerBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

public class SquatModelPlayer extends ModelPlayerBase{

	public SquatModelPlayer(ModelPlayerAPI arg0) {
		super(arg0);
	}
	
	@Override
	public void setLivingAnimations(EntityLivingBase p, float arg1, float arg2, float arg3) {
		
		
		super.setLivingAnimations(p, arg1, arg2, arg3);
	}

	@Override
	public void afterRender(Entity entity, float paramFloat1, float paramFloat2, float paramFloat3,float paramFloat4, float paramFloat5, float paramFloat6) {
		if(entity instanceof EntityPlayer) {
			EntityPlayer p = (EntityPlayer) entity;
			if(SquatHandler.isSquatting) {
				p.setJumping(false);
				
			}
		}
	
	}
	
	@Override
	public void afterSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramEntity) {
		try {
			if(SquatHandler.isSquatting) {
				for(ModelRenderer b : modelPlayer.boxList) {
					b.offsetY = 0.2f;
				}
				
				//Move body, head and arms down
				modelPlayer.bipedBody.offsetY = 0.35f;
				modelPlayer.bipedHead.offsetY = 0.35f;
				modelPlayer.bipedLeftArm.offsetY = 0.35f;
				modelPlayer.bipedRightArm.offsetY = 0.35f;
				
				//Rotate torso
				modelPlayer.bipedBody.rotateAngleX = (float) (Math.toRadians(15));
				modelPlayer.bipedHead.offsetZ = -0.1f;
				
				//Moving legs to squatting position
				modelPlayer.bipedLeftLeg.rotateAngleX = (float) (Math.toRadians(40));
				modelPlayer.bipedRightLeg.rotateAngleX = (float) (Math.toRadians(40));
				modelPlayer.bipedLeftLeg.offsetZ = -0.15f;
				modelPlayer.bipedRightLeg.offsetZ = -0.15f;
				modelPlayer.bipedLeftLeg.rotateAngleY = (float) (Math.toRadians(15));
				modelPlayer.bipedRightLeg.rotateAngleY = (float) (Math.toRadians(-15));
				modelPlayer.bipedLeftLeg.offsetX = -0.5f;
				modelPlayer.bipedRightLeg.offsetX = 0.5f;
				
				//Put arms on legs
				modelPlayer.bipedLeftArm.rotateAngleX = (float) (Math.toRadians(-40));
				modelPlayer.bipedLeftArm.rotateAngleZ = (float) (Math.toRadians(-10));
				modelPlayer.bipedRightArm.rotateAngleX = (float) (Math.toRadians(-40));
				modelPlayer.bipedRightArm.rotateAngleZ = (float) (Math.toRadians(10));
				
				
				//ARMOR
				//Move body, head and arms down
				modelPlayer.bipedBodyWear.offsetY = 0.35f;
				modelPlayer.bipedHeadwear.offsetY = 0.35f;
				modelPlayer.bipedLeftArmwear.offsetY = 0.35f;
				modelPlayer.bipedRightArmwear.offsetY = 0.35f;
				
				//Rotate torso
				modelPlayer.bipedBodyWear.rotateAngleX = (float) (Math.toRadians(15));
				modelPlayer.bipedHeadwear.offsetZ = -0.1f;
				
				//Moving legs to squatting position
				modelPlayer.bipedLeftLegwear.rotateAngleX = (float) (Math.toRadians(40));
				modelPlayer.bipedRightLegwear.rotateAngleX = (float) (Math.toRadians(40));
				modelPlayer.bipedLeftLegwear.offsetZ = -0.15f;
				modelPlayer.bipedRightLegwear.offsetZ = -0.15f;
				modelPlayer.bipedLeftLegwear.rotateAngleY = (float) (Math.toRadians(15));
				modelPlayer.bipedRightLegwear.rotateAngleY = (float) (Math.toRadians(-15));
				modelPlayer.bipedLeftLegwear.offsetX = -0.5f;
				modelPlayer.bipedRightLegwear.offsetX = 0.5f;
				
				//Put arms on legs
				modelPlayer.bipedLeftArmwear.rotateAngleX = (float) (Math.toRadians(-40));
				modelPlayer.bipedLeftArmwear.rotateAngleZ = (float) (Math.toRadians(-10));
				modelPlayer.bipedRightArmwear.rotateAngleX = (float) (Math.toRadians(-40));
				modelPlayer.bipedRightArmwear.rotateAngleZ = (float) (Math.toRadians(10));
				
				
			}else {
				for(ModelRenderer b : modelPlayer.boxList) {
					b.offsetY = 0;
				}
				//Reset Player
				modelPlayer.bipedBody.offsetY = 0;
				modelPlayer.bipedHead.offsetY = 0;
				modelPlayer.bipedLeftArm.offsetY = 0;
				modelPlayer.bipedRightArm.offsetY = 0;
				modelPlayer.bipedLeftLeg.offsetZ = 0;
				modelPlayer.bipedRightLeg.offsetZ = 0;
				modelPlayer.bipedLeftLeg.offsetX = 0;
				modelPlayer.bipedRightLeg.offsetX = 0;
				modelPlayer.bipedHead.offsetZ = 0;
				
				//Reset Armor
				modelPlayer.bipedBodyWear.offsetY = 0;
				modelPlayer.bipedHeadwear.offsetY = 0;
				modelPlayer.bipedLeftArmwear.offsetY = 0;
				modelPlayer.bipedRightArmwear.offsetY = 0;
				modelPlayer.bipedLeftLegwear.offsetZ = 0;
				modelPlayer.bipedRightLegwear.offsetZ = 0;
				modelPlayer.bipedLeftLegwear.offsetX = 0;
				modelPlayer.bipedRightLegwear.offsetX = 0;
				modelPlayer.bipedHeadwear.offsetZ = 0;
			}
			
		
		}catch(NullPointerException e) {
			
		}
	}
	
	
}