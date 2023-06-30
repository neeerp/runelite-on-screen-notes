package com.onscreennotes.ui;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.components.FlatTextField;

public class OnScreenNotesPanelItem extends JPanel
{

	private final FlatTextField nameInput = new FlatTextField();

	private static final Border NAME_BOTTOM_BORDER = new CompoundBorder(
		BorderFactory.createMatteBorder(0, 0, 1, 0, ColorScheme.DARK_GRAY_COLOR),
		BorderFactory.createLineBorder(ColorScheme.DARKER_GRAY_COLOR));

	OnScreenNotesPanelItem() {
		setLayout(new BorderLayout());
		setBackground(ColorScheme.DARK_GRAY_COLOR);

		JPanel namePanel = new JPanel(new BorderLayout());
		namePanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
		namePanel.setBorder(NAME_BOTTOM_BORDER);

		nameInput.setText("My Note");
		nameInput.setEditable(false);

		namePanel.add(nameInput, BorderLayout.CENTER);

		add(namePanel, BorderLayout.NORTH);
	}
}
