package com.proyectopoo.runner.entities;

import javax.swing.*;
import java.awt.*;

/**
 * Datos visuales y de hitbox para un Pokémon corredor.
 */
public class RunnerPokemon {

    private final RunnerPokemonId id;
    private final String displayName;
    private final String spritePath; // ruta del PNG en resources
    private final int hitboxW;
    private final int hitboxH;
    private final Image sprite;

    public RunnerPokemon(RunnerPokemonId id,
                         String displayName,
                         String spritePath,
                         int hitboxW,
                         int hitboxH) {

        this.id = id;
        this.displayName = displayName;
        this.spritePath = spritePath;
        this.hitboxW = hitboxW;
        this.hitboxH = hitboxH;

        Image img;
        try {
            if (spritePath != null) {
                img = new ImageIcon(getClass().getResource(spritePath)).getImage();
            } else {
                img = null;
            }
        } catch (Exception e) {
            img = null;
        }
        this.sprite = img;
    }

    public RunnerPokemonId id() {
        return id;
    }

    public String displayName() {
        return displayName;
    }

    public String spritePath() {
        return spritePath;
    }

    public Image sprite() {
        return sprite;
    }

    public int hitboxW() {
        return hitboxW;
    }

    public int hitboxH() {
        return hitboxH;
    }
}
