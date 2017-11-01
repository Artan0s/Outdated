package arty.outdated.init.armour;

import arty.outdated.OutdatedMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class CustomArmour extends ItemArmor
{

	public CustomArmour(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(OutdatedMod.outdatedtab);
	}

}
