package devos.pastelwonderland.Base.Organization

import net.fabricmc.fabric.api.tag.TagRegistry
import net.minecraft.block.Block
import net.minecraft.tag.Tag
import net.minecraft.util.Identifier

object FabricTags {
    val DIRT = blockTagRegister("dirt")
    fun blockTagRegister(id: String?): Tag<Block> {
        return TagRegistry.block(Identifier("c", id))
            // Bruh?
    }
}