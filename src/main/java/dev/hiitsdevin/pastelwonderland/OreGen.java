package dev.hiitsdevin.pastelwonderland;

/*import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.function.Predicate;

import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;

public class OreGen {


    private static ConfiguredFeature<?, ?> PASTEL_ORE = Feature.ORE
            .configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.STONE), Blocks.PASTEL.getDefaultState(), 9))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 500, 256)))
            .spreadHorizontally()
            .repeat(30);

    public static void init() {
        RegistryKey<ConfiguredFeature<?, ?>> orePastel = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MOD_ID, "orePastel"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePastel.getValue(), PASTEL_ORE);
    }
}*/
