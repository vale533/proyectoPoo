package com.proyectopoo.runner.entities;

/**
 * Configuración visual de una zona:
 * - región
 * - nombre
 * - sprite de cactus (suelo)
 * - sprite de pájaro (aire)
 * - Pokémon asociados (si aplica)
 */
public class ZoneTheme {

    private final ZoneId id;
    private final RegionId region;
    private final String displayName;

    private final String cactusSpritePath;
    private final String birdSpritePath;

    private final RunnerPokemonId cactusPokemon;
    private final RunnerPokemonId birdPokemon;

    public ZoneTheme(ZoneId id,
                     RegionId region,
                     String displayName,
                     String cactusSpritePath,
                     String birdSpritePath,
                     RunnerPokemonId cactusPokemon,
                     RunnerPokemonId birdPokemon) {
        this.id = id;
        this.region = region;
        this.displayName = displayName;
        this.cactusSpritePath = cactusSpritePath;
        this.birdSpritePath = birdSpritePath;
        this.cactusPokemon = cactusPokemon;
        this.birdPokemon = birdPokemon;
    }

    public ZoneId id() { return id; }
    public RegionId region() { return region; }
    public String displayName() { return displayName; }

    public String cactusSpritePath() { return cactusSpritePath; }
    public String birdSpritePath() { return birdSpritePath; }

    public RunnerPokemonId cactusPokemon() { return cactusPokemon; }
    public RunnerPokemonId birdPokemon() { return birdPokemon; }
}
