package com.proyectopoo.runner.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * Registro de todas las zonas (mapas) con sus obstáculos cactus/pájaro.
 */
public class ZoneRegistry {

    private static final Map<ZoneId, ZoneTheme> ZONES = new HashMap<>();

    static {
        // KANTO – Bosque Verde (Metapod + Beedrill)
        ZONES.put(
                ZoneId.KANTO_VIRIDIAN_FOREST,
                new ZoneTheme(
                        ZoneId.KANTO_VIRIDIAN_FOREST,
                        RegionId.KANTO,
                        "Bosque Verde",
                        "/sprites/obstacles/kanto/viridian_metapod.png",
                        "/sprites/obstacles/kanto/viridian_beedrill.png",
                        RunnerPokemonId.METAPOD,
                        RunnerPokemonId.BEEDRILL
                )
        );

        // KANTO – Torre Pokémon (Lápidas + Gastly)
        ZONES.put(
                ZoneId.KANTO_POKEMON_TOWER,
                new ZoneTheme(
                        ZoneId.KANTO_POKEMON_TOWER,
                        RegionId.KANTO,
                        "Torre Pokémon",
                        "/sprites/obstacles/kanto/tower_grave.png",   // lápidas
                        "/sprites/obstacles/kanto/tower_gastly.png",
                        null,                                         // obj inanimado
                        RunnerPokemonId.GASTLY
                )
        );

        // JOHTO – Ciudad Iris (Sudowoodo + Hoothoot)
        ZONES.put(
                ZoneId.JOHTO_GOLDENROD_CITY,
                new ZoneTheme(
                        ZoneId.JOHTO_GOLDENROD_CITY,
                        RegionId.JOHTO,
                        "Ciudad Iris",
                        "/sprites/obstacles/johto/sudowoodo.png",
                        "/sprites/obstacles/johto/hoothoot.png",
                        RunnerPokemonId.SUDOWOODO,
                        RunnerPokemonId.HOOTHOOT
                )
        );

        // JOHTO – Ruinas Alfa (Estructura + Unown)
        ZONES.put(
                ZoneId.JOHTO_RUINS_OF_ALPH,
                new ZoneTheme(
                        ZoneId.JOHTO_RUINS_OF_ALPH,
                        RegionId.JOHTO,
                        "Ruinas Alfa",
                        "/sprites/obstacles/johto/alph_structure.png",
                        "/sprites/obstacles/johto/unown.png",
                        null,
                        RunnerPokemonId.UNOWN
                )
        );

        // HOENN – Ruta 111 (Cacturne + Vibrava)
        ZONES.put(
                ZoneId.HOENN_ROUTE_111,
                new ZoneTheme(
                        ZoneId.HOENN_ROUTE_111,
                        RegionId.HOENN,
                        "Ruta 111",
                        "/sprites/obstacles/hoenn/cacturne.png",
                        "/sprites/obstacles/hoenn/vibrava.png",
                        RunnerPokemonId.CACTURNE,
                        RunnerPokemonId.VIBRABA
                )
        );

        // HOENN – Buceo (Carvanha + Sharpedo)
        ZONES.put(
                ZoneId.HOENN_SEAFLOOR,
                new ZoneTheme(
                        ZoneId.HOENN_SEAFLOOR,
                        RegionId.HOENN,
                        "Buceo",
                        "/sprites/obstacles/hoenn/carvanha.png",
                        "/sprites/obstacles/hoenn/sharpedo.png",
                        RunnerPokemonId.CARVANHA,
                        RunnerPokemonId.SHARPEDO
                )
        );

        // SINNOH – Ruta 216 (Snover + Yanmega)
        ZONES.put(
                ZoneId.SINNOH_ROUTE_216,
                new ZoneTheme(
                        ZoneId.SINNOH_ROUTE_216,
                        RegionId.SINNOH,
                        "Ruta 216",
                        "/sprites/obstacles/sinnoh/snover.png",
                        "/sprites/obstacles/sinnoh/yanmega.png",
                        RunnerPokemonId.SNOVER,
                        RunnerPokemonId.YANMEGA
                )
        );

        // SINNOH – Bosque Vetusto (Troncos + Drifloon)
        ZONES.put(
                ZoneId.SINNOH_ETERNA_FOREST,
                new ZoneTheme(
                        ZoneId.SINNOH_ETERNA_FOREST,
                        RegionId.SINNOH,
                        "Bosque Vetusto",
                        "/sprites/obstacles/sinnoh/logs.png",         // troncos
                        "/sprites/obstacles/sinnoh/drifloon.png",
                        null,
                        RunnerPokemonId.DRIFLOON
                )
        );
    }

    public static ZoneTheme get(ZoneId id) {
        return ZONES.get(id);
    }
}
