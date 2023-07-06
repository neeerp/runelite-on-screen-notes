package com.onscreennotes.ui;

import com.onscreennotes.OnScreenNotesPlugin;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import net.runelite.client.util.ImageUtil;

public class OnScreenNotesElements
{
	public static final ImageIcon CONFIRM_ICON;
	public static final ImageIcon CONFIRM_HOVER_ICON;
	public static final ImageIcon CONFIRM_LOCKED_ICON;
	public static final ImageIcon CANCEL_ICON;
	public static final ImageIcon CANCEL_HOVER_ICON;

	static {
		CONFIRM_ICON = new ImageIcon(ImageUtil.loadImageResource(OnScreenNotesPlugin.class, "confirm_icon.png"));
		CANCEL_ICON = new ImageIcon(ImageUtil.loadImageResource(OnScreenNotesPlugin.class, "cancel_icon.png"));

		final BufferedImage confirmIcon = ImageUtil.bufferedImageFromImage(CONFIRM_ICON.getImage());
		CONFIRM_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(confirmIcon, 0.54f));
		CONFIRM_LOCKED_ICON = new ImageIcon(ImageUtil.grayscaleImage(confirmIcon));
		CANCEL_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(ImageUtil.bufferedImageFromImage(CANCEL_ICON.getImage()), 0.6f));
	}
}
