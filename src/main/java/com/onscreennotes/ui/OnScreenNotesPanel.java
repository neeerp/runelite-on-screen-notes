package com.onscreennotes.ui;

import com.onscreennotes.OnScreenNotesConfig;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.screenmarkers.ScreenMarkerPlugin;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.util.ImageUtil;

@Slf4j
public class OnScreenNotesPanel extends PluginPanel
{
	private static final ImageIcon ADD_ICON;
	private static final ImageIcon ADD_HOVER_ICON;

	static
	{
		final BufferedImage addIcon = ImageUtil.loadImageResource(ScreenMarkerPlugin.class, "add_icon.png");
		ADD_ICON = new ImageIcon(addIcon);
		ADD_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(addIcon, 0.53f));
	}
	public void init(OnScreenNotesConfig config)
	{
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JPanel northPanel = buildNorthPanel();
		add(northPanel, BorderLayout.NORTH);

		setBackground(ColorScheme.BRAND_ORANGE);

		JPanel notesContainer = new JPanel();
		notesContainer.setLayout(new BorderLayout());
		notesContainer.setBackground(ColorScheme.GRAND_EXCHANGE_LIMIT);

		notesContainer.setBorder(new EmptyBorder(10, 10, 10, 10));

		add(notesContainer, BorderLayout.CENTER);
	}

	private JPanel buildNorthPanel() {
		JPanel northPanel = new JPanel(new BorderLayout());
		northPanel.setBorder(new EmptyBorder(1, 0, 10, 0));

		JLabel title = new JLabel();
		title.setText("On Screen Notes");
		title.setForeground(Color.WHITE);

		JLabel addMarker = buildAddMarker();

		northPanel.add(title, BorderLayout.WEST);
		northPanel.add(addMarker, BorderLayout.EAST);

		return northPanel;
	}

	private JLabel buildAddMarker() {
		JLabel addMarker = new JLabel(ADD_ICON);

		addMarker.setToolTipText("Add new on screen note");
		addMarker.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent mouseEvent)
			{
				addMarker.setIcon(ADD_HOVER_ICON);
			}

			@Override
			public void mouseExited(MouseEvent mouseEvent)
			{
				addMarker.setIcon(ADD_ICON);
			}
		});

		return addMarker;
	}
}
