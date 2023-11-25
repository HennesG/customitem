package me.hennesg.utils;

import net.minecraft.server.v1_16_R3.NBTBase;
import net.minecraft.server.v1_16_R3.NBTTagCompound;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;
import java.util.Set;

public class CustomItem extends ItemStack {

    public CustomItem(ItemStack stack) {
        super(stack);
    }

    public CustomItem(Material material) {
        super(material);
    }

    /*
    Display Name
     */

    public String getDisplayName() {
        ItemMeta meta = this.getItemMeta();
        return meta.getDisplayName();
    }

    public void setDisplayName(String name) {
        ItemMeta meta = this.getItemMeta();
        meta.setDisplayName(name);
        this.setItemMeta(meta);
    }

    public boolean hasDisplayName() {
        ItemMeta meta = this.getItemMeta();
        return meta.hasDisplayName();
    }

    /*
    Lore
     */

    public List<String> getLore() {
        ItemMeta meta = this.getItemMeta();
        return meta.getLore();
    }

    public void setLore(List<String> lore) {
        ItemMeta meta = this.getItemMeta();
        meta.setLore(lore);
        this.setItemMeta(meta);
    }

    public boolean hasLore() {
        ItemMeta meta = this.getItemMeta();
        return meta.hasLore();
    }

    /*
    Item Flags
     */

    public Set<ItemFlag> getItemFlags() {
        ItemMeta meta = this.getItemMeta();
        return meta.getItemFlags();
    }

    public void addItemFlag(ItemFlag flag) {
        ItemMeta meta = this.getItemMeta();
        meta.addItemFlags(flag);
        this.setItemMeta(meta);
    }

    public void removeItemFlag(ItemFlag flag) {
        ItemMeta meta = this.getItemMeta();
        meta.removeItemFlags(flag);
        this.setItemMeta(meta);
    }

    public boolean hasItemFlag(ItemFlag flag) {
        ItemMeta meta = this.getItemMeta();
        return meta.hasItemFlag(flag);
    }


    /*
    Glow Effect
     */
    public void addGlowEffect() {
        Enchantment enchant;
        if(this.getType() == Material.BOW) {
            enchant = Enchantment.LOOT_BONUS_BLOCKS;
        } else enchant = Enchantment.ARROW_INFINITE;
        this.addUnsafeEnchantment(enchant,1);
        this.addItemFlag(ItemFlag.HIDE_ENCHANTS);
    }


    /*
    Unbreakable
     */
    public void setUnbreakable(boolean b) {
        ItemMeta meta = this.getItemMeta();
        meta.setUnbreakable(b);
        this.setItemMeta(meta);
    }

    /*
    Attributes
     */
    public void setHideUnbreakable(boolean b) {
        if(b) {
            this.addItemFlag(ItemFlag.HIDE_UNBREAKABLE);
        } else this.removeItemFlag(ItemFlag.HIDE_UNBREAKABLE);
    }

    public void setHideAttributes(boolean b) {
        if(b) {
            this.addItemFlag(ItemFlag.HIDE_ATTRIBUTES);
        } else this.removeItemFlag(ItemFlag.HIDE_ATTRIBUTES);
    }


    /*
    NBT Data Section
     */

    public void setNBTTag(String key, NBTBase value) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        tag.set(key, value);
        nmsItem.setTag(tag);
        ItemMeta meta = CraftItemStack.asBukkitCopy(nmsItem).getItemMeta();
        this.setItemMeta(meta);
    }

    public void setNBTTag(String key, boolean value) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        tag.setBoolean(key, value);
        nmsItem.setTag(tag);
        ItemMeta meta = CraftItemStack.asBukkitCopy(nmsItem).getItemMeta();
        this.setItemMeta(meta);
    }

    public void setNBTTag(String key, byte value) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        tag.setByte(key, value);
        nmsItem.setTag(tag);
        ItemMeta meta = CraftItemStack.asBukkitCopy(nmsItem).getItemMeta();
        this.setItemMeta(meta);
    }

    public void setNBTTag(String key, byte[] value) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        tag.setByteArray(key, value);
        nmsItem.setTag(tag);
        ItemMeta meta = CraftItemStack.asBukkitCopy(nmsItem).getItemMeta();
        this.setItemMeta(meta);
    }

    public void setNBTTag(String key, double value) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        tag.setDouble(key, value);
        nmsItem.setTag(tag);
        ItemMeta meta = CraftItemStack.asBukkitCopy(nmsItem).getItemMeta();
        this.setItemMeta(meta);
    }

    public void setNBTTag(String key, float value) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        tag.setFloat(key, value);
        nmsItem.setTag(tag);
        ItemMeta meta = CraftItemStack.asBukkitCopy(nmsItem).getItemMeta();
        this.setItemMeta(meta);
    }

    public void setNBTTag(String key, int value) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        tag.setInt(key, value);
        nmsItem.setTag(tag);
        ItemMeta meta = CraftItemStack.asBukkitCopy(nmsItem).getItemMeta();
        this.setItemMeta(meta);
    }

    public void setNBTTag(String key, int[] value) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        tag.setIntArray(key, value);
        nmsItem.setTag(tag);
        ItemMeta meta = CraftItemStack.asBukkitCopy(nmsItem).getItemMeta();
        this.setItemMeta(meta);
    }

    public void setNBTTag(String key, long value) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        tag.setLong(key, value);
        nmsItem.setTag(tag);
        ItemMeta meta = CraftItemStack.asBukkitCopy(nmsItem).getItemMeta();
        this.setItemMeta(meta);
    }

    public void setNBTTag(String key, short value) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        tag.setShort(key, value);
        nmsItem.setTag(tag);
        ItemMeta meta = CraftItemStack.asBukkitCopy(nmsItem).getItemMeta();
        this.setItemMeta(meta);
    }

    public void setNBTTag(String key, String value) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        tag.setString(key, value);
        nmsItem.setTag(tag);
        ItemMeta meta = CraftItemStack.asBukkitCopy(nmsItem).getItemMeta();
        this.setItemMeta(meta);
    }


    public NBTBase getNBTBase(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.get(key);
    }

    public boolean getNBTBoolean(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.getBoolean(key);
    }

    public byte getNBTByte(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.getByte(key);
    }

    public byte[] getNBTByteArray(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.getByteArray(key);
    }

    public double getNBTDouble(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.getDouble(key);
    }

    public float getNBTFloat(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.getFloat(key);
    }

    public int getNBTInt(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.getInt(key);
    }

    public int[] getNBTIntArray(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.getIntArray(key);
    }

    public long getNBTLong(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.getLong(key);
    }

    public short getNBTShort(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.getShort(key);
    }

    public String getNBTString(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.getString(key);
    }

    public boolean hasNBTTag(String key) {
        net.minecraft.server.v1_16_R3.ItemStack nmsItem = CraftItemStack.asNMSCopy(this);
        if(nmsItem == null) return false;
        NBTTagCompound tag = nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound();
        return tag.hasKey(key);
    }


}

