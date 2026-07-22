package com.examplemod.example;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public interface Example {

	String NAME = "Example";
	String MOD_ID = "example";
	Logger LOGGER = LoggerFactory.getLogger(NAME);

	static ModBase getInstance () {
		return ModBase.INSTANCE;
	}

	Collection<ServerPlayer> getPlayers ();

	Level getClientLevel ();

	MinecraftServer getServer ();

}
