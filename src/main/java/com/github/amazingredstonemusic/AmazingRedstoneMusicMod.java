package com.github.amazingredstonemusic;

import com.github.amazingredstonemusic.blocks.BlueRepeaterBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AmazingRedstoneMusicMod implements ModInitializer {
    public static final String MOD_NAMESPACE = "amazing_redstone_music";
    public static final BlueRepeaterBlock BLUE_REPEATER_BLOCK = new BlueRepeaterBlock(Block.Settings.of(Material.STONE).strength(4.0f));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_NAMESPACE, "blue_repeater_block"), BLUE_REPEATER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_NAMESPACE, "blue_repeater_block"), new BlockItem(BLUE_REPEATER_BLOCK, new FabricItemSettings().group(ItemGroup.REDSTONE)));
    }
}
