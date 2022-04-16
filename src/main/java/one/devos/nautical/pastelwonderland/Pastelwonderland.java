package one.devos.nautical.pastelwonderland;

import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.itemgroup.gui.ItemGroupButton;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.ItemStack;
import one.devos.nautical.pastelwonderland.common.blocks.GlassBlocks;
import one.devos.nautical.pastelwonderland.common.PastelwonderlandItems;
import one.devos.nautical.pastelwonderland.common.PastelwonderlandBlocks;
import one.devos.nautical.pastelwonderland.common.entities.mallard.MallardEntity;
import one.devos.nautical.pastelwonderland.util.LoggerHelper;
import one.devos.nautical.pastelwonderland.world.dimension.PastelwonderlandDimension;


public class Pastelwonderland implements ModInitializer {

    public static final String MOD_ID = "pastelwonderland";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();

    public static final EntityType<MallardEntity> MALLARD_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new ResourceLocation(MOD_ID, "mallard"), FabricEntityTypeBuilder.create(MobCategory.CREATURE, MallardEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    public static ResourceLocation locate(String location) {
        if (location.contains(":")) {
            return new ResourceLocation(location); //probably useful if its from another mod
        } else {
            return new ResourceLocation(MOD_ID, location); //so we can be lazy, or if its not from another mod
        }
    }


    public static final OwoItemGroup PW_ITEM_GROUP = new OwoItemGroup(new ResourceLocation(MOD_ID, "pastelwonderland")) {
        @Override
        protected void setup() {
            keepStaticTitle();
            addTab(Icon.of(PastelwonderlandBlocks.RED_PASTEL_BLOCK), "blocks", null);
            addTab(Icon.of(GlassBlocks.RED_GLASS_ITEM), "decorations", null);
            addTab(Icon.of(PastelwonderlandItems.BASE_TAFFY), "items", null);
            addTab(Icon.of(PastelwonderlandBlocks.PASTEL_GRASS), "natural", null);

            addButton(ItemGroupButton.github("https://github.com/devOS-Sanity-Edition/pastelwonderland"));
            addButton(ItemGroupButton.link(Icon.of(new ResourceLocation("owo", "textures/gui/icons.png"), 0, 0, 64, 64), "issues", "https://github.com/devOS-Sanity-Edition/pastelwonderland/issues"));
        }

        @Override
        public ItemStack makeIcon() {
//            return new ItemStack(HiddenItems.LOGO); // this crashes the game atm
            return new ItemStack(PastelwonderlandBlocks.RED_PASTEL_BLOCK);
        }
    };

    @Override
    public void onInitialize() {

        PW_ITEM_GROUP.initialize();

        PastelwonderlandBlocks.init();
        GlassBlocks.init();
        PastelwonderlandItems.init();
        PastelwonderlandDimension.init();

        FabricDefaultAttributeRegistry.register(MALLARD_ENTITY, MallardEntity.createAttributes());

        LoggerHelper.log("info", "Pastel Wonderland initializing");
        LoggerHelper.log("dev_info", "Pastel Wonderland Dev Env on Version: " + VERSION);
    }
}
