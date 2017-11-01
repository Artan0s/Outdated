package arty.outdated.handlers;

import arty.outdated.init.ArmourInit;
import arty.outdated.init.BlockInit;
import arty.outdated.init.ItemInit;
import arty.outdated.init.ToolInit;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
@EventBusSubscriber
public class RegistryHandler
{
	public static void Client()
	{
		ItemInit.register();
		BlockInit.registerRenders();
		ToolInit.register();
		ArmourInit.register();
		RecipyHandler.registerCrafting();
		RecipyHandler.registerSmelting();
	}
	
	public static void Common()
	{
		ItemInit.init();
		BlockInit.init();
		BlockInit.register();
		ToolInit.init();
		ArmourInit.init();
		
	}
}
