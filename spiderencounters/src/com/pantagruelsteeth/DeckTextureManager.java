package com.pantagruelsteeth;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
// This file is part of "Spider: Encounters".
//
// "Spider: Encounters" is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// "Spider: Encounters" is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with "Spider: Encounters".  If not, see <http://www.gnu.org/licenses/>.

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
