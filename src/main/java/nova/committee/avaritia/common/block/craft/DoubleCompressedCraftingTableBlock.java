package nova.committee.avaritia.common.block.craft;

import net.minecraft.world.level.block.SoundType;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/4/2 6:51
 * Version: 1.0
 */
public class DoubleCompressedCraftingTableBlock extends AbstractCraftingTable {

    public DoubleCompressedCraftingTableBlock() {
        super(SoundType.WOOD, 20F, 500F, true, "double_compressed_crafting_table");
    }

}
