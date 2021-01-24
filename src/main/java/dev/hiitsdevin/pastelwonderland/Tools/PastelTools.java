package dev.hiitsdevin.pastelwonderland.Tools;

import dev.hiitsdevin.pastelwonderland.Base.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class PastelTools implements ToolMaterial {

    public static final PastelTools PASTEL_TOOLS = new PastelTools();

    @Override
    public int getDurability() {
        return 256;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4.0f;
    }

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.PASTEL_INGOT);
    }
}