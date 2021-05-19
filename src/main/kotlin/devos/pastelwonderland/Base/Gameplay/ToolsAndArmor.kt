package devos.pastelwonderland.Base.Gameplay

import devos.pastelwonderland.Base.Gameplay.Tools.PastelArmors
import devos.pastelwonderland.Base.Gameplay.Tools.PastelAxe
import devos.pastelwonderland.Base.Gameplay.Tools.PastelHoe
import devos.pastelwonderland.Base.Gameplay.Tools.PastelPick
import devos.pastelwonderland.Base.Gameplay.Tools.PastelTools.Companion.PASTEL_TOOLS
import devos.pastelwonderland.PastelWonderland
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.*
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ToolsAndArmor {
    //Tools and Armor
    val pastelArmor: ArmorMaterial = PastelArmors()
    val PASTEL_HEAD: Item = register("pastel_helmet", ArmorItem(pastelArmor, EquipmentSlot.HEAD, FabricItemSettings().group(PastelWonderland.ITEMS)))
    val PASTEL_CHEST: Item = register("pastel_chestplate", ArmorItem(pastelArmor, EquipmentSlot.CHEST, FabricItemSettings().group(PastelWonderland.ITEMS)))
    val PASTEL_LEGS: Item = register("pastel_leggings", ArmorItem(pastelArmor, EquipmentSlot.LEGS, FabricItemSettings().group(PastelWonderland.ITEMS)))
    val PASTEL_FEET: Item = register("pastel_boots", ArmorItem(pastelArmor, EquipmentSlot.FEET, FabricItemSettings().group(PastelWonderland.ITEMS)))
    val PASTEL_SWORD: Item = register("pastel_sword", SwordItem(PASTEL_TOOLS, 3, -2.4f, FabricItemSettings().group(PastelWonderland.ITEMS)))
    val PASTEL_SHOVEL: Item = register("pastel_shovel", ShovelItem(PASTEL_TOOLS, 1F, -3f, FabricItemSettings().group(PastelWonderland.ITEMS)))
    val PASTEL_PICK: Item = register("pastel_pickaxe", PastelPick(PASTEL_TOOLS, 3, -2f, FabricItemSettings().group(PastelWonderland.ITEMS)))
    val PASTEL_AXE: Item = register("pastel_axe", PastelAxe(PASTEL_TOOLS, 7, -2f, FabricItemSettings().group(PastelWonderland.ITEMS)))
    val PASTEL_HOE: Item = register("pastel_hoe", PastelHoe(PASTEL_TOOLS, 1, -3f, FabricItemSettings().group(PastelWonderland.ITEMS)))

    private fun register(name: String, item: Item): Item {
        return Registry.register(Registry.ITEM, Identifier(PastelWonderland.PW_MOD_ID, name), item)
    }
    fun init() {
        
    }
}