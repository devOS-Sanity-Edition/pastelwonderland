package community.devos.nautical.pastelwonderland;

import community.devos.nautical.pastelwonderland.common.Blocks;
import community.devos.nautical.pastelwonderland.common.GlassBlocks;
import community.devos.nautical.pastelwonderland.common.HiddenItems;
import community.devos.nautical.pastelwonderland.common.Items;
import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.itemgroup.gui.ItemGroupButton;
import io.wispforest.owo.itemgroup.gui.ItemGroupTab;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import static community.devos.nautical.pastelwonderland.util.LoggerHelper.log;


public class Pastelwonderland implements ModInitializer {

    public static final String MOD_ID = "pastelwonderland";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();


    public static final OwoItemGroup PW_ITEM_GROUP = new OwoItemGroup(new ResourceLocation(MOD_ID, "pastelwonderland")) {
        @Override
        protected void setup() {
            keepStaticTitle();
            addTab(Icon.of(HiddenItems.RED_BLOCK), "blocks", ItemGroupTab.EMPTY);
            addTab(Icon.of(GlassBlocks.RED_GLASS_ITEM), "decorations", ItemGroupTab.EMPTY);
            addTab(Icon.of(net.minecraft.world.level.block.Blocks.ACACIA_BUTTON), "items", ItemGroupTab.EMPTY);

            addButton(ItemGroupButton.github("https://github.com/devOS-Sanity-Edition/pastelwonderland"));
            addButton(ItemGroupButton.link(Icon.of(new ResourceLocation("owo", "textures/gui/icons.png"), 0, 0, 64, 64), "issues", "https://github.com/devOS-Sanity-Edition/pastelwonderland/issues"));
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(HiddenItems.LOGO);
        }
    };

    @Override
    public void onInitialize() {

        PW_ITEM_GROUP.initialize();

        Blocks.init();
        GlassBlocks.init();
        Items.init();

        log("info", "Pastel Wonderland initializing");
        log("dev_info", "Pastel Wonderland Dev Env on Version: " + VERSION);
    }
}
