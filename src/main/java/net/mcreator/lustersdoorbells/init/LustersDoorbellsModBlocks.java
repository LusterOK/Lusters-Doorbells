/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lustersdoorbells.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.lustersdoorbells.block.DoorbellBlock;
import net.mcreator.lustersdoorbells.LustersDoorbellsMod;

public class LustersDoorbellsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LustersDoorbellsMod.MODID);
	public static final DeferredBlock<Block> DOORBELL;
	static {
		DOORBELL = REGISTRY.register("doorbell", DoorbellBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}