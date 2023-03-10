package net.warrentode.todepiglins.client.todepiglinmerchant;

import net.minecraft.resources.ResourceLocation;
import net.warrentode.todepiglins.entity.custom.todepiglinmerchant.TodePiglinMerchant;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import static net.warrentode.todepiglins.TodePiglins.MODID;

public class TodePiglinMerchantModel extends AnimatedGeoModel<TodePiglinMerchant> {
    @Override
    public ResourceLocation getModelResource(TodePiglinMerchant object) {
        return new ResourceLocation(MODID, "geo/entity/todepiglin/todepiglinmerchant.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TodePiglinMerchant object) {
        return new ResourceLocation(MODID, "textures/entity/todepiglin/todepiglinmerchant.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TodePiglinMerchant animatable) {
        return new ResourceLocation(MODID, "animations/entity/todepiglin/todepiglinmerchant.animation.json");
    }
}
