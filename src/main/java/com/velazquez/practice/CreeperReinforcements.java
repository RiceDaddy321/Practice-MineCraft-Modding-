package com.velazquez.practice;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CreeperReinforcements {

    @SubscribeEvent
    public void spawnReinforcements(LivingDeathEvent event) {
        if(!(event.getEntity() instanceof EntityCreeper)) {
            return;
        }

        for (int i=0;i<5;i++) {
            EntityCreeper creeper = new EntityCreeper(event.getEntity().getEntityWorld());
            creeper.setLocationAndAngles(event.getEntity().posX,
                    event.getEntity().posY,
                    event.getEntity().posZ,
                    0,
                    0);

            if(!event.getEntity().getEntityWorld().isRemote &&
                    (event.getEntityLiving().getLastDamageSource().isProjectile())) {
                event.getEntity().getEntityWorld().spawnEntity(creeper);
            }
        }
    }
}
