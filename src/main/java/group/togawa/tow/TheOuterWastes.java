package group.togawa.tow;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(TheOuterWastes.MODID)
public class TheOuterWastes {

    public static final String MODID = "tow";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TheOuterWastes(IEventBus modEventBus) {
        // Mod initialization code here
    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
