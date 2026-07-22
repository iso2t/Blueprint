package com.examplemod.example;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.server.ServerLifecycleHooks;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Collections;

public abstract class ExampleModBase extends ModBase {

	public ExampleModBase (IEventBus bus, ModContainer mod) {
	}

	@Override
	public Collection<ServerPlayer> getPlayers () {
		var server = getServer();
		if (server != null) return server.getPlayerList().getPlayers();
		return Collections.emptyList();
	}

	@Nullable
	@Override
	public MinecraftServer getServer () {
		return ServerLifecycleHooks.getCurrentServer();
	}
}
