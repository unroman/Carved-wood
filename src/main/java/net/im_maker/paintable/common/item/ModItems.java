package net.im_maker.paintable.common.item;

import com.mojang.datafixers.util.Pair;
import com.teamabnormals.blueprint.core.util.registry.AbstractSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import net.im_maker.paintable.Paintable;
import net.im_maker.paintable.common.util.PaintableBoatTypes;
import net.im_maker.paintable.common.block.ModBlocks;
import net.im_maker.paintable.common.item.paint_brushs.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Paintable.MOD_ID);

    public static final ItemSubRegistryHelper HELPER = Paintable.REGISTRY_HELPER.getItemSubHelper();

    //Paint Brushes
    public static final RegistryObject<Item> PAINT_BRUSH = ITEMS.register("paint_brush", () -> new PaintBrushItem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item> RED_PAINT_BRUSH = ITEMS.register("red_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.RED_PAINTED_PLANKS.get(), ModBlocks.RED_PAINTED_PLANKS_STAIRS.get(), ModBlocks.RED_PAINTED_PLANKS_SLAB.get(), ModBlocks.RED_PAINTED_FENCE.get(), ModBlocks.RED_PAINTED_FENCE_GATE.get(), ModBlocks.RED_PAINTED_BUTTON.get(), ModBlocks.RED_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_RED_PAINTED_LOG.get(), ModBlocks.STRIPPED_RED_PAINTED_WOOD.get(), ModBlocks.RED_PAINTED_BRICKS.get(), ModBlocks.RED_PAINTED_BRICK_STAIRS.get(), ModBlocks.RED_PAINTED_BRICK_SLAB.get(), ModBlocks.RED_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> ORANGE_PAINT_BRUSH = ITEMS.register("orange_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.ORANGE_PAINTED_PLANKS.get(), ModBlocks.ORANGE_PAINTED_PLANKS_STAIRS.get(), ModBlocks.ORANGE_PAINTED_PLANKS_SLAB.get(), ModBlocks.ORANGE_PAINTED_FENCE.get(), ModBlocks.ORANGE_PAINTED_FENCE_GATE.get(), ModBlocks.ORANGE_PAINTED_BUTTON.get(), ModBlocks.ORANGE_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_ORANGE_PAINTED_LOG.get(), ModBlocks.STRIPPED_ORANGE_PAINTED_WOOD.get(), ModBlocks.ORANGE_PAINTED_BRICKS.get(), ModBlocks.ORANGE_PAINTED_BRICK_STAIRS.get(), ModBlocks.ORANGE_PAINTED_BRICK_SLAB.get(), ModBlocks.ORANGE_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> YELLOW_PAINT_BRUSH = ITEMS.register("yellow_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.YELLOW_PAINTED_PLANKS.get(), ModBlocks.YELLOW_PAINTED_PLANKS_STAIRS.get(), ModBlocks.YELLOW_PAINTED_PLANKS_SLAB.get(), ModBlocks.YELLOW_PAINTED_FENCE.get(), ModBlocks.YELLOW_PAINTED_FENCE_GATE.get(), ModBlocks.YELLOW_PAINTED_BUTTON.get(), ModBlocks.YELLOW_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_YELLOW_PAINTED_LOG.get(), ModBlocks.STRIPPED_YELLOW_PAINTED_WOOD.get(), ModBlocks.YELLOW_PAINTED_BRICKS.get(), ModBlocks.YELLOW_PAINTED_BRICK_STAIRS.get(), ModBlocks.YELLOW_PAINTED_BRICK_SLAB.get(), ModBlocks.YELLOW_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> LIME_PAINT_BRUSH = ITEMS.register("lime_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.LIME_PAINTED_PLANKS.get(), ModBlocks.LIME_PAINTED_PLANKS_STAIRS.get(), ModBlocks.LIME_PAINTED_PLANKS_SLAB.get(), ModBlocks.LIME_PAINTED_FENCE.get(), ModBlocks.LIME_PAINTED_FENCE_GATE.get(), ModBlocks.LIME_PAINTED_BUTTON.get(), ModBlocks.LIME_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_LIME_PAINTED_LOG.get(), ModBlocks.STRIPPED_LIME_PAINTED_WOOD.get(), ModBlocks.LIME_PAINTED_BRICKS.get(), ModBlocks.LIME_PAINTED_BRICK_STAIRS.get(), ModBlocks.LIME_PAINTED_BRICK_SLAB.get(), ModBlocks.LIME_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> GREEN_PAINT_BRUSH = ITEMS.register("green_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.GREEN_PAINTED_PLANKS.get(), ModBlocks.GREEN_PAINTED_PLANKS_STAIRS.get(), ModBlocks.GREEN_PAINTED_PLANKS_SLAB.get(), ModBlocks.GREEN_PAINTED_FENCE.get(), ModBlocks.GREEN_PAINTED_FENCE_GATE.get(), ModBlocks.GREEN_PAINTED_BUTTON.get(), ModBlocks.GREEN_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_GREEN_PAINTED_LOG.get(), ModBlocks.STRIPPED_GREEN_PAINTED_WOOD.get(), ModBlocks.GREEN_PAINTED_BRICKS.get(), ModBlocks.GREEN_PAINTED_BRICK_STAIRS.get(), ModBlocks.GREEN_PAINTED_BRICK_SLAB.get(), ModBlocks.GREEN_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> CYAN_PAINT_BRUSH = ITEMS.register("cyan_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.CYAN_PAINTED_PLANKS.get(), ModBlocks.CYAN_PAINTED_PLANKS_STAIRS.get(), ModBlocks.CYAN_PAINTED_PLANKS_SLAB.get(), ModBlocks.CYAN_PAINTED_FENCE.get(), ModBlocks.CYAN_PAINTED_FENCE_GATE.get(), ModBlocks.CYAN_PAINTED_BUTTON.get(), ModBlocks.CYAN_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_CYAN_PAINTED_LOG.get(), ModBlocks.STRIPPED_CYAN_PAINTED_WOOD.get(), ModBlocks.CYAN_PAINTED_BRICKS.get(), ModBlocks.CYAN_PAINTED_BRICK_STAIRS.get(), ModBlocks.CYAN_PAINTED_BRICK_SLAB.get(), ModBlocks.CYAN_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> LIGHT_BLUE_PAINT_BRUSH = ITEMS.register("light_blue_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.LIGHT_BLUE_PAINTED_PLANKS.get(), ModBlocks.LIGHT_BLUE_PAINTED_PLANKS_STAIRS.get(), ModBlocks.LIGHT_BLUE_PAINTED_PLANKS_SLAB.get(), ModBlocks.LIGHT_BLUE_PAINTED_FENCE.get(), ModBlocks.LIGHT_BLUE_PAINTED_FENCE_GATE.get(), ModBlocks.LIGHT_BLUE_PAINTED_BUTTON.get(), ModBlocks.LIGHT_BLUE_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_LIGHT_BLUE_PAINTED_LOG.get(), ModBlocks.STRIPPED_LIGHT_BLUE_PAINTED_WOOD.get(), ModBlocks.LIGHT_BLUE_PAINTED_BRICKS.get(), ModBlocks.LIGHT_BLUE_PAINTED_BRICK_STAIRS.get(), ModBlocks.LIGHT_BLUE_PAINTED_BRICK_SLAB.get(), ModBlocks.LIGHT_BLUE_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> BLUE_PAINT_BRUSH = ITEMS.register("blue_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.BLUE_PAINTED_PLANKS.get(), ModBlocks.BLUE_PAINTED_PLANKS_STAIRS.get(), ModBlocks.BLUE_PAINTED_PLANKS_SLAB.get(), ModBlocks.BLUE_PAINTED_FENCE.get(), ModBlocks.BLUE_PAINTED_FENCE_GATE.get(), ModBlocks.BLUE_PAINTED_BUTTON.get(), ModBlocks.BLUE_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_BLUE_PAINTED_LOG.get(), ModBlocks.STRIPPED_BLUE_PAINTED_WOOD.get(), ModBlocks.BLUE_PAINTED_BRICKS.get(), ModBlocks.BLUE_PAINTED_BRICK_STAIRS.get(), ModBlocks.BLUE_PAINTED_BRICK_SLAB.get(), ModBlocks.BLUE_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> PURPLE_PAINT_BRUSH = ITEMS.register("purple_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.PURPLE_PAINTED_PLANKS.get(), ModBlocks.PURPLE_PAINTED_PLANKS_STAIRS.get(), ModBlocks.PURPLE_PAINTED_PLANKS_SLAB.get(), ModBlocks.PURPLE_PAINTED_FENCE.get(), ModBlocks.PURPLE_PAINTED_FENCE_GATE.get(), ModBlocks.PURPLE_PAINTED_BUTTON.get(), ModBlocks.PURPLE_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_PURPLE_PAINTED_LOG.get(), ModBlocks.STRIPPED_PURPLE_PAINTED_WOOD.get(), ModBlocks.PURPLE_PAINTED_BRICKS.get(), ModBlocks.PURPLE_PAINTED_BRICK_STAIRS.get(), ModBlocks.PURPLE_PAINTED_BRICK_SLAB.get(), ModBlocks.PURPLE_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> MAGENTA_PAINT_BRUSH = ITEMS.register("magenta_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.MAGENTA_PAINTED_PLANKS.get(), ModBlocks.MAGENTA_PAINTED_PLANKS_STAIRS.get(), ModBlocks.MAGENTA_PAINTED_PLANKS_SLAB.get(), ModBlocks.MAGENTA_PAINTED_FENCE.get(), ModBlocks.MAGENTA_PAINTED_FENCE_GATE.get(), ModBlocks.MAGENTA_PAINTED_BUTTON.get(), ModBlocks.MAGENTA_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_MAGENTA_PAINTED_LOG.get(), ModBlocks.STRIPPED_MAGENTA_PAINTED_WOOD.get(), ModBlocks.MAGENTA_PAINTED_BRICKS.get(), ModBlocks.MAGENTA_PAINTED_BRICK_STAIRS.get(), ModBlocks.MAGENTA_PAINTED_BRICK_SLAB.get(), ModBlocks.MAGENTA_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> PINK_PAINT_BRUSH = ITEMS.register("pink_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.PINK_PAINTED_PLANKS.get(), ModBlocks.PINK_PAINTED_PLANKS_STAIRS.get(), ModBlocks.PINK_PAINTED_PLANKS_SLAB.get(), ModBlocks.PINK_PAINTED_FENCE.get(), ModBlocks.PINK_PAINTED_FENCE_GATE.get(), ModBlocks.PINK_PAINTED_BUTTON.get(), ModBlocks.PINK_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_PINK_PAINTED_LOG.get(), ModBlocks.STRIPPED_PINK_PAINTED_WOOD.get(), ModBlocks.PINK_PAINTED_BRICKS.get(), ModBlocks.PINK_PAINTED_BRICK_STAIRS.get(), ModBlocks.PINK_PAINTED_BRICK_SLAB.get(), ModBlocks.PINK_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> BROWN_PAINT_BRUSH = ITEMS.register("brown_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.BROWN_PAINTED_PLANKS.get(), ModBlocks.BROWN_PAINTED_PLANKS_STAIRS.get(), ModBlocks.BROWN_PAINTED_PLANKS_SLAB.get(), ModBlocks.BROWN_PAINTED_FENCE.get(), ModBlocks.BROWN_PAINTED_FENCE_GATE.get(), ModBlocks.BROWN_PAINTED_BUTTON.get(), ModBlocks.BROWN_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_BROWN_PAINTED_LOG.get(), ModBlocks.STRIPPED_BROWN_PAINTED_WOOD.get(), ModBlocks.BROWN_PAINTED_BRICKS.get(), ModBlocks.BROWN_PAINTED_BRICK_STAIRS.get(), ModBlocks.BROWN_PAINTED_BRICK_SLAB.get(), ModBlocks.BROWN_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> BLACK_PAINT_BRUSH = ITEMS.register("black_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.BLACK_PAINTED_PLANKS.get(), ModBlocks.BLACK_PAINTED_PLANKS_STAIRS.get(), ModBlocks.BLACK_PAINTED_PLANKS_SLAB.get(), ModBlocks.BLACK_PAINTED_FENCE.get(), ModBlocks.BLACK_PAINTED_FENCE_GATE.get(), ModBlocks.BLACK_PAINTED_BUTTON.get(), ModBlocks.BLACK_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_BLACK_PAINTED_LOG.get(), ModBlocks.STRIPPED_BLACK_PAINTED_WOOD.get(), ModBlocks.BLACK_PAINTED_BRICKS.get(), ModBlocks.BLACK_PAINTED_BRICK_STAIRS.get(), ModBlocks.BLACK_PAINTED_BRICK_SLAB.get(), ModBlocks.BLACK_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> GRAY_PAINT_BRUSH = ITEMS.register("gray_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.GRAY_PAINTED_PLANKS.get(), ModBlocks.GRAY_PAINTED_PLANKS_STAIRS.get(), ModBlocks.GRAY_PAINTED_PLANKS_SLAB.get(), ModBlocks.GRAY_PAINTED_FENCE.get(), ModBlocks.GRAY_PAINTED_FENCE_GATE.get(), ModBlocks.GRAY_PAINTED_BUTTON.get(), ModBlocks.GRAY_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_GRAY_PAINTED_LOG.get(), ModBlocks.STRIPPED_GRAY_PAINTED_WOOD.get(), ModBlocks.GRAY_PAINTED_BRICKS.get(), ModBlocks.GRAY_PAINTED_BRICK_STAIRS.get(), ModBlocks.GRAY_PAINTED_BRICK_SLAB.get(), ModBlocks.GRAY_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> LIGHT_GRAY_PAINT_BRUSH = ITEMS.register("light_gray_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.LIGHT_GRAY_PAINTED_PLANKS.get(), ModBlocks.LIGHT_GRAY_PAINTED_PLANKS_STAIRS.get(), ModBlocks.LIGHT_GRAY_PAINTED_PLANKS_SLAB.get(), ModBlocks.LIGHT_GRAY_PAINTED_FENCE.get(), ModBlocks.LIGHT_GRAY_PAINTED_FENCE_GATE.get(), ModBlocks.LIGHT_GRAY_PAINTED_BUTTON.get(), ModBlocks.LIGHT_GRAY_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_LIGHT_GRAY_PAINTED_LOG.get(), ModBlocks.STRIPPED_LIGHT_GRAY_PAINTED_WOOD.get(), ModBlocks.LIGHT_GRAY_PAINTED_BRICKS.get(), ModBlocks.LIGHT_GRAY_PAINTED_BRICK_STAIRS.get(), ModBlocks.LIGHT_GRAY_PAINTED_BRICK_SLAB.get(), ModBlocks.LIGHT_GRAY_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));
    public static final RegistryObject<Item> WHITE_PAINT_BRUSH = ITEMS.register("white_paint_brush", () -> new DippedPaintBrushItem(ModBlocks.WHITE_PAINTED_PLANKS.get(), ModBlocks.WHITE_PAINTED_PLANKS_STAIRS.get(), ModBlocks.WHITE_PAINTED_PLANKS_SLAB.get(), ModBlocks.WHITE_PAINTED_FENCE.get(), ModBlocks.WHITE_PAINTED_FENCE_GATE.get(), ModBlocks.WHITE_PAINTED_BUTTON.get(), ModBlocks.WHITE_PAINTED_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_WHITE_PAINTED_LOG.get(), ModBlocks.STRIPPED_WHITE_PAINTED_WOOD.get(), ModBlocks.WHITE_PAINTED_BRICKS.get(), ModBlocks.WHITE_PAINTED_BRICK_STAIRS.get(), ModBlocks.WHITE_PAINTED_BRICK_SLAB.get(), ModBlocks.WHITE_PAINTED_BRICK_WALL.get(), new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).durability(16)));

    public static final RegistryObject<Item> RED_PAINTED_SIGN = ITEMS.register("red_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.RED_PAINTED_SIGN.get(), ModBlocks.RED_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> ORANGE_PAINTED_SIGN = ITEMS.register("orange_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.ORANGE_PAINTED_SIGN.get(), ModBlocks.ORANGE_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> YELLOW_PAINTED_SIGN = ITEMS.register("yellow_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.YELLOW_PAINTED_SIGN.get(), ModBlocks.YELLOW_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> LIME_PAINTED_SIGN = ITEMS.register("lime_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.LIME_PAINTED_SIGN.get(), ModBlocks.LIME_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> GREEN_PAINTED_SIGN = ITEMS.register("green_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.GREEN_PAINTED_SIGN.get(), ModBlocks.GREEN_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_PAINTED_SIGN = ITEMS.register("light_blue_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.LIGHT_BLUE_PAINTED_SIGN.get(), ModBlocks.LIGHT_BLUE_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> CYAN_PAINTED_SIGN = ITEMS.register("cyan_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.CYAN_PAINTED_SIGN.get(), ModBlocks.CYAN_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> BLUE_PAINTED_SIGN = ITEMS.register("blue_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.BLUE_PAINTED_SIGN.get(), ModBlocks.BLUE_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> PURPLE_PAINTED_SIGN = ITEMS.register("purple_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.PURPLE_PAINTED_SIGN.get(), ModBlocks.PURPLE_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAGENTA_PAINTED_SIGN = ITEMS.register("magenta_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.MAGENTA_PAINTED_SIGN.get(), ModBlocks.MAGENTA_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> PINK_PAINTED_SIGN = ITEMS.register("pink_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.PINK_PAINTED_SIGN.get(), ModBlocks.PINK_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> BROWN_PAINTED_SIGN = ITEMS.register("brown_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.BROWN_PAINTED_SIGN.get(), ModBlocks.BROWN_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> BLACK_PAINTED_SIGN = ITEMS.register("black_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.BLACK_PAINTED_SIGN.get(), ModBlocks.BLACK_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> GRAY_PAINTED_SIGN = ITEMS.register("gray_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.GRAY_PAINTED_SIGN.get(), ModBlocks.GRAY_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_PAINTED_SIGN = ITEMS.register("light_gray_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.LIGHT_GRAY_PAINTED_SIGN.get(), ModBlocks.LIGHT_GRAY_PAINTED_WALL_SIGN.get()));
    public static final RegistryObject<Item> WHITE_PAINTED_SIGN = ITEMS.register("white_painted_sign", () -> new SignItem(new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).stacksTo(16), ModBlocks.WHITE_PAINTED_SIGN.get(), ModBlocks.WHITE_PAINTED_WALL_SIGN.get()));
    //Boats
    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> RED_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("red_painted", ModBlocks.RED_PAINTED_PLANKS);
    public static final RegistryObject<Item> RED_PAINTED_FURNACE_BOAT = HELPER.createItem("red_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.RED_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_RED_PAINTED_BOAT = HELPER.createItem("large_red_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_RED_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> ORANGE_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("orange_painted", ModBlocks.ORANGE_PAINTED_PLANKS);
    public static final RegistryObject<Item> ORANGE_PAINTED_FURNACE_BOAT = HELPER.createItem("orange_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.ORANGE_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_ORANGE_PAINTED_BOAT = HELPER.createItem("large_orange_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_ORANGE_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> YELLOW_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("yellow_painted", ModBlocks.YELLOW_PAINTED_PLANKS);
    public static final RegistryObject<Item> YELLOW_PAINTED_FURNACE_BOAT = HELPER.createItem("yellow_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.YELLOW_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_YELLOW_PAINTED_BOAT = HELPER.createItem("large_yellow_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_YELLOW_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> LIME_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("lime_painted", ModBlocks.LIME_PAINTED_PLANKS);
    public static final RegistryObject<Item> LIME_PAINTED_FURNACE_BOAT = HELPER.createItem("lime_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LIME_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_LIME_PAINTED_BOAT = HELPER.createItem("large_lime_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_LIME_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> GREEN_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("green_painted", ModBlocks.GREEN_PAINTED_PLANKS);
    public static final RegistryObject<Item> GREEN_PAINTED_FURNACE_BOAT = HELPER.createItem("green_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.GREEN_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_GREEN_PAINTED_BOAT = HELPER.createItem("large_green_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_GREEN_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> CYAN_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("cyan_painted", ModBlocks.CYAN_PAINTED_PLANKS);
    public static final RegistryObject<Item> CYAN_PAINTED_FURNACE_BOAT = HELPER.createItem("cyan_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.CYAN_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_CYAN_PAINTED_BOAT = HELPER.createItem("large_cyan_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_CYAN_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> LIGHT_BLUE_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("light_blue_painted", ModBlocks.LIGHT_BLUE_PAINTED_PLANKS);
    public static final RegistryObject<Item> LIGHT_BLUE_PAINTED_FURNACE_BOAT = HELPER.createItem("light_blue_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LIGHT_BLUE_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_LIGHT_BLUE_PAINTED_BOAT = HELPER.createItem("large_light_blue_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_LIGHT_BLUE_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> BLUE_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("blue_painted", ModBlocks.BLUE_PAINTED_PLANKS);
    public static final RegistryObject<Item> BLUE_PAINTED_FURNACE_BOAT = HELPER.createItem("blue_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.BLUE_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_BLUE_PAINTED_BOAT = HELPER.createItem("large_blue_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_BLUE_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> PURPLE_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("purple_painted", ModBlocks.PURPLE_PAINTED_PLANKS);
    public static final RegistryObject<Item> PURPLE_PAINTED_FURNACE_BOAT = HELPER.createItem("purple_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.PURPLE_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_PURPLE_PAINTED_BOAT = HELPER.createItem("large_purple_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_PURPLE_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> MAGENTA_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("magenta_painted", ModBlocks.MAGENTA_PAINTED_PLANKS);
    public static final RegistryObject<Item> MAGENTA_PAINTED_FURNACE_BOAT = HELPER.createItem("magenta_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.MAGENTA_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_MAGENTA_PAINTED_BOAT = HELPER.createItem("large_magenta_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_MAGENTA_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> PINK_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("pink_painted", ModBlocks.PINK_PAINTED_PLANKS);
    public static final RegistryObject<Item> PINK_PAINTED_FURNACE_BOAT = HELPER.createItem("pink_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.PINK_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_PINK_PAINTED_BOAT = HELPER.createItem("large_pink_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_PINK_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> BROWN_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("brown_painted", ModBlocks.BROWN_PAINTED_PLANKS);
    public static final RegistryObject<Item> BROWN_PAINTED_FURNACE_BOAT = HELPER.createItem("brown_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.BROWN_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_BROWN_PAINTED_BOAT = HELPER.createItem("large_brown_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_BROWN_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> BLACK_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("black_painted", ModBlocks.BLACK_PAINTED_PLANKS);
    public static final RegistryObject<Item> BLACK_PAINTED_FURNACE_BOAT = HELPER.createItem("black_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.BLACK_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_BLACK_PAINTED_BOAT = HELPER.createItem("large_black_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_BLACK_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> GRAY_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("gray_painted", ModBlocks.GRAY_PAINTED_PLANKS);
    public static final RegistryObject<Item> GRAY_PAINTED_FURNACE_BOAT = HELPER.createItem("gray_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.GRAY_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_GRAY_PAINTED_BOAT = HELPER.createItem("large_gray_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_GRAY_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> LIGHT_GRAY_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("light_gray_painted", ModBlocks.LIGHT_GRAY_PAINTED_PLANKS);
    public static final RegistryObject<Item> LIGHT_GRAY_PAINTED_FURNACE_BOAT = HELPER.createItem("light_gray_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LIGHT_GRAY_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_LIGHT_GRAY_PAINTED_BOAT = HELPER.createItem("large_light_gray_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_LIGHT_GRAY_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static final Pair<RegistryObject<Item>, RegistryObject<Item>> WHITE_PAINTED_BOAT = HELPER.createBoatAndChestBoatItem("white_painted", ModBlocks.WHITE_PAINTED_PLANKS);
    public static final RegistryObject<Item> WHITE_PAINTED_FURNACE_BOAT = HELPER.createItem("white_painted_furnace_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.WHITE_PAINTED_FURNACE_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));
    public static final RegistryObject<Item> LARGE_WHITE_PAINTED_BOAT = HELPER.createItem("large_white_painted_boat", ModList.get().isLoaded("boatload") ? PaintableBoatTypes.LARGE_WHITE_PAINTED_BOAT : () -> new Item(new Item.Properties().tab(AbstractSubRegistryHelper.areModsLoaded("boatload") ? CreativeModeTab.TAB_TRANSPORTATION : null)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}