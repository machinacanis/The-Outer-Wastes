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

public class OuterSandBlocks {

    public static void register() {}

    private static final CreateRegistrate REGISTRATE =
        TheOuterWastes.registrate();

    public static final BlockEntry<Block> OUTERSAND = REGISTRATE.block(
        // 外域沙
        "outersand",
        Block::new
    )
        .initialProperties(() -> Blocks.SAND)
        .properties(p -> p.mapColor(MapColor.COLOR_GRAY).sound(SoundType.SAND))
        .transform(TOWTagGen.shovelOnly())
        .tag(Tags.Blocks.SANDS)
        .tag(TOWBlockTags.OUTERSAND)
        .item()
        .tag(Tags.Items.STONES)
        .tag(TOWItemTags.OUTERSAND)
        .build()
        .register();
}
