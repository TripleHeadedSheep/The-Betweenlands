package thebetweenlands.blocks.tree;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import thebetweenlands.proxy.ClientProxy.BlockRenderIDs;


public class BlockRubberLog extends BlockBLLog {
	public BlockRubberLog(String blockName) {
		super("rubberTreeLog");
	}

	@Override
	public int getRenderType() {
		return BlockRenderIDs.RUBBER_LOG.id();
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
}
