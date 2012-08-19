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
