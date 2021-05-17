package devos.pastelwonderland.Tools

import devos.pastelwonderland.Base.Items
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient

class PastelTools : ToolMaterial {
    override fun getDurability(): Int {
        return 256
    }

    override fun getMiningSpeedMultiplier(): Float {
        return 4.0f
    }

    override fun getAttackDamage(): Float {
        return 3.0f
    }

    override fun getMiningLevel(): Int {
        return 2
    }

    override fun getEnchantability(): Int {
        return 9
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(Items.PASTEL_INGOT)
    }

    companion object {
        val PASTEL_TOOLS = PastelTools()
    }
}