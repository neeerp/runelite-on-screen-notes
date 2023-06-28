package com.onscreennotes.ui;

import com.onscreennotes.OnScreenNotesConfig;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;

@Slf4j
public class OnScreenNotesPanel extends PluginPanel
{
	public void init(OnScreenNotesConfig config)
	{
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setBackground(ColorScheme.BRAND_ORANGE);

		JPanel notesContainer = new JPanel();
		notesContainer.setLayout(new BorderLayout());
		notesContainer.setBackground(ColorScheme.GRAND_EXCHANGE_LIMIT);

		notesContainer.setBorder(new EmptyBorder(10, 10, 10, 10));

		add(notesContainer, BorderLayout.CENTER);
	}
}
