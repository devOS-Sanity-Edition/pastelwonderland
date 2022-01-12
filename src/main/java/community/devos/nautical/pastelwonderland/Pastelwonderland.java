package community.devos.nautical.pastelwonderland;

import community.devos.nautical.pastelwonderland.common.Blocks;
import community.devos.nautical.pastelwonderland.common.GlassBlocks;
import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import io.wispforest.owo.itemgroup.gui.ItemGroupTab;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
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
            addTab(Icon.of(net.minecraft.world.level.block.Blocks.ACACIA_BUTTON), "blocks", ItemGroupTab.EMPTY);
            addTab(Icon.of(net.minecraft.world.level.block.Blocks.ACACIA_BUTTON), "decorations", ItemGroupTab.EMPTY);
            addTab(Icon.of(net.minecraft.world.level.block.Blocks.ACACIA_BUTTON), "items", ItemGroupTab.EMPTY);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(net.minecraft.world.level.block.Blocks.ACACIA_BUTTON);
        }
    };

    @Override
    public void onInitialize() {

        PW_ITEM_GROUP.initialize();

        Blocks.init();
        GlassBlocks.init();

        log("info", "Pastel Wonderland initializing");
        log("dev_info", "Pastel Wonderland Dev Env on Version: " + VERSION);
    }
}
