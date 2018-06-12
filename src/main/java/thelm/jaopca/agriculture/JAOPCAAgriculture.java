package thelm.jaopca.agriculture;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thelm.jaopca.agriculture.agricraft.ModuleAgriCraft;
import thelm.jaopca.agriculture.mysticalagriculture.ModuleMysticalAgriculture;

@Mod(
		modid = JAOPCAAgriculture.MOD_ID,
		name = JAOPCAAgriculture.NAME,
		version = JAOPCAAgriculture.VERSION,
		dependencies = "required-before:jaopca@[1.10.2-2.0.8.87,);after:mysticalagriculture;after:mysticalagradditions;after:agricraft"
		)
public class JAOPCAAgriculture {
	public static final String MOD_ID = "jaopcaagriculture";
	public static final String NAME = "JAOPCAAgriculture";
	public static final String VERSION = "1.10.2-1.0.1.11";
	@Instance(JAOPCAAgriculture.MOD_ID)
	public static JAOPCAAgriculture core;
	public static ModMetadata metadata;

	@EventHandler
	public void firstMovement(FMLPreInitializationEvent event) {
		metadata = event.getModMetadata();
		metadata.autogenerated = false;
		metadata.version = VERSION;
		metadata.authorList.add("TheLMiffy1111");
		metadata.description = "A mod that aims to add crops for more materials to Mystical Agriculture.";

		if(Loader.isModLoaded("agricraft")) {
			ModuleAgriCraft.register();
		}
		if(Loader.isModLoaded("mysticalagriculture")) {
			ModuleMysticalAgriculture.register();
		}
	}
}
