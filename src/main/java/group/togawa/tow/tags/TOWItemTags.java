package group.togawa.tow.tags;

import group.togawa.tow.TheOuterWastes;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TOWItemTags {

    public static final TagKey<Item> OUTERSTONE = TagKey.create(
        Registries.ITEM,
        TheOuterWastes.asResource("outerstone")
    );

    public static final TagKey<Item> OUTERSAND = TagKey.create(
        Registries.ITEM,
        TheOuterWastes.asResource("outersand")
    );
}
