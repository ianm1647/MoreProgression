package com.moreprogression.main.item;

import com.moreprogression.main.MoreProgression;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ProgressionArmorMaterials implements IArmorMaterial {
	
	Ianite("ianite", 1800, new int[] {5, 8, 10, 5}, 12, ProgressionItems.ianite_gem, "item.armor.equip_diamond", 4.0f),
	Tritanium("tritanium", 2500, new int[] {7, 10, 12, 7}, 15, ProgressionItems.tritanium_ingot, "item.armor.equip_diamond", 6.0f),
	Bone("bone", 500, new int[] {2, 4, 3, 2}, 30, ProgressionItems.bone_fragment, "item.armor.equip_iron", 0),
	Dragon("dragon", 3000, new int[] {10, 13, 15, 10}, 20, ProgressionItems.dragon_scale, "item.armor.equip_leather", 9.0f);
	
	private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
	private String name, equipSound;
	private int durability, enchantability;
	private int[] damageReductionAmounts;
	private Item repairItem;
	private float toughness;
	
	private ProgressionArmorMaterials(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness) {
		this.name = name;
		this.equipSound = equipSound;
		this.durability = durability;
		this.enchantability = enchantability;
		this.damageReductionAmounts = damageReductionAmounts;
		this.repairItem = repairItem;
		this.toughness = toughness;
		
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) {
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDurability(EquipmentSlotType slot) {
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public String getName() {
		return MoreProgression.MODID + ":" + this.name;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public SoundEvent getSoundEvent() {
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

}
