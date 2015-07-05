package cg.base.drawer;

import java.awt.Color;
import java.awt.Graphics;

import cg.base.sprite.Sprite;

public class SpriteAnchorDrawer implements SpriteDrawer {
	
	private final Color color;
	
	public SpriteAnchorDrawer(Color color) {
		this.color = color;
	}

	@Override
	public void paint(Sprite sprite, Graphics g, int x, int y) {
		g.setColor(color);
		g.setClip(x - 2, y - 2, 4, 4);
		g.fillRect(x - 1, y - 1, 2, 2);
	}

}
