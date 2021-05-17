package devos.pastelwonderland.Base

import devos.pastelwonderland.Base.Items.register
import devos.pastelwonderland.Base.Organization.ItemGroup.pwArmourAndTools
import devos.pastelwonderland.Tools.PastelArmors
import devos.pastelwonderland.Tools.PastelAxe
import devos.pastelwonderland.Tools.PastelHoe
import devos.pastelwonderland.Tools.PastelPick
import devos.pastelwonderland.Tools.PastelTools.Companion.PASTEL_TOOLS
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.*

object ToolsAndArmor {
    //Tools and Armor
    val pastelArmor: ArmorMaterial = PastelArmors()
    val PASTEL_HEAD: Item = register("pastel_helmet", ArmorItem(pastelArmor, EquipmentSlot.HEAD, pwArmourAndTools()))
    val PASTEL_CHEST: Item = register("pastel_chestplate", ArmorItem(pastelArmor, EquipmentSlot.CHEST, pwArmourAndTools()))
    val PASTEL_LEGS: Item = register("pastel_leggings", ArmorItem(pastelArmor, EquipmentSlot.LEGS, pwArmourAndTools()))
    val PASTEL_FEET: Item = register("pastel_boots", ArmorItem(pastelArmor, EquipmentSlot.FEET, pwArmourAndTools()))
    val PASTEL_SWORD: Item = register("pastel_sword", SwordItem(PASTEL_TOOLS, 3, -2.4f, pwArmourAndTools()))
    val PASTEL_SHOVEL: Item = register("pastel_shovel", ShovelItem(PASTEL_TOOLS, 1F, -3f, pwArmourAndTools()))
    val PASTEL_PICK: Item = register("pastel_pickaxe", PastelPick(PASTEL_TOOLS, 3, -2f, pwArmourAndTools()))
    val PASTEL_AXE: Item = register("pastel_axe", PastelAxe(PASTEL_TOOLS, 7, -2f, pwArmourAndTools()))
    val PASTEL_HOE: Item = register("pastel_hoe", PastelHoe(PASTEL_TOOLS, 1, -3f, pwArmourAndTools()))
    
    fun init() {
        
    }
}