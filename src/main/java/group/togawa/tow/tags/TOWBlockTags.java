package group.togawa.tow.tags;

import group.togawa.tow.TheOuterWastes;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TOWBlockTags {

    public static final TagKey<Block> OUTERSTONE = TagKey.create(
        Registries.BLOCK,
        TheOuterWastes.asResource("outerstone")
    );

    public static final TagKey<Block> OUTERSAND = TagKey.create(
        Registries.BLOCK,
        TheOuterWastes.asResource("outersand")
    );
}
