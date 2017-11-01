package arty.outdated.init;

import arty.outdated.Reference;
import arty.outdated.init.items.CustomIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemInit
{
	public static Item compressed_coal;
	public static Item carbonite_diamond;

	public static void init()
	{
		compressed_coal = new CustomIngot("compressed_coal");
		carbonite_diamond = new CustomIngot("carbonite_diamond");
	}
	
	public static void register()
	{
		registerItem(compressed_coal);
		registerItem(carbonite_diamond);
	}
	
	public static void registerItem(Item item)
	{
		
		ForgeRegistries.ITEMS.register(item);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
		new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
