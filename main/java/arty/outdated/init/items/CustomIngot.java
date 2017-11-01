package arty.outdated.init.items;

import arty.outdated.OutdatedMod;
import arty.outdated.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomIngot extends Item
{
	public CustomIngot(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(Reference.MODID, name);
		setCreativeTab(OutdatedMod.outdatedtab);
	}
}
