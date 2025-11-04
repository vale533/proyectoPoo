package com.proyectopoo.runner.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * Registro central de todos los pokemons jugables.
 * Aqui se define nombre, sprite y tamaño.
 */

public class PokemonRegistry {

    private static final Map<RunnerPokemonId, RunnerPokemon> DATA = new HashMap<>();

    static {

        // =========================
        //  INICIALES KANTO
        // =========================
        DATA.put(RunnerPokemonId.BULBASAUR,
                new RunnerPokemon(RunnerPokemonId.BULBASAUR, "Bulbasaur",
                        "/sprites/kanto/bulbasaur.png", 48, 48));

        DATA.put(RunnerPokemonId.CHARMANDER,
                new RunnerPokemon(RunnerPokemonId.CHARMANDER, "Charmander",
                        "/sprites/kanto/charmander.png", 48, 48));

        DATA.put(RunnerPokemonId.SQUIRTLE,
                new RunnerPokemon(RunnerPokemonId.SQUIRTLE, "Squirtle",
                        "/sprites/kanto/squirtle.png", 48, 48));


        // =========================
        //  INICIALES JOHTO
        // =========================
        DATA.put(RunnerPokemonId.CHIKORITA,
                new RunnerPokemon(RunnerPokemonId.CHIKORITA, "Chikorita",
                        "/sprites/johto/chikorita.png",48,48));

        DATA.put(RunnerPokemonId.CYNDAQUIL,
                new RunnerPokemon(RunnerPokemonId.CYNDAQUIL, "Cyndaquil",
                        "/sprites/johto/Cyndaquil.png", 48, 48));

        DATA.put(RunnerPokemonId.TOTODILE,
                new RunnerPokemon(RunnerPokemonId.TOTODILE, "Totodile",
                        "/sprites/johto/totodile.png", 48, 48));


        // =========================
        //  INICIALES HOENN
        // =========================
        DATA.put(RunnerPokemonId.TREECKO,
                new RunnerPokemon(RunnerPokemonId.TREECKO, "Treeko",
                        "/sprites/hoenn/treecko.png",48, 48));

        DATA.put(RunnerPokemonId.TORCHIC,
                new RunnerPokemon(RunnerPokemonId.TORCHIC, "Torchic",
                        "/sprites/hoenn/torchic.png", 48, 48));

        DATA.put(RunnerPokemonId.MUDKIP,
                new RunnerPokemon(RunnerPokemonId.MUDKIP, "Mudkip",
                        "/sprites/hoenn/mudkip.png", 48, 48));

        // =========================
        //  INICIALES SINNOH
        // =========================
        DATA.put(RunnerPokemonId.TURTWIG,
                new RunnerPokemon(RunnerPokemonId.TURTWIG, "Turtwig",
                        "/sprites/sinnoh/turtwig.png", 48, 48));

        DATA.put(RunnerPokemonId.CHIMCHAR,
                new RunnerPokemon(RunnerPokemonId.CHIMCHAR, "Chimchar",
                        "/sprites/sinnoh/chimchar.png", 48, 48));

        DATA.put(RunnerPokemonId.PIPLUP,
                new RunnerPokemon(RunnerPokemonId.PIPLUP, "Piplup",
                        "/sprites/sinnoh/piplup.png", 48, 48));

        // =========================
        //  OBSTÁCULOS DESTACADOS (pueden ser más chicos)
        // =========================

        DATA.put(RunnerPokemonId.METAPOD,
                new RunnerPokemon(RunnerPokemonId.METAPOD, "Metapod",
                        "/sprites/obstacles/kanto/metapod.png", 32, 40));

        DATA.put(RunnerPokemonId.BEEDRILL,
                new RunnerPokemon(RunnerPokemonId.BEEDRILL, "Beedrill",
                        "/sprites/obstacles/kanto/beedrill.png", 40, 40));

        DATA.put(RunnerPokemonId.GASTLY,
                new RunnerPokemon(RunnerPokemonId.GASTLY, "Gastly",
                        "/sprites/obstacles/kanto/gastly.png", 40, 40));

        DATA.put(RunnerPokemonId.SUDOWOODO,
                new RunnerPokemon(RunnerPokemonId.SUDOWOODO, "Sudowoodo",
                        "/sprites/obstacles/johto/sudowoodo.png", 40, 60));

        DATA.put(RunnerPokemonId.HOOTHOOT,
                new RunnerPokemon(RunnerPokemonId.HOOTHOOT, "Hoothoot",
                        "/sprites/obstacles/johto/hoothoot.png", 40, 40));

        DATA.put(RunnerPokemonId.UNOWN,
                new RunnerPokemon(RunnerPokemonId.UNOWN, "Unown",
                        "/sprites/obstacles/johto/unown.png", 32, 32));

        DATA.put(RunnerPokemonId.CACTURNE,
                new RunnerPokemon(RunnerPokemonId.CACTURNE, "Cacturne",
                        "/sprites/obstacles/hoenn/cacturne.png", 40, 60));

        DATA.put(RunnerPokemonId.VIBRABA,
                new RunnerPokemon(RunnerPokemonId.VIBRABA, "Vibrava",
                        "/sprites/obstacles/hoenn/vibrava.png", 40, 40));

        DATA.put(RunnerPokemonId.CARVANHA,
                new RunnerPokemon(RunnerPokemonId.CARVANHA, "Carvanha",
                        "/sprites/obstacles/hoenn/carvanha.png", 40, 40));

        DATA.put(RunnerPokemonId.SHARPEDO,
                new RunnerPokemon(RunnerPokemonId.SHARPEDO, "Sharpedo",
                        "/sprites/obstacles/hoenn/sharpedo.png", 56, 40));

        DATA.put(RunnerPokemonId.SNOVER,
                new RunnerPokemon(RunnerPokemonId.SNOVER, "Snover",
                        "/sprites/obstacles/sinnoh/snover.png", 40, 50));

        DATA.put(RunnerPokemonId.YANMEGA,
                new RunnerPokemon(RunnerPokemonId.YANMEGA, "Yanmega",
                        "/sprites/obstacles/sinnoh/yanmega.png", 50, 40));

        DATA.put(RunnerPokemonId.DRIFLOON,
                new RunnerPokemon(RunnerPokemonId.DRIFLOON, "Drifloon",
                        "/sprites/obstacles/sinnoh/drifloon.png", 36, 48));
    }

    public static RunnerPokemon get(RunnerPokemonId id) {
        return DATA.get(id);
    }
}

