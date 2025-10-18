package group.togawa.tow.blocks;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import group.togawa.tow.TheOuterWastes;
import group.togawa.tow.tags.TOWBlockTags;
import group.togawa.tow.tags.TOWItemTags;
import group.togawa.tow.tags.TOWTagGen;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.common.Tags;

public class OuterStoneBlocks {

    public static void register() {}

    private static final CreateRegistrate REGISTRATE =
        TheOuterWastes.registrate();

    public static final BlockEntry<Block> OUTERSTONE = REGISTRATE.block(
        // 外域石
        "outerstone",
        Block::new
    )
        .initialProperties(() -> Blocks.BLACKSTONE)
        .properties(p ->
            p
                .mapColor(MapColor.COLOR_BLACK)
                .requiresCorrectToolForDrops()
                .sound(SoundType.DEEPSLATE)
        )
        .transform(TOWTagGen.pickaxeOnly())
        .tag(Tags.Blocks.STONES)
        .tag(TOWBlockTags.OUTERSTONE)
        .item()
        .tag(Tags.Items.STONES)
        .tag(TOWItemTags.OUTERSTONE)
        .build()
        .register();

    public static final BlockEntry<Block> OUTER_BLACKSTONE = REGISTRATE.block(
        // 外域黑石
        "outer_blackstone",
        Block::new
    )
        .initialProperties(() -> Blocks.BLACKSTONE)
        .properties(p ->
            p
                .mapColor(MapColor.COLOR_BLACK)
                .requiresCorrectToolForDrops()
                .sound(SoundType.BASALT)
        )
        .transform(TOWTagGen.pickaxeOnly())
        .tag(Tags.Blocks.STONES)
        .tag(TOWBlockTags.OUTERSTONE)
        .item()
        .tag(Tags.Items.STONES)
        .tag(TOWItemTags.OUTERSTONE)
        .build()
        .register();
}
