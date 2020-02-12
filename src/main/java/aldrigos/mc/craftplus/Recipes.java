package aldrigos.mc.craftplus;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Item;
import org.bukkit.inventory.*;
import org.bukkit.plugin.Plugin;

public class Recipes {
    private final Plugin p;

    public Recipes(Plugin plugin){
        p = plugin;
    }

    public Recipe getSaddle(){
        var r = new ShapedRecipe(
            new NamespacedKey(p, "saddle"),
            new ItemStack(Material.SADDLE)
        );

        r.shape("lll",
                "l l",
                "tst");
        r.setIngredient('l', Material.LEATHER);
        r.setIngredient('s', Material.LEAD);
        r.setIngredient('t', Material.TRIPWIRE_HOOK);

        return r;
    }

    public Recipe getBell(){
        var r = new ShapedRecipe(
            new NamespacedKey(p, "bell"),
            new ItemStack(Material.BELL)
        );

        r.shape("www",
                "lgl",
                "l l");
        r.setIngredient('w', Material.STICK);
        r.setIngredient('l', Material.COBBLESTONE_WALL);
        r.setIngredient('g', Material.GOLD_BLOCK);

        return r;
    }

    public Recipe getElytra(){
        var r = new ShapedRecipe(
          new NamespacedKey(p, "eytra"),
          new ItemStack(Material.ELYTRA)
        );

        r.shape("ppp",
                "psp",
                "p p");

        r.setIngredient('p', Material.PHANTOM_MEMBRANE);
        r.setIngredient('s', Material.STRING);

        return r;
    }

    public Recipe getTrident(){
        var r = new ShapedRecipe(
          new NamespacedKey(p, "trident"),
          new ItemStack(Material.TRIDENT)
        );

        r.shape("iii",
                " d ",
                " d ");
        r.setIngredient('i', Material.IRON_INGOT);
        r.setIngredient('d', Material.DIAMOND);

        return r;
    }

    public Recipe getNameTag(){
        var r = new ShapelessRecipe(
            new NamespacedKey(p, "nametag"),
            new ItemStack(Material.NAME_TAG)
        );

        r.addIngredient(Material.PAPER);
        r.addIngredient(2, Material.STRING);

        return r;
    }

    public Recipe getIronHorseArmor(){
        var r = new ShapedRecipe(
            new NamespacedKey(p, "ironhorsearmor"),
            new ItemStack(Material.IRON_HORSE_ARMOR)
        );

        r.shape("i i",
                "ili",
                "i i");

        r.setIngredient('i', Material.IRON_INGOT);
        r.setIngredient('l', Material.LEATHER);

        return r;
    }

    public Recipe getGoldHorseArmor(){
        var r = new ShapedRecipe(
                new NamespacedKey(p, "goldhorsearmor"),
                new ItemStack(Material.GOLDEN_HORSE_ARMOR)
        );

        r.shape("i i",
                "ili",
                "i i");

        r.setIngredient('i', Material.GOLD_INGOT);
        r.setIngredient('l', Material.LEATHER);

        return r;
    }

    public Recipe getDiamondHorseArmor(){
        var r = new ShapedRecipe(
                new NamespacedKey(p, "diamondhorsearmor"),
                new ItemStack(Material.DIAMOND_HORSE_ARMOR)
        );

        r.shape("i i",
                "ili",
                "i i");

        r.setIngredient('i', Material.DIAMOND);
        r.setIngredient('l', Material.LEATHER);

        return r;
    }

    public Recipe getQuartz(){
        var r = new ShapelessRecipe(
            new NamespacedKey(p, "quartz"),
            new ItemStack(Material.QUARTZ, 4)
        );

        r.addIngredient(
            new RecipeChoice.MaterialChoice(
                Material.QUARTZ_BLOCK,
                Material.CHISELED_QUARTZ_BLOCK,
                Material.SMOOTH_QUARTZ,
                Material.QUARTZ_PILLAR));

        return r;
    }

    public Recipe getTotem(){
        var r = new ShapedRecipe(
                new NamespacedKey(p, "totem"),
                new ItemStack(Material.TOTEM_OF_UNDYING)
        );

        r.shape(" h ",
                "geg",
                " g ");
        r.setIngredient('h', Material.GOLDEN_HELMET);
        r.setIngredient('e', Material.EMERALD);
        r.setIngredient('g', Material.GOLD_INGOT);

        return r;
    }

    public Recipe getGoldApple(){
        var r = new ShapedRecipe(
                new NamespacedKey(p, "goldenapple"),
                new ItemStack(Material.GOLDEN_APPLE)
        );

        r.shape("ggg",
                "gag",
                "ggg");
        r.setIngredient('g', Material.GOLD_BLOCK);
        r.setIngredient('a', Material.APPLE);

        return r;
    }
}
