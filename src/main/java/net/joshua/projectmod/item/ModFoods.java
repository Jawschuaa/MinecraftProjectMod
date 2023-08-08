package net.joshua.projectmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RICE = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.4f).build();
    public static final FoodProperties SUSHI = new FoodProperties.Builder().nutrition(8)
            .saturationMod(.3f).effect(() ->new MobEffectInstance(MobEffects.WATER_BREATHING, 400), 1f).build();
}
