package cg.base.drawer;

import java.awt.Graphics;

import cg.base.sprite.Sprite;

public class CompositeSpriteDrawer implements SpriteDrawer {
	
	private SpriteDrawer[] spriteDraws;
	
	public CompositeSpriteDrawer(SpriteDrawer[] spriteDraws) {
		this.spriteDraws = spriteDraws;
	}

	@Override
	public void paint(Sprite sprite, Graphics g, int x, int y) {
		for (SpriteDrawer spriteDraw : spriteDraws) {
			spriteDraw.paint(sprite, g, x, y);
		}
	}

}
