package com.velazquez.practice;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ZombieKnight {

    @SubscribeEvent
    public void giveArmor(EntityJoinWorldEvent event) {
        if(!(event.getEntity() instanceof EntityZombie)) {
            return;
        }

        EntityZombie zombie = (EntityZombie) event.getEntity();

        zombie.setItemStackToSlot(EntityEquipmentSlot.HEAD, Items.DIAMOND_HELMET.getDefaultInstance());
        zombie.setItemStackToSlot(EntityEquipmentSlot.CHEST, Items.DIAMOND_CHESTPLATE.getDefaultInstance());
        zombie.setItemStackToSlot(EntityEquipmentSlot.LEGS, Items.DIAMOND_LEGGINGS.getDefaultInstance());
        zombie.setItemStackToSlot(EntityEquipmentSlot.FEET, Items.DIAMOND_BOOTS.getDefaultInstance());
        zombie.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, Items.DIAMOND_AXE.getDefaultInstance());
        zombie.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, Items.SHIELD.getDefaultInstance());

        /*System.out.println();
        System.out.println("Slot Index: " + EntityEquipmentSlot.HEAD.getSlotIndex() + "of type: " +
                EntityEquipmentSlot.HEAD.getSlotType());
        System.out.println("Slot Index: " + EntityEquipmentSlot.HEAD + "of type: " +
                EntityEquipmentSlot.MAINHAND.getSlotType());*/
    }


/*
        EntityPlayer player = (EntityPlayer) event.getEntity();

        *//*player.replaceItemInInventory(103, Items.DIAMOND_HELMET.getDefaultInstance());
        player.replaceItemInInventory(102, Items.DIAMOND_CHESTPLATE.getDefaultInstance());
        player.replaceItemInInventory(101, Items.DIAMOND_LEGGINGS.getDefaultInstance());
        player.replaceItemInInventory(100, Items.DIAMOND_BOOTS.getDefaultInstance());*//*

        *//*if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) == ItemStack.EMPTY) {
            player.setItemStackToSlot(EntityEquipmentSlot.HEAD, Items.DIAMOND_HELMET.getDefaultInstance());
        }
        if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) == ItemStack.EMPTY) {
            player.setItemStackToSlot(EntityEquipmentSlot.CHEST, Items.DIAMOND_CHESTPLATE.getDefaultInstance());
        }
        if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) == ItemStack.EMPTY) {
            player.setItemStackToSlot(EntityEquipmentSlot.LEGS, Items.DIAMOND_LEGGINGS.getDefaultInstance());
        }
        if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET) == ItemStack.EMPTY) {
            player.setItemStackToSlot(EntityEquipmentSlot.FEET, Items.DIAMOND_BOOTS.getDefaultInstance());
        }*//*

        *//*if (player.getHeldItemOffhand() != ItemStack.EMPTY) {
            System.out.println(player.getName() + " has a " + player.getHeldItemOffhand().getDisplayName());
        } else {
            System.out.println(player.getName() + " has nothing in offhand");
            player.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, Items.SHIELD.getDefaultInstance());
        }*//*

        if (player.getHeldItemMainhand() == ItemStack.EMPTY) {
            System.out.println(player.getName() + " has nothing in mainhand");
            player.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.DIAMOND_AXE));
        } else {
            System.out.println(player.getName() + " has a " + player.getHeldItemMainhand().getDisplayName());

        }

        *//*player.replaceItemInInventory(0, Items.DIAMOND_AXE.getDefaultInstance());*//*

    }*/
}
