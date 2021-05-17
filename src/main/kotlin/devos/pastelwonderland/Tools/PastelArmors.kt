package devos.pastelwonderland.Tools

import devos.pastelwonderland.Base.Items
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents


class PastelArmors : ArmorMaterial {
    override fun getDurability(slot: EquipmentSlot): Int {
        return BASE_DURABILITY[slot.entitySlotId] * 15
    }

    override fun getProtectionAmount(slot: EquipmentSlot): Int {
        return PROTECTION_VALUES[slot.entitySlotId]
    }

    override fun getEnchantability(): Int {
        return 9
    }

    override fun getEquipSound(): SoundEvent {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(Items.PASTEL_INGOT)
    }

    override fun getName(): String {
        return "pastel"
    }

    override fun getToughness(): Float {
        return 1.0f
    }

    override fun getKnockbackResistance(): Float {
        return 0.0f
    }

    companion object {
        private val BASE_DURABILITY = intArrayOf(13, 15, 16, 11)
        private val PROTECTION_VALUES = intArrayOf(2, 5, 6, 2)
    }
}