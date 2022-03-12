package one.devos.nautical.pastelwonderland;

import one.devos.nautical.pastelwonderland.common.PastelwonderlandBlocks;
import one.devos.nautical.pastelwonderland.common.GlassBlocks;
import one.devos.nautical.pastelwonderland.common.HiddenItems;
import one.devos.nautical.pastelwonderland.common.Items;
import one.devos.nautical.pastelwonderland.world.dimension.PastelwonderlandDimension;
import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.itemgroup.gui.ItemGroupButton;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import one.devos.nautical.pastelwonderland.util.LoggerHelper;


public class Pastelwonderland implements ModInitializer {

    public static final String MOD_ID = "pastelwonderland";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();


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
            addTab(Icon.of(net.minecraft.world.level.block.Blocks.ACACIA_BUTTON), "items", null);
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
        Items.init();
        PastelwonderlandDimension.init();

        LoggerHelper.log("info", "Pastel Wonderland initializing");
        LoggerHelper.log("dev_info", "Pastel Wonderland Dev Env on Version: " + VERSION);
    }
}
