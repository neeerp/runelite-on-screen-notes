package com.onscreennotes.ui;

import com.onscreennotes.OnScreenNotesPlugin;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import net.runelite.client.plugins.screenmarkers.ScreenMarkerPlugin;
import net.runelite.client.util.ImageUtil;

public class OnScreenNotesIcons
{
	public static final ImageIcon ADD_ICON;
	public static final ImageIcon ADD_HOVER_ICON;

	public static final ImageIcon BORDER_COLOR_ICON;
	public static final ImageIcon BORDER_COLOR_HOVER_ICON;
	public static final ImageIcon NO_BORDER_COLOR_ICON;
	public static final ImageIcon NO_BORDER_COLOR_HOVER_ICON;

	public static final ImageIcon FILL_COLOR_ICON;
	public static final ImageIcon FILL_COLOR_HOVER_ICON;
	public static final ImageIcon NO_FILL_COLOR_ICON;
	public static final ImageIcon NO_FILL_COLOR_HOVER_ICON;

	public static final ImageIcon LABEL_ICON;
	public static final ImageIcon LABEL_HOVER_ICON;
	public static final ImageIcon NO_LABEL_ICON;
	public static final ImageIcon NO_LABEL_HOVER_ICON;

	public static final ImageIcon VISIBLE_ICON;
	public static final ImageIcon VISIBLE_HOVER_ICON;
	public static final ImageIcon INVISIBLE_ICON;
	public static final ImageIcon INVISIBLE_HOVER_ICON;

	public static final ImageIcon DELETE_ICON;
	public static final ImageIcon DELETE_HOVER_ICON;

	public static final ImageIcon CONFIRM_ICON;
	public static final ImageIcon CONFIRM_HOVER_ICON;
	public static final ImageIcon CONFIRM_LOCKED_ICON;
	public static final ImageIcon CANCEL_ICON;
	public static final ImageIcon CANCEL_HOVER_ICON;

	static
	{
		final BufferedImage addIcon = ImageUtil.loadImageResource(OnScreenNotesPlugin.class, "add_icon.png");
		ADD_ICON = new ImageIcon(addIcon);
		ADD_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(addIcon, 0.53f));

		final BufferedImage borderImg = ImageUtil.loadImageResource(ScreenMarkerPlugin.class, "border_color_icon.png");
		final BufferedImage borderImgHover = ImageUtil.luminanceOffset(borderImg, -150);
		BORDER_COLOR_ICON = new ImageIcon(borderImg);
		BORDER_COLOR_HOVER_ICON = new ImageIcon(borderImgHover);

		NO_BORDER_COLOR_ICON = new ImageIcon(borderImgHover);
		NO_BORDER_COLOR_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(borderImgHover, -100));

		final BufferedImage fillImg = ImageUtil.loadImageResource(ScreenMarkerPlugin.class, "fill_color_icon.png");
		final BufferedImage fillImgHover = ImageUtil.luminanceOffset(fillImg, -150);
		FILL_COLOR_ICON = new ImageIcon(fillImg);
		FILL_COLOR_HOVER_ICON = new ImageIcon(fillImgHover);

		NO_FILL_COLOR_ICON = new ImageIcon(fillImgHover);
		NO_FILL_COLOR_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(fillImgHover, -100));

		final BufferedImage labelImg = ImageUtil.loadImageResource(ScreenMarkerPlugin.class, "label_icon.png");
		final BufferedImage labelImgHover = ImageUtil.luminanceOffset(labelImg, -150);
		LABEL_ICON = new ImageIcon(labelImg);
		LABEL_HOVER_ICON = new ImageIcon(labelImgHover);

		NO_LABEL_ICON = new ImageIcon(labelImgHover);
		NO_LABEL_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(labelImgHover, -100));

		final BufferedImage visibleImg = ImageUtil.loadImageResource(ScreenMarkerPlugin.class, "visible_icon.png");
		VISIBLE_ICON = new ImageIcon(visibleImg);
		VISIBLE_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(visibleImg, -100));

		final BufferedImage invisibleImg = ImageUtil.loadImageResource(ScreenMarkerPlugin.class, "invisible_icon.png");
		INVISIBLE_ICON = new ImageIcon(invisibleImg);
		INVISIBLE_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(invisibleImg, -100));

		final BufferedImage deleteImg = ImageUtil.loadImageResource(ScreenMarkerPlugin.class, "delete_icon.png");
		DELETE_ICON = new ImageIcon(deleteImg);
		DELETE_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(deleteImg, -100));

		CONFIRM_ICON = new ImageIcon(ImageUtil.loadImageResource(OnScreenNotesPlugin.class, "confirm_icon.png"));
		CANCEL_ICON = new ImageIcon(ImageUtil.loadImageResource(OnScreenNotesPlugin.class, "cancel_icon.png"));

		final BufferedImage confirmIcon = ImageUtil.bufferedImageFromImage(CONFIRM_ICON.getImage());
		CONFIRM_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(confirmIcon, 0.54f));
		CONFIRM_LOCKED_ICON = new ImageIcon(ImageUtil.grayscaleImage(confirmIcon));
		CANCEL_HOVER_ICON = new ImageIcon(ImageUtil.alphaOffset(ImageUtil.bufferedImageFromImage(CANCEL_ICON.getImage()), 0.6f));
	}
}
