package aldrigos.mc.craftplus;

import org.bukkit.inventory.Recipe;
import org.bukkit.plugin.java.JavaPlugin;

public class CraftPlusPlugin extends JavaPlugin {
    private void addRecipes(Recipe... recipes){
        for(var r: recipes)
            getServer().addRecipe(r);

        getServer().getLogger().info("[Craft+]Added "+recipes.length+" recipes");
    }

    @Override
    public void onEnable(){
        var recipes = new Recipes(this);
        addRecipes(
            recipes.getTrident(),
            recipes.getSaddle(),
            recipes.getElytra(),
            recipes.getBell(),
            recipes.getNameTag(),
            recipes.getIronHorseArmor(),
            recipes.getGoldHorseArmor(),
            recipes.getDiamondHorseArmor(),
            recipes.getQuartz(),
            recipes.getTotem(),
            recipes.getMailHelm(),
            recipes.getMailChest(),
            recipes.getMailPants(),
            recipes.getMailBoots()
        );
    }

    @Override
    public void onDisable(){
        getServer().getLogger().info("[Craft+]Disabled");
    }
}
