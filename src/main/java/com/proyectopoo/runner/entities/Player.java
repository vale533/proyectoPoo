package com.proyectopoo.runner.entities;

import java.awt.*;

/**
 * Jugador/Pokémon que corre y salta.
 * Basti luego lo usará en GameWorld/GamePanel.
 */
public class Player {

    private double x;
    private double y;
    private double vy = 0;

    private final int groundY;
    private boolean onGround = true;

    private final double gravity = 0.9;
    private final double jumpStrength = -14;

    private RunnerPokemon form;

    public Player(double x, int groundY, RunnerPokemon starterForm) {
        this.x = x;
        this.groundY = groundY;
        this.form = starterForm;
        this.y = groundY - form.hitboxH();
    }

    public void update() {
        vy += gravity;
        y += vy;

        if (y >= groundY - form.hitboxH()) {
            y = groundY - form.hitboxH();
            vy = 0;
            onGround = true;
        } else {
            onGround = false;
        }
    }

    public void jump() {
        if (onGround) {
            vy = jumpStrength;
            onGround = false;
        }
    }

    public void fastDrop() {
        vy = Math.max(vy, 8);
    }

    public void evolveTo(RunnerPokemon newForm) {
        this.form = newForm;
        this.y = groundY - newForm.hitboxH();
    }

    public RunnerPokemon getForm() {
        return form;
    }

    public void render(Graphics g) {
        if (form.sprite() != null) {
            g.drawImage(form.sprite(), (int)x, (int)y, form.hitboxW(), form.hitboxH(), null);
        } else {
            g.setColor(Color.YELLOW);
            g.fillRect((int)x, (int)y, form.hitboxW(), form.hitboxH());
        }
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, form.hitboxW(), form.hitboxH());
    }
}
