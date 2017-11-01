package arty.outdated.init;

import arty.outdated.Reference;
import arty.outdated.init.items.CustomIngot;
import arty.outdated.init.tools.CustomPickaxe;
import arty.outdated.init.tools.CustomSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolInit
{
	public static final ToolMaterial carbonite_tool = EnumHelper.addToolMaterial("carbonite_tool", 3, 1300, 8.0F, 1.6F, 10);
	
	public static Item carbonite_pickaxe, carbonite_sword;


	public static void init()
	{
		carbonite_pickaxe = new CustomPickaxe("carbonite_pickaxe", carbonite_tool);
		carbonite_sword = new CustomSword("carbonite_sword", carbonite_tool);
	}
	
	public static void register()
	{
		registerItem(carbonite_pickaxe);
		registerItem(carbonite_sword);
	}
	
	public static void registerItem(Item item)
	{
		
		ForgeRegistries.ITEMS.register(item);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
		new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
