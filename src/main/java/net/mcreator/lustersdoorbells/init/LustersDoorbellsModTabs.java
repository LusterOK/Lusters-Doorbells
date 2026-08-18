/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lustersdoorbells.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.lustersdoorbells.LustersDoorbellsMod;

public class LustersDoorbellsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LustersDoorbellsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DOORBELLVKLADKA = REGISTRY.register("doorbellvkladka",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lusters_doorbells.doorbellvkladka")).icon(() -> new ItemStack(LustersDoorbellsModBlocks.DOORBELL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LustersDoorbellsModBlocks.DOORBELL.get().asItem());
			}).build());
}