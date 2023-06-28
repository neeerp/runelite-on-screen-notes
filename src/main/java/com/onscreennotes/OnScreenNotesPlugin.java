package com.onscreennotes;

import com.google.inject.Provides;
import com.onscreennotes.ui.OnScreenNotesPanel;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;

@Slf4j
@PluginDescriptor(
	name = "On Screen Notes",
	description = "Enable on screen notes",
	tags = {"notes", "panel", "on screen"}
)
public class OnScreenNotesPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private ClientToolbar clientToolbar;

	private OnScreenNotesPanel panel;

	private NavigationButton navigationButton;

	@Inject
	private OnScreenNotesConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("On Screen Notes started!");
		panel = injector.getInstance(OnScreenNotesPanel.class);
		panel.init(config);

		// TODO: Get an actual icon
		final BufferedImage icon = ImageUtil.loadImageResource(getClass(), "on_screen_notes_icon.png");

		navigationButton = NavigationButton.builder()
			.tooltip("On Screen Notes")
			.icon(icon)
			.panel(panel)
			.build();

		clientToolbar.addNavigation(navigationButton);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("On Screen Notes stopped!");
		clientToolbar.removeNavigation(navigationButton);
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "On Screen Notes says " + config.greeting(), null);
		}
	}

	@Provides
	OnScreenNotesConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(OnScreenNotesConfig.class);
	}
}
