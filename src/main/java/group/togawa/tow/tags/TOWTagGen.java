package group.togawa.tow.tags;

import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.nullness.NonNullFunction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

public class TOWTagGen {

    /** 只能使用镐子挖掘 */
    public static <T extends Block, P> NonNullFunction<
        BlockBuilder<T, P>,
        BlockBuilder<T, P>
    > pickaxeOnly() {
        return b -> b.tag(BlockTags.MINEABLE_WITH_PICKAXE);
    }

    /** 只能使用锹挖掘 */
    public static <T extends Block, P> NonNullFunction<
        BlockBuilder<T, P>,
        BlockBuilder<T, P>
    > shovelOnly() {
        return b -> b.tag(BlockTags.MINEABLE_WITH_SHOVEL);
    }
}
