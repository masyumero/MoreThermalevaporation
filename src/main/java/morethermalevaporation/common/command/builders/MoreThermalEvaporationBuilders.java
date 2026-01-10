package morethermalevaporation.common.command.builders;

import mekanism.common.command.builders.StructureBuilder;
import morethermalevaporation.common.registries.MoreThermalEvaporationBlocks;
import morethermalevaporation.common.tier.MoreThermalEvaporationTier;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class MoreThermalEvaporationBuilders {
    protected MoreThermalEvaporationBuilders() {
    }

    public static class MoreEvaporationBuilder extends StructureBuilder {

        private final MoreThermalEvaporationTier tier;

        public MoreEvaporationBuilder(MoreThermalEvaporationTier tier) {
            super(4, tier.getHeight(), 4);
            this.tier = tier;
        }

        @Override
        public void build(Level world, BlockPos start, boolean empty) {
            buildFrame(world, start);
            buildWalls(world, start);
            buildInteriorLayers(world, start, 1, tier.getHeight() - 1, Blocks.AIR);
            world.setBlockAndUpdate(start.offset(1, 1, 0), MoreThermalEvaporationBlocks.getController(tier).getBlock().defaultBlockState());
        }

        @Override
        protected Block getCasing() {
            return MoreThermalEvaporationBlocks.getBlock(tier).getBlock();
        }
    }

}
