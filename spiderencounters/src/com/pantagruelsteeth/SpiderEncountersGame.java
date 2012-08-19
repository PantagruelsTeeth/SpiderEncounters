package com.pantagruelsteeth;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class SpiderEncountersGame implements ApplicationListener
{
  private Stage stage;
  private DeckTextureManager deckTextureManager;

  @Override
  public void create()
  {
    stage = new Stage();
    deckTextureManager = new DeckTextureManager();
    Gdx.input.setInputProcessor(stage);

    CardActor cardActor = new CardActor(deckTextureManager, Rank.Ace, Suit.Diamonds);
    cardActor.setBounds(100, 0, deckTextureManager.getCardWidth(), deckTextureManager.getCardHeight());
    stage.addActor(cardActor);
  }

  @Override
  public void resize(int width, int height)
  {
    stage.setViewport(width, height, true);
  }

  @Override
  public void render()
  {
    Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
    stage.act(Gdx.graphics.getDeltaTime());
    stage.draw();
  }

  @Override
  public void dispose()
  {
    stage.dispose();
  }

  @Override
  public void pause()
  {
  }

  @Override
  public void resume()
  {
  }
}
