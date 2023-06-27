package com.onscreennotes;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class OnScreenNotesPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(OnScreenNotesPlugin.class);
		RuneLite.main(args);
	}
}