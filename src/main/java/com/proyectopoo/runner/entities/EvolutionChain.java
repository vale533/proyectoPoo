package com.proyectopoo.runner.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * Define las evoluciones y el puntaje mínimo para evolucionar.
 */
public class EvolutionChain {

    private static final Map<RunnerPokemonId, Integer> EVOLUTION_SCORE = new HashMap<>();
    private static final Map<RunnerPokemonId, RunnerPokemonId> NEXT_FORM = new HashMap<>();

    static {
        // KANTO
        EVOLUTION_SCORE.put(RunnerPokemonId.BULBASAUR, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.IVYSAUR, 1600);
        NEXT_FORM.put(RunnerPokemonId.BULBASAUR, RunnerPokemonId.IVYSAUR);
        NEXT_FORM.put(RunnerPokemonId.IVYSAUR, RunnerPokemonId.VENASAUR);

        EVOLUTION_SCORE.put(RunnerPokemonId.CHARMANDER, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.CHARMELEON, 1600);
        NEXT_FORM.put(RunnerPokemonId.CHARMANDER, RunnerPokemonId.CHARMELEON);
        NEXT_FORM.put(RunnerPokemonId.CHARMELEON, RunnerPokemonId.CHARIZARD);

        EVOLUTION_SCORE.put(RunnerPokemonId.SQUIRTLE, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.WARTORTLE, 1600);
        NEXT_FORM.put(RunnerPokemonId.SQUIRTLE, RunnerPokemonId.WARTORTLE);
        NEXT_FORM.put(RunnerPokemonId.WARTORTLE, RunnerPokemonId.BLASTOISE);

        // JOHTO
        EVOLUTION_SCORE.put(RunnerPokemonId.CHIKORITA, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.BAYLEEF, 1600);
        NEXT_FORM.put(RunnerPokemonId.CHIKORITA, RunnerPokemonId.BAYLEEF);
        NEXT_FORM.put(RunnerPokemonId.BAYLEEF, RunnerPokemonId.MEGANIUM);

        EVOLUTION_SCORE.put(RunnerPokemonId.CYNDAQUIL, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.QUILAVA, 1600);
        NEXT_FORM.put(RunnerPokemonId.CYNDAQUIL, RunnerPokemonId.QUILAVA);
        NEXT_FORM.put(RunnerPokemonId.QUILAVA, RunnerPokemonId.TYPHLOSION);

        EVOLUTION_SCORE.put(RunnerPokemonId.TOTODILE, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.CROCONAW, 1600);
        NEXT_FORM.put(RunnerPokemonId.TOTODILE, RunnerPokemonId.CROCONAW);
        NEXT_FORM.put(RunnerPokemonId.CROCONAW, RunnerPokemonId.FERALIGATR);

        // HOENN
        EVOLUTION_SCORE.put(RunnerPokemonId.TREECKO, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.GROVYLE, 1600);
        NEXT_FORM.put(RunnerPokemonId.TREECKO, RunnerPokemonId.GROVYLE);
        NEXT_FORM.put(RunnerPokemonId.GROVYLE, RunnerPokemonId.SCEPTILE);

        EVOLUTION_SCORE.put(RunnerPokemonId.TORCHIC, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.COMBUSKEN, 1600);
        NEXT_FORM.put(RunnerPokemonId.TORCHIC, RunnerPokemonId.COMBUSKEN);
        NEXT_FORM.put(RunnerPokemonId.COMBUSKEN, RunnerPokemonId.BLAZIKEN);

        EVOLUTION_SCORE.put(RunnerPokemonId.MUDKIP, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.MARSHTOMP, 1600);
        NEXT_FORM.put(RunnerPokemonId.MUDKIP, RunnerPokemonId.MARSHTOMP);
        NEXT_FORM.put(RunnerPokemonId.MARSHTOMP, RunnerPokemonId.SWAMPERT);

        // SINNOH
        EVOLUTION_SCORE.put(RunnerPokemonId.TURTWIG, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.GROTLE, 1600);
        NEXT_FORM.put(RunnerPokemonId.TURTWIG, RunnerPokemonId.GROTLE);
        NEXT_FORM.put(RunnerPokemonId.GROTLE, RunnerPokemonId.TORTERRA);

        EVOLUTION_SCORE.put(RunnerPokemonId.CHIMCHAR, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.MONFERNO, 1600);
        NEXT_FORM.put(RunnerPokemonId.CHIMCHAR, RunnerPokemonId.MONFERNO);
        NEXT_FORM.put(RunnerPokemonId.MONFERNO, RunnerPokemonId.INFERNAPE);

        EVOLUTION_SCORE.put(RunnerPokemonId.PIPLUP, 800);
        EVOLUTION_SCORE.put(RunnerPokemonId.PRINPLUP, 1600);
        NEXT_FORM.put(RunnerPokemonId.PIPLUP, RunnerPokemonId.PRINPLUP);
        NEXT_FORM.put(RunnerPokemonId.PRINPLUP, RunnerPokemonId.EMPOLEON);
    }

    public static boolean canEvolve(RunnerPokemonId current, int score) {
        Integer required = EVOLUTION_SCORE.get(current);
        return required != null && score >= required;
    }

    public static RunnerPokemonId nextForm(RunnerPokemonId current) {
        return NEXT_FORM.get(current);
    }
}
