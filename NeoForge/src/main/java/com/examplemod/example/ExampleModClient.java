package com.examplemod.example;

import net.minecraft.client.Minecraft;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(value = Example.MOD_ID, dist = Dist.CLIENT)
public class ExampleModClient extends ExampleModBase {

	public ExampleModClient (IEventBus bus, ModContainer mod) {
		super(bus, mod);
	}

	@Override
	public Level getClientLevel () {
		return Minecraft.getInstance().level;
	}
}
