package br.com.pokerest.pokerest.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Builder
@AllArgsConstructor
public class Statistics {

    private String type;
    private long totalPokemons;

    // Base Stat Total (BST)
    private double avgBst;
    private int maxBst;
    private int minBst;

    // Speed tiers 
    private double avgSpeed;
    private long fastCount;        // e.g. speed >= 100
    private long mediumSpeedCount; // 60–99
    private long slowCount;        // < 60

    // Offensive vs Defensive bias
    private double avgPhysicalAttack; // attack
    private double avgSpecialAttack;  // spAttack
    private double avgDefense;        // defense
    private double avgSpDefense;      // spDefense

    // Derived ratios 
    private double physicalBiasRatio; // attack / spAttack
    private double bulkRatio;         // (def + spDef) / hp

    // Role distribution 
    private long physicalSweepers; // high atk + high speed
    private long specialSweepers;  // high spAtk + high speed
    private long tanks;            // high hp + defenses
    private long walls;            // very high defenses, low speed
    private long balanced;         // none of the above

    // Legendary influence 
    private long legendaryCount;
    private double legendaryAvgBst;

    // Ability impact 
    private long avgAbilitiesPerPokemon;

    // Typing synergy indicators
    private long dualTypeCount;
    private double avgWeaknessCount;   // requires type chart computation
    private double avgResistanceCount; // same as above
}