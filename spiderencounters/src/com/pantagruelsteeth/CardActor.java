package com.pantagruelsteeth;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class CardActor extends Actor
{
  TextureRegion region;

  public CardActor (DeckTextureManager deckTextureManager, Rank rank, Suit suit)
  {
    region = deckTextureManager.getTextureRegion(rank, suit);
  }

  public void draw(SpriteBatch batch, float parentAlpha)
  {
    Color color = getColor();
    batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
    batch.draw(region, getX(), getY(), getOriginX(), getOriginY(), getWidth(),
        getHeight(), getScaleX(), getScaleY(), getRotation());
  }
}
