package dev.hiitsdevin.pastelwonderland.world.features;

import dev.hiitsdevin.pastelwonderland.Blocks;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import com.google.common.collect.ImmutableList;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;

import java.util.OptionalInt;

public class PastelConfigFeatures {
    public static ConfiguredFeature<?, ?> PASTEL_TREES, PASTEL_TREES_GREEN, PASTEL_TREES_RED;
    public static ConfiguredFeature<?, ?> RANDOM_TREES;

    public static void registerFeatures() {
        PASTEL_TREES = register("pastel_trees", Feature.TREE.configure(Configs.PASTEL_TREE_CONFIG));
        PASTEL_TREES_GREEN = register("pastel_trees_green", Feature.TREE.configure(Configs.PASTEL_TREE_GREEN_CONFIG));
        PASTEL_TREES_RED = register("pastel_trees_red", Feature.TREE.configure(Configs.PASTEL_TREE_RED_CONFIG));
        RANDOM_TREES = register("random_trees", Feature.RANDOM_SELECTOR.configure(Configs.RANDOM_TREES_CONFIG).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(7, 0.1F, 2))));
    }

    private static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String id, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, id, configuredFeature);
    }

    public static class Configs {
        public static final TreeFeatureConfig PASTEL_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BROWN.getDefaultState()), new SimpleBlockStateProvider(Blocks.BLUE.getDefaultState()), new LargeOakFoliagePlacer(UniformIntDistribution.of(4), UniformIntDistribution.of(4), 4), new LargeOakTrunkPlacer(3, 11, 0), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build();
        public static final TreeFeatureConfig PASTEL_TREE_GREEN_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BROWN.getDefaultState()), new SimpleBlockStateProvider(Blocks.GREEN.getDefaultState()), new LargeOakFoliagePlacer(UniformIntDistribution.of(4), UniformIntDistribution.of(4), 4), new LargeOakTrunkPlacer(3, 11, 0), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build();
        public static final TreeFeatureConfig PASTEL_TREE_RED_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BROWN.getDefaultState()), new SimpleBlockStateProvider(Blocks.RED.getDefaultState()), new LargeOakFoliagePlacer(UniformIntDistribution.of(4), UniformIntDistribution.of(4), 4), new LargeOakTrunkPlacer(3, 11, 0), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build();

        public static final RandomFeatureConfig RANDOM_TREES_CONFIG = new RandomFeatureConfig(
                ImmutableList.of(Feature.TREE.configure(PASTEL_TREE_RED_CONFIG).withChance(0.2F), Feature.TREE.configure(PASTEL_TREE_GREEN_CONFIG).withChance(0.2F)),
                Feature.TREE.configure(PASTEL_TREE_CONFIG)
        );
    }
}
