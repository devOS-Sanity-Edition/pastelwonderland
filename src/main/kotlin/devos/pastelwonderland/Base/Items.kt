package devos.pastelwonderland.Base

import devos.pastelwonderland.Base.Organization.ItemGroup.pwFood
import devos.pastelwonderland.Base.Organization.ItemGroup.pwMisc
import devos.pastelwonderland.PastelWonderland
import devos.pastelwonderland.PastelWonderland.Companion.PW_MOD_ID
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object Items {
    val MALLARD_RAW = foodRegister("raw_mallard", 2, 1.5f)
    val MALLARD_COOKED = foodRegister("cooked_mallard", 4, 3f)
    val VANILLA_MOCHI = foodRegister("vanilla_mochi", 3, 1.5f)
    val CHOCOLATE_MOCHI = foodRegister("chocolate_mochi", 3, 1.5f)
    val COTTON_CANDY_MOCHI = foodRegister("cotton_candy_mochi", 3, 1.5f)
    val STRAWBERRY_MOCHI = foodRegister("strawberry_mochi", 3, 1.5f)
    val COTTON_CANDY = foodRegister("rainbow_cotton_candy", 2, 0.5f)
    val COTTON_CANDY_ICE_CREAM = foodRegister("cotton_candy_ice_cream", 2, 0.5f)
    val CHOCOLATE_ICE_CREAM = foodRegister("chocolate_ice_cream", 2, 0.5f)
    val VANILLA_ICE_CREAM = foodRegister("vanilla_ice_cream", 2, 0.5f)
    val STRAWBERRY_ICE_CREAM = foodRegister("strawberry_ice_cream", 2, 0.5f)

    val PASTEL_POWDER = itemRegister("pastel_powder", Item(pwMisc()))
    val PASTEL_INGOT = itemRegister("pastel_ingot", Item(pwMisc()))
    //val MALLARD_SPAWN_EGG = itemRegister("mallard_spawn_egg", SpawnEggItem(PastelWonderland.MALLARD, 0xb6a99d, 0x297c48, pwMisc()))


    //Functions
    private fun itemRegister(name: String, item: Item): Item? {
        return Registry.register(Registry.ITEM, Identifier(PW_MOD_ID, name), item)
    }

    private fun foodRegister(name: String, hunger: Int, saturation: Float): Item {
        return Registry.register(
            Registry.ITEM, Identifier(PW_MOD_ID, name), Item(pwFood().food(FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).build()))
        )
    }

    fun register(name: String, item: Item): Item {
        return Registry.register(Registry.ITEM, Identifier(PW_MOD_ID, name), item)
    }

    fun init() {

    }
}