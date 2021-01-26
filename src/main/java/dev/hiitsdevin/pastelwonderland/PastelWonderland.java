// 🦀 CRAB IN THE CODE 🦀
// live laugh taze
// wait why do i hear a taser coming towards me-

package dev.hiitsdevin.pastelwonderland;

import dev.hiitsdevin.pastelwonderland.Base.*;
import dev.hiitsdevin.pastelwonderland.Entities.Mallards.MallardEntity;
import dev.hiitsdevin.pastelwonderland.Mixin.PlayerListEntryMixin;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class PastelWonderland implements ModInitializer {

    // for the text render. be sure to comment out both HudRenderCallsbacks when you're not in a dev env.
    public static final String PrototypePastelVersion = "Pastel Wonderland - Development Build v0.0.2";
    public static final String PrototypePastelDistribution = "If this build is not public please do not redistribute it!";
    public static final String MOD_ID = "pastelwonderland";
    public static final String NAME = "pastelwonderland";
    public static final Logger logger = LogManager.getLogger(NAME);
    //public static String selectedIdentifier = "";

    public static final EntityType<MallardEntity> MALLARD = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("pastelwonderland", "mallard"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MallardEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );
    public static Path mainDir;
    
    // READ: 
    // The code below are not being used. Mainly because PlayerListEntryMixin is actually loading the cape
    // This means regardless of what user, everyone loads with the cape. This of course will be changed when I re-write the code.
    // If you want, go ahead and delete the code. But I kept it there for reference.

    //File cape = new File(MOD_ID + "/PastelWonderlandCape.png");
    //File cape = new File("./resources/assets/pastelwonderland/textures/cape/PastelWonderlandCape.png");
    //BufferedImage capeImage;

    // java wanted this otherwise it would make me trip over a knife -devin
    public PastelWonderland() throws IOException {
    }

    @Override
    public final void onInitialize() {
        // modularity who, me bitch
        // each separate class for organizational reasons, this is great
        Blocks.init();
        DevDisclaimer.init();
        Items.init();
        Portals.init();
        Mobs.init();
        Capes.init();

        FabricDefaultAttributeRegistry.register(MALLARD, MallardEntity.createMobAttributes());

        // oh hi, cape here
        // try {
        //     for (File file : Capes.grabAllCapeTextures()) {
        //         if (file.exists()) {
        //             capeImage = ImageIO.read(cape);
        //         }
        //     }
        // } catch (Exception e) {
        //     System.out.println("MCMCapes: " + e);
        // }
          }
    }
