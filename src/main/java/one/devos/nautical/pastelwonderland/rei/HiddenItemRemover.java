package one.devos.nautical.pastelwonderland.rei;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.entry.EntryRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import one.devos.nautical.pastelwonderland.common.HiddenItems;

@Environment(EnvType.CLIENT)
public class HiddenItemRemover implements REIClientPlugin {

    @Override
    public void registerEntries(EntryRegistry registry) {
        registry.removeEntry(EntryStacks.of(HiddenItems.LOGO));
        registry.removeEntry(EntryStacks.of(HiddenItems.RED_BLOCK));
    }
}
