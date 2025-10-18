package group.togawa.tow.tabs;

import group.togawa.tow.TheOuterWastes;
import group.togawa.tow.blocks.OuterStoneBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TOWCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> REGISTER =
        DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB,
            TheOuterWastes.MODID
        );

    public static final DeferredHolder<
        CreativeModeTab,
        CreativeModeTab
    > TOW_TAB = REGISTER.register("tow_tab", () ->
        CreativeModeTab.builder()
            .icon(() -> new ItemStack(OuterStoneBlocks.OUTERSTONE.get()))
            .title(Component.translatable("creativetab.tow.tow_tab"))
            .build()
    );

    public static void register(IEventBus modEventBus) {
        REGISTER.register(modEventBus);
    }
}
