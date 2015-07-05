package cg.base.drawer;

import java.awt.Graphics;

import cg.base.sprite.Sprite;

public interface SpriteDrawer {
	
	void paint(Sprite sprite, Graphics g, int x, int y);

}
