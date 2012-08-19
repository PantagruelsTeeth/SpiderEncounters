package com.pantagruelsteeth;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class DeckTextureManager
{

  public DeckTextureManager()
  {
    texture = new Texture(Gdx.files.internal("data/deck1.png"));
    texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
    regions = TextureRegion.split(texture, getCardWidth(), getCardHeight());
  }

  public TextureRegion getTextureRegion(Rank rank, Suit suit)
  {

    return regions[suit.ordinal()][rank.ordinal()];
  }

  public TextureRegion getJoker()
  {
    return regions[4][0];
  }

  public TextureRegion getFaceDown()
  {
    return regions[4][2];
  }

  public void dispose()
  {
    texture.dispose();
  }

  public int getCardWidth()
  {
    return texture.getWidth() / 13;
  }

  public int getCardHeight()
  {
    return texture.getHeight() / 5;
  }

  //
  // Implementation
  //

  private Texture texture;
  private TextureRegion[][] regions;


}
