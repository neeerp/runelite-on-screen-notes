package com.onscreennotes.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.components.FlatTextField;

public class OnScreenNotesPanelItem extends JPanel
{

	private final FlatTextField nameInput = new FlatTextField();
	private final JLabel rename = new JLabel("Rename");

	private static final Border NAME_BOTTOM_BORDER = new CompoundBorder(
		BorderFactory.createMatteBorder(0, 0, 1, 0, ColorScheme.DARK_GRAY_COLOR),
		BorderFactory.createLineBorder(ColorScheme.DARKER_GRAY_COLOR));

	OnScreenNotesPanelItem() {
		setLayout(new BorderLayout());
		setBackground(ColorScheme.DARK_GRAY_COLOR);

		rename.setFont(FontManager.getRunescapeSmallFont());
		rename.setForeground(ColorScheme.LIGHT_GRAY_COLOR.darker());

		JPanel namePanel = new JPanel(new BorderLayout());
		namePanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
		namePanel.setBorder(NAME_BOTTOM_BORDER);


		JPanel nameActions = new JPanel(new BorderLayout(3, 0));
		nameActions.setBorder(new EmptyBorder(0, 0, 0, 8));
		nameActions.setBackground(ColorScheme.DARKER_GRAY_COLOR);

		nameActions.add(rename, BorderLayout.CENTER);

		nameInput.setText("My Note");
		nameInput.setBorder(null);
		nameInput.setEditable(false);
		nameInput.setBackground(ColorScheme.DARKER_GRAY_COLOR);
		nameInput.setPreferredSize(new Dimension(0, 24));
		nameInput.getTextField().setForeground(Color.WHITE);
		nameInput.getTextField().setBorder(new EmptyBorder(0, 8, 0, 0));

		namePanel.add(nameInput, BorderLayout.CENTER);
		namePanel.add(nameActions, BorderLayout.EAST);

		add(namePanel, BorderLayout.NORTH);
	}
}
