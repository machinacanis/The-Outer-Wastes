package group.togawa.tow;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import group.togawa.tow.blocks.OuterSandBlocks;
import group.togawa.tow.blocks.OuterStoneBlocks;
import group.togawa.tow.tabs.TOWCreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
import org.slf4j.Logger;

@Mod(TheOuterWastes.MODID)
public class TheOuterWastes {

    /** Mod的Namespace ID */
    public static final String MODID = "tow";
    /** 全局Logger */
    public static final Logger LOGGER = LogUtils.getLogger();
    /** 注册器实例 */
    private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(
        MODID
    ).defaultCreativeTab(TOWCreativeModeTabs.TOW_TAB.getKey());

    public TheOuterWastes(IEventBus modEventBus) {
        onCtor(modEventBus);
    }

    public static void onCtor(IEventBus modEventBus) {
        REGISTRATE.registerEventListeners(modEventBus); // 将注册器实例注册到事件监听器中

        OuterStoneBlocks.register();
        OuterSandBlocks.register();

        TOWCreativeModeTabs.register(modEventBus);

        // 注册生命周期事件监听
        modEventBus.addListener(TheOuterWastes::onFMLConstructMod);
        modEventBus.addListener(TheOuterWastes::onFMLCommonSetup);
        modEventBus.addListener(TheOuterWastes::onFMLClientSetup);
        modEventBus.addListener(TheOuterWastes::onFMLDedicatedServerSetup);
        modEventBus.addListener(TheOuterWastes::onFMLLoadingComplete);
    }

    /** 将给定路径转换为资源位置 */
    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    /** 获取全局注册器实例 */
    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }

    // 后面是一些生命周期事件的监听函数

    private static void onFMLConstructMod(FMLConstructModEvent event) {}

    private static void onFMLCommonSetup(FMLCommonSetupEvent event) {}

    private static void onFMLClientSetup(FMLClientSetupEvent event) {}

    private static void onFMLDedicatedServerSetup(
        FMLDedicatedServerSetupEvent event
    ) {}

    private static void onFMLLoadingComplete(FMLLoadCompleteEvent event) {
        LOGGER.info("Welcome to the Outer Wastes!");
    }
}
