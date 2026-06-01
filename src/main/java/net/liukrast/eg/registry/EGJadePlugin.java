package net.liukrast.eg.registry;

import net.liukrast.eg.ExtraGauges;
import net.liukrast.eg.compat.jade.EGTestProvider;
import net.liukrast.eg.content.logistics.link.IntSelectorBlock;
import net.minecraft.resources.ResourceLocation;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaCommonRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class EGJadePlugin implements IWailaPlugin {
    public static final ResourceLocation TEST = ResourceLocation.fromNamespaceAndPath(ExtraGauges.CONSTANTS.getModId(), "test");

    @Override
    public void register(IWailaCommonRegistration registration) {
        //Register data providers
    }

    @Override
    public void registerClient(IWailaClientRegistration registration) {
        //Register component providers, icon providers, callbacks, and config options here
        registration.registerBlockComponent(new EGTestProvider(), IntSelectorBlock.class);
    }
}
