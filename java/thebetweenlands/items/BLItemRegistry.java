package thebetweenlands.items;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import thebetweenlands.creativetabs.ModCreativeTabs;
import thebetweenlands.recipes.BLMaterials;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class BLItemRegistry {
    public static final List<Item> ITEMS = new ArrayList<>();

    // BASIC MATERIALS
    public static final Item testItem = new TestItem().setUnlocalizedName("thebetweenlands.testItem").setTextureName("thebetweenlands:testItem");
    public static final Item swampTalisman = new SwampTalisman();
    public static final Item materialsBL = new ItemMaterialsBL();

    // WEAPONS TOOLS
    public static final Item weedwoodSword = new SwordBL(BLMaterials.toolWeedWood).setUnlocalizedName("thebetweenlands.weedwoodSword").setTextureName("thebetweenlands:weedwoodSword");
    public static final Item weedwoodPickaxe = new PickaxeBL(BLMaterials.toolWeedWood).setUnlocalizedName("thebetweenlands.weedwoodPickaxe").setTextureName("thebetweenlands:weedwoodPickaxe");
    public static final Item weedwoodAxe = new AxeBL(BLMaterials.toolWeedWood).setUnlocalizedName("thebetweenlands.weedwoodAxe").setTextureName("thebetweenlands:weedwoodAxe");
    public static final Item weedwoodShovel = new SpadeBL(BLMaterials.toolWeedWood).setUnlocalizedName("thebetweenlands.weedwoodShovel").setTextureName("thebetweenlands:weedwoodShovel");

    public static final Item betweenstoneSword = new SwordBL(BLMaterials.toolBetweenstone).setUnlocalizedName("thebetweenlands.betweenstoneSword").setTextureName("thebetweenlands:betweenstoneSword");
    public static final Item betweenstonePickaxe = new PickaxeBL(BLMaterials.toolBetweenstone).setUnlocalizedName("thebetweenlands.betweenstonePickaxe").setTextureName("thebetweenlands:betweenstonePickaxe");
    public static final Item betweenstoneAxe = new AxeBL(BLMaterials.toolBetweenstone).setUnlocalizedName("thebetweenlands.betweenstoneAxe").setTextureName("thebetweenlands:betweenstoneAxe");
    public static final Item betweenstoneShovel = new SpadeBL(BLMaterials.toolBetweenstone).setUnlocalizedName("thebetweenlands.betweenstoneShovel").setTextureName("thebetweenlands:betweenstoneShovel");

    public static final Item octineSword = new SwordBL(BLMaterials.toolOctine).setUnlocalizedName("thebetweenlands.octineSword").setTextureName("thebetweenlands:octineSword");
    public static final Item octinePickaxe = new PickaxeBL(BLMaterials.toolOctine).setUnlocalizedName("thebetweenlands.octinePickaxe").setTextureName("thebetweenlands:octinePickaxe");
    public static final Item octineAxe = new AxeBL(BLMaterials.toolOctine).setUnlocalizedName("thebetweenlands.octineAxe").setTextureName("thebetweenlands:octineAxe");
    public static final Item octineShovel = new SpadeBL(BLMaterials.toolOctine).setUnlocalizedName("thebetweenlands.octineShovel").setTextureName("thebetweenlands:octineShovel");

    public static final Item valoniteSword = new SwordBL(BLMaterials.toolValonite).setUnlocalizedName("thebetweenlands.valoniteSword").setTextureName("thebetweenlands:valoniteSword");
    public static final Item valonitePickaxe = new PickaxeBL(BLMaterials.toolValonite).setUnlocalizedName("thebetweenlands.valonitePickaxe").setTextureName("thebetweenlands:valonitePickaxe");
    public static final Item valoniteAxe = new AxeBL(BLMaterials.toolValonite).setUnlocalizedName("thebetweenlands.valoniteAxe").setTextureName("thebetweenlands:valoniteAxe");
    public static final Item valoniteShovel = new SpadeBL(BLMaterials.toolValonite).setUnlocalizedName("thebetweenlands.valoniteShovel").setTextureName("thebetweenlands:valoniteShovel");

    // MISC ARMOUR
    public static final Item lurkerSkinHelmet = new LurkerSkinArmor(0).setUnlocalizedName("thebetweenlands.lurkerSkinHelmet").setTextureName("thebetweenlands:lurkerSkinHelmet");
    public static final Item lurkerSkinChestplate = new LurkerSkinArmor(1).setUnlocalizedName("thebetweenlands.lurkerSkinChestplate").setTextureName("thebetweenlands:lurkerSkinChestplate");
    public static final Item lurkerSkinLeggings = new LurkerSkinArmor(2).setUnlocalizedName("thebetweenlands.lurkerSkinLeggings").setTextureName("thebetweenlands:lurkerSkinLeggings");
    public static final Item lurkerSkinBoots = new LurkerSkinArmor(3).setUnlocalizedName("thebetweenlands.lurkerSkinBoots").setTextureName("thebetweenlands:lurkerSkinBoots");

    public static final Item octineHelmet = new OctineArmor(0).setUnlocalizedName("thebetweenlands.octineHelmet").setTextureName("thebetweenlands:octineHelmet");
    public static final Item octineChestplate = new OctineArmor(1).setUnlocalizedName("thebetweenlands.octineChestplate").setTextureName("thebetweenlands:octineChestplate");
    public static final Item octineLeggings = new OctineArmor(2).setUnlocalizedName("thebetweenlands.octineLeggings").setTextureName("thebetweenlands:octineLeggings");
    public static final Item octineBoots = new OctineArmor(3).setUnlocalizedName("thebetweenlands.octineBoots").setTextureName("thebetweenlands:octineBoots");

    public static final Item valoniteHelmet = new ValoniteArmor(0).setUnlocalizedName("thebetweenlands.valoniteHelmet").setTextureName("thebetweenlands:valoniteHelmet");
    public static final Item valoniteChestplate = new ValoniteArmor(1).setUnlocalizedName("thebetweenlands.valoniteChestplate").setTextureName("thebetweenlands:valoniteChestplate");
    public static final Item valoniteLeggings = new ValoniteArmor(2).setUnlocalizedName("thebetweenlands.valoniteLeggings").setTextureName("thebetweenlands:valoniteLeggings");
    public static final Item valoniteBoots = new ValoniteArmor(3).setUnlocalizedName("thebetweenlands.valoniteBoots").setTextureName("thebetweenlands:valoniteBoots");

    // CREATIVE
    public static final Item spawnEggs = new SpawnEggs().setUnlocalizedName("thebetweenlands.monsterPlacer").setTextureName("spawn_egg");

    //FOOD
    public static final Item sapBall = new ItemSapBall().setUnlocalizedName("thebetweenlands.sapBall").setTextureName("thebetweenlands:sapBall");
    public static final Item rottenFood = new ItemRottenFood().setAlwaysEdible().setUnlocalizedName("thebetweenlands.rottenFood").setTextureName("thebetweenlands:rottenFood");

    public static final Item anglerMeatRaw = new ItemFood(4, 1.8F, false).setUnlocalizedName("thebetweenlands.anglerMeatRaw").setTextureName("thebetweenlands:anglerFlesh");
    public static final Item anglerMeatCooked = new ItemFood(8, 18.0F, false).setUnlocalizedName("thebetweenlands.anglerMeatCooked").setTextureName("thebetweenlands:cookedAnglerFlesh");
    public static final Item frogLegsRaw = new ItemFood(2, 1.2F, false).setUnlocalizedName("thebetweenlands.frogLegsRaw").setTextureName("thebetweenlands:frogLegs");
    public static final Item frogLegsCooked = new ItemFood(2, 1.2F, false).setUnlocalizedName("thebetweenlands.frogLegsCooked").setTextureName("thebetweenlands:frogLegsCooked");
    public static final Item snailFleshRaw = new ItemFood(3, 1.6F, false).setUnlocalizedName("thebetweenlands.snailFleshRaw").setTextureName("thebetweenlands:SnailMeat");
    public static final Item snailFleshCooked = new ItemFood(6, 13.2F, false).setUnlocalizedName("thebetweenlands.snailFleshCooked").setTextureName("thebetweenlands:CookedSnailMeat");
    public static final Item reedDonut = new ItemFood(6, 13.2F, false).setUnlocalizedName("thebetweenlands.reedDonut").setTextureName("thebetweenlands:donut");
    public static final Item jamDonut = new ItemFood(10, 20.0F, false).setUnlocalizedName("thebetweenlands.jamDonut").setTextureName("thebetweenlands:jamDonut");
    public static final Item gertsDonut = new ItemGertsDonut().setUnlocalizedName("thebetweenlands.gertsDonut").setTextureName("thebetweenlands:gertsDonut");
    public static final Item krakenTentacle = new ItemFood(8, 8.0F, false).setUnlocalizedName("thebetweenlands.krakenTentacle").setTextureName("thebetweenlands:krakenTentacle");
    public static final Item krakenCalamari = new ItemFood(14, 20.0F, false).setUnlocalizedName("thebetweenlands.krakenCalamari").setTextureName("thebetweenlands:krakenCalamari");
    public static final Item middleFruit = new ItemFood(6, 15.6F, false).setUnlocalizedName("thebetweenlands.middleFruit").setTextureName("thebetweenlands:middleFruit");
    public static final Item mincePie = new ItemFood(4, 14.8F, false).setUnlocalizedName("thebetweenlands.mincePie").setTextureName("thebetweenlands:mincePie");
    public static final Item weepingBluePetal = new ItemWeepingBluePetal().setUnlocalizedName("thebetweenlands.weepingBluePetal").setTextureName("thebetweenlands:weepingBluePetal");
    public static final Item wightsHeart = new ItemWightHeart().setUnlocalizedName("thebetweenlands.wightHeart").setTextureName("thebetweenlands:wightHeart");
    public static final Item yellowDottedFungus = new ItemFood(10, 20.0F, false).setUnlocalizedName("thebetweenlands.yellowDottedFungus").setTextureName("thebetweenlands:yellowDottedFungus");


    public static void init() {
        initCreativeTabs();
        registerItems();
        registerProperties();
    }

    private static void initCreativeTabs() {
        ModCreativeTabs.items.setTab(swampTalisman, materialsBL, sapBall, rottenFood, anglerMeatRaw, anglerMeatCooked, frogLegsRaw, frogLegsCooked, snailFleshRaw,
                                     snailFleshCooked, reedDonut, jamDonut, gertsDonut, krakenTentacle, krakenCalamari, middleFruit, mincePie, weepingBluePetal,
                                     wightsHeart, yellowDottedFungus);
        ModCreativeTabs.specials.setTab(testItem, spawnEggs);
        ModCreativeTabs.gears.setTab(weedwoodSword, weedwoodPickaxe, weedwoodAxe, weedwoodShovel, betweenstoneSword, betweenstonePickaxe, betweenstoneAxe, betweenstoneShovel, octineSword, octinePickaxe, octineAxe, octineShovel, valoniteSword, valonitePickaxe, valoniteAxe, valoniteShovel);
        ModCreativeTabs.gears.setTab(lurkerSkinHelmet, lurkerSkinChestplate, lurkerSkinLeggings, lurkerSkinBoots, octineHelmet, octineChestplate, octineLeggings, octineBoots, valoniteHelmet, valoniteChestplate, valoniteLeggings, valoniteBoots);
    }

    private static void registerItems() {
        try {
            for (Field f : BLItemRegistry.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof Item) registerItem((Item) obj);
                else if (obj instanceof Item[])
                    for (Item item : (Item[]) obj)
                        registerItem(item);
            }
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void registerItem(Item item) {
        ITEMS.add(item);
        String name = item.getUnlocalizedName();
        String[] strings = name.split("\\.");
        GameRegistry.registerItem(item, strings[strings.length - 1]);
    }

    private static void registerProperties() {
        GameRegistry.registerFuelHandler(new IFuelHandler() {
            @Override
            public int getBurnTime(ItemStack fuel) {
                return 0;
                //add fuels here
            }
        });
    }
}
