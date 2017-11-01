package arty.outdated.init;

import arty.outdated.Reference;
import arty.outdated.init.armour.CustomArmour;
import arty.outdated.init.items.CustomIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ArmourInit
{
	public static final ArmorMaterial carbonite_armor = EnumHelper.addArmorMaterial("carbonite_armor", Reference.MODID + ":tutorial", 20, new int[]{2, 6, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.8F);
	public static Item carbonite_helmet, carbonite_chestplate, carbonite_leggings, carbonite_boots;

	public static void init()
	{
		carbonite_helmet = new CustomArmour("carbonite_helmet", carbonite_armor, 1, EntityEquipmentSlot.HEAD);
		carbonite_chestplate = new CustomArmour("carbonite_chestplate", carbonite_armor, 1, EntityEquipmentSlot.CHEST);
		carbonite_leggings = new CustomArmour("carbonite_leggings", carbonite_armor, 2, EntityEquipmentSlot.LEGS);
		carbonite_boots = new CustomArmour("carbonite_boots", carbonite_armor, 1, EntityEquipmentSlot.FEET);

	}
	
	public static void register()
	{
		registerItem(carbonite_helmet);
		registerItem(carbonite_chestplate);
		registerItem(carbonite_leggings);
		registerItem(carbonite_boots);
	}
	
	public static void registerItem(Item item)
	{
		
		ForgeRegistries.ITEMS.register(item);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
		new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
