package committee.nova.mods.avaritia.init.registry;

import committee.nova.mods.avaritia.Static;
import committee.nova.mods.avaritia.common.tile.CompressorTile;
import committee.nova.mods.avaritia.common.tile.ExtremeCraftingTile;
import committee.nova.mods.avaritia.common.tile.NeutronCollectorTile;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/4/2 9:48
 * Version: 1.0
 */
public class ModTileEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Static.MOD_ID);

    //public static RegistryObject<BlockEntityType<InfinitatoTile>> infinitato_tile = blockEntity("infinitato_tile", InfinitatoTile::new, () -> new Block[]{ModBlocks.infinitato.get()});

    public static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> blockEntity(String name, BlockEntityType.BlockEntitySupplier<T> tile, Supplier<Block[]> blocks) {
        return BLOCK_ENTITIES.register(name, () -> BlockEntityType.Builder.of(tile, blocks.get()).build(null));
    }

    @OnlyIn(Dist.CLIENT)
    public static void onClientSetup() {

    }

    public static RegistryObject<BlockEntityType<NeutronCollectorTile>> neutron_collector_tile = blockEntity("neutron_collector_tile", NeutronCollectorTile::new, () -> new Block[]{ModBlocks.neutron_collector.get()});
    public static RegistryObject<BlockEntityType<CompressorTile>> compressor_tile = blockEntity("compressor_tile", CompressorTile::new, () -> new Block[]{ModBlocks.neutron_compressor.get()});
    public static RegistryObject<BlockEntityType<ExtremeCraftingTile>> extreme_crafting_tile = blockEntity("extreme_crafting_tile", ExtremeCraftingTile::new, () -> new Block[]{ModBlocks.extreme_crafting_table.get()});



}