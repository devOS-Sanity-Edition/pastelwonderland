package dev.hiitsdevin.pastelwonderland.Tools;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PastelPickItem extends PickaxeItem {
    public PastelPickItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}