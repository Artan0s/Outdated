package arty.outdated.init.tools;

import arty.outdated.OutdatedMod;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe
{
	public CustomPickaxe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(OutdatedMod.outdatedtab);
	}
	
}
