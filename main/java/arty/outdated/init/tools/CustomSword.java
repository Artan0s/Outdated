package arty.outdated.init.tools;

import arty.outdated.OutdatedMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class CustomSword extends ItemSword
{
	public CustomSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(OutdatedMod.outdatedtab);
	}
}
