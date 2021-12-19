package community.devos.nautical.pastelwonderland;

import com.google.common.base.Suppliers;
import community.devos.nautical.pastelwonderland.common.Blocks;
import community.devos.nautical.pastelwonderland.common.ItemGroups;
import community.devos.nautical.pastelwonderland.common.Items;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class PastelWonderland {
    public static final String MOD_ID = "pastelwonderland";
//    // We can use this if we don't want to use DeferredRegister
//    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
//    // Registering a new creative tab
////    public static final CreativeModeTab EXAMPLE_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "example_tab"), () ->
////            new ItemStack(PastelWonderland.EXAMPLE_ITEM.get()));
//
//    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
//    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
//            new Item(new Item.Properties().tab(PastelWonderland.EXAMPLE_TAB)));
    
    public static void init() {
        Items.init();
        Blocks.init();
        ItemGroups.init();
        PastelWonderlandClient.init();
        
        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
