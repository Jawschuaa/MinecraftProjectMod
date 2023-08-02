package net.joshua.projectmod.item;

import net.joshua.projectmod.ProjectMod;
import net.joshua.projectmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PROJECT_TAB = CREATIVE_MODE_TABS.register("project_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KYANITE.get()))
                    .title(Component.translatable("creativetab.project_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.KYANITE.get());
                        pOutput.accept(ModItems.RAW_KYANITE.get());
                        pOutput.accept(ModBlocks.KYANITE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_KYANITE_BLOCK.get());
                    })
                    .build());

    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
