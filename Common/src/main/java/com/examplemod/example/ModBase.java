package com.examplemod.example;

import net.minecraft.server.level.ServerPlayer;

import java.util.Collection;
import java.util.Collections;

public abstract class ModBase implements Example {

	static ModBase INSTANCE;

	public ModBase () {
		if (INSTANCE != null) throw new IllegalStateException(String.format("%s already initialized!", Example.NAME));
		INSTANCE = this;
	}

	@Override
	public Collection<ServerPlayer> getPlayers () {
		var server = getServer();
		if (server != null) return server.getPlayerList().getPlayers();
		return Collections.emptyList();
	}
}
