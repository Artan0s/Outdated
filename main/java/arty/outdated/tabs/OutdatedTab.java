package arty.outdated.tabs;

import arty.outdated.init.BlockInit;
import arty.outdated.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OutdatedTab extends CreativeTabs
{
	public OutdatedTab(String label)
	{
		super("outdatedtab");
		this.setBackgroundImageName("outdated_bg.png");
	}

	public ItemStack getTabIconItem()
	{
		// TODO Auto-generated method stub
		return new ItemStack(BlockInit.compressed_coal_block);
	}
	
	
}
