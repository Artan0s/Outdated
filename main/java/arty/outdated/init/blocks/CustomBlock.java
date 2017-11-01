package arty.outdated.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomBlock extends Block
{
	public CustomBlock(String name, float hardness, float resistance, int harvestLevel)
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel("pickaxe", harvestLevel);
	}
}
