package com.examplemod.example;

import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(value = Example.MOD_ID, dist = Dist.DEDICATED_SERVER)
public class ExampleModServer extends ExampleModBase {

	public ExampleModServer (IEventBus bus, ModContainer mod) {
		super(bus, mod);
	}

	@Override
	public Level getClientLevel () {
		return null;
	}
}
