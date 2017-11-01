package arty.outdated.init;

import arty.outdated.OutdatedMod;
import arty.outdated.Reference;
import arty.outdated.init.blocks.CustomBlock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockInit
{
	public static Block compressed_coal_block;
	
	public static void init()
	{
		compressed_coal_block = new CustomBlock("compressed_coal_block", 2.0F, 4.0F, 2);
	}
	
	public static void register()
	{
		registerBlock(compressed_coal_block);
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(OutdatedMod.outdatedtab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(compressed_coal_block);
	}
	
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0,
		new ModelResourceLocation(Reference.MODID + ":" + block.getUnlocalizedName().substring(5)));
	}
}
