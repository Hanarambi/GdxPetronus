package com.russo.gdx.petronus;

import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class PetronusGame extends Game {
    @Override
    public void create() {
        setScreen(new FirstScreen());
    }
}