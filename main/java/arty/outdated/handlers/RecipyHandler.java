package arty.outdated.handlers;

import arty.outdated.init.BlockInit;
import arty.outdated.init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipyHandler
{
	public static void registerCrafting()
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("om:compressed_coal"), new ResourceLocation("om:carbonite_blocks"), new ItemStack(ItemInit.compressed_coal),
		new Object[]{"XXX", "XYX", "XXX", 'X',  Items.COAL, 'Y', Items.REDSTONE});
		GameRegistry.addShapedRecipe(new ResourceLocation("om:comopressed_coal_block"), new ResourceLocation("om:carbonite_blocks"), new ItemStack(BlockInit.compressed_coal_block),
		new Object[] {"XXX", "XXX", "XXX", 'X', ItemInit.compressed_coal});
	}
	
	public static void registerSmelting()
	{
		GameRegistry.addSmelting(ItemInit.compressed_coal, new ItemStack(ItemInit.carbonite_diamond), 10);
	}
}
