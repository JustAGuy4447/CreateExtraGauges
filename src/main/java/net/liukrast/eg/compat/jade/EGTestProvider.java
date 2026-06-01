package net.liukrast.eg.compat.jade;

import net.liukrast.eg.registry.EGJadePlugin;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

public class EGTestProvider implements IBlockComponentProvider {
    @Override
    public void appendTooltip(ITooltip iTooltip, BlockAccessor blockAccessor, IPluginConfig iPluginConfig) {
        iTooltip.add(Component.literal("TEST"));
    }

    @Override
    public ResourceLocation getUid() {
        return EGJadePlugin.TEST;
    }

    @Override
    public int getDefaultPriority() {
        return IBlockComponentProvider.super.getDefaultPriority();
    }
}
