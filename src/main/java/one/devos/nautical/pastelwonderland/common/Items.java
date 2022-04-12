package one.devos.nautical.pastelwonderland.common;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import static one.devos.nautical.pastelwonderland.Pastelwonderland.MOD_ID;
import static one.devos.nautical.pastelwonderland.Pastelwonderland.PW_ITEM_GROUP;

public class Items {
    public static final Item PEANUT = register("peanut", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(4).saturationMod(3).fast().build())));
    // literally just peanut brittle iced spikes
    public static final Item PEANUT_CHOKER = register("peanut_choker", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item PEANUT_BUTTER = register("peanut_butter", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(9).saturationMod(5).build())));

    public static final Item PASTEL_BASE_POWDER = register("pastel_base_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item LIGHT_RED_PASTEL_POWDER = register("light_red_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item RED_PASTEL_POWDER = register("red_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item ORANGE_PASTEL_POWDER = register("orange_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item YELLOW_PASTEL_POWDER = register("yellow_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item LIGHT_GREEN_PASTEL_POWDER = register("light_green_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item GREEN_PASTEL_POWDER = register("green_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item LIGHT_BLUE_PASTEL_POWDER = register("light_blue_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item BLUE_PASTEL_POWDER = register("blue_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item PURPLE_PASTEL_POWDER = register("purple_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item MAGENTA_PASTEL_POWDER = register("magenta_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item BROWN_PASTEL_POWDER = register("brown_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item BLACK_PASTEL_POWDER = register("black_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item LIGHT_GRAY_PASTEL_POWDER = register("light_gray_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));
    public static final Item GRAY_PASTEL_POWDER = register("gray_pastel_powder", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).maxCount(64)));

    public static final Item BASE_TAFFY = register("base_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.INVISIBILITY, 600, 0), 1.0F).build())));
    public static final Item LIGHT_RED_TAFFY = register("light_red_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 0), 1.0F).build())));
    public static final Item RED_TAFFY = register("red_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 0, 0), 1.0F).build())));
    public static final Item ORANGE_TAFFY = register("orange_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1.0F).build())));
    public static final Item YELLOW_TAFFY = register("yellow_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.DIG_SPEED, 900, 0), 1.0F).build())));
    public static final Item LIGHT_GREEN_TAFFY = register("light_green_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.JUMP, 1200, 0), 1.0F).build())));
    public static final Item GREEN_TAFFY = register("green_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.LUCK, 3600, 0), 1.0F).build())));
    public static final Item CYAN_TAFFY = register("cyan_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0), 1.0F).build())));
    public static final Item LIGHT_BLUE_TAFFY = register("light_blue_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1.0F).build())));
    public static final Item BLUE_TAFFY = register("blue_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 300, 0), 1.0F).build())));
    public static final Item PURPLE_TAFFY = register("purple_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 0), 1.0F).build())));
    public static final Item MAGENTA_TAFFY = register("magenta_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.GLOWING, 0, 0), 1.0F).build())));
    public static final Item BROWN_TAFFY = register("brown_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.LEVITATION, 100, 0), 1.0F).build())));
    public static final Item BLACK_TAFFY = register("black_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 1.0F).build())));
    public static final Item LIGHT_GRAY_TAFFY = register("light_gray_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 1.0F).build())));
    public static final Item GRAY_TAFFY = register("gray_taffy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().alwaysEat().effect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0), 1.0F).build())));

    public static final Item BASE_COTTON_CANDY = register("base_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item LIGHT_RED_COTTON_CANDY = register("light_red_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item RED_COTTON_CANDY = register("red_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item ORANGE_COTTON_CANDY = register("orange_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item YELLOW_COTTON_CANDY = register("yellow_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item LIGHT_GREEN_COTTON_CANDY = register("light_green_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item GREEN_COTTON_CANDY = register("green_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().build())));
    public static final Item CYAN_COTTON_CANDY = register("cyan_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item LIGHT_BLUE_COTTON_CANDY = register("light_blue_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item BLUE_COTTON_CANDY = register("blue_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item PURPLE_COTTON_CANDY = register("purple_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).fast().build())));
    public static final Item MAGENTA_COTTON_CANDY = register("magenta_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item BROWN_COTTON_CANDY = register("brown_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item BLACK_COTTON_CANDY = register("black_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item LIGHT_GRAY_COTTON_CANDY = register("light_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));
    public static final Item GRAY_COTTON_CANDY = register("gray_cotton_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).fast().build())));

    public static final Item BASE_HARD_CANDY = register("base_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item LIGHT_RED_HARD_CANDY = register("light_red_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item RED_HARD_CANDY = register("red_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item ORANGE_HARD_CANDY = register("orange_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item YELLOW_HARD_CANDY = register("yellow_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item LIGHT_GREEN_HARD_CANDY = register("light_green_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item GREEN_HARD_CANDY = register("green_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item CYAN_HARD_CANDY = register("cyan_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item LIGHT_BLUE_HARD_CANDY = register("light_blue_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item BLUE_HARD_CANDY = register("blue_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item PURPLE_HARD_CANDY = register("purple_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item MAGENTA_HARD_CANDY = register("magenta_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item BROWN_HARD_CANDY = register("brown_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item BLACK_HARD_CANDY = register("black_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item LIGHT_GRAY_HARD_CANDY = register("light_gray_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));
    public static final Item GRAY_HARD_CANDY = register("gray_hard_candy", new Item(new OwoItemSettings().group(PW_ITEM_GROUP).tab(2).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));



    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), item);
    }

    public static void init() {}
}
