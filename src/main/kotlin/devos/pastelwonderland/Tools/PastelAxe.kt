package devos.pastelwonderland.Tools

import net.minecraft.item.AxeItem
import net.minecraft.item.ToolMaterial

class PastelAxe(material: ToolMaterial?, attackDamage: Int, attackSpeed: Float, settings: Settings?) :
    AxeItem(material, attackDamage.toFloat(), attackSpeed, settings)