package com.moreprogression.main.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ProgressionToolMaterials implements IItemTier {
	
	Ianite(7.0f, 10.0f, 1800, 4, 15, ProgressionItems.ianite_gem),
	Tritanium(9.0f, 11.0f, 2500, 5, 15, ProgressionItems.tritanium_ingot),
	Bone(4.5f, 5.5f, 350, 1, 30, ProgressionItems.bone_fragment),
	Star(199.0f, 20.0f, 6500, 10, 200, null),
	Enderanium(12.0f, 12.0f, 3200, 6, 18, ProgressionItems.enderanium_ingot);
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private ProgressionToolMaterials(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) {
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
				
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getMaxUses() {
		return this.durability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(repairMaterial);
	}

}
