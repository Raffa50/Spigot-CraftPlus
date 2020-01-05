package aldrigos.mc.craftplus;

import aldrigos.mc.craftplus.listeners.ShovelListener;
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
            recipes.getTotem()
        );

        getServer().getPluginManager().registerEvents(new ShovelListener(), this);
    }

    @Override
    public void onDisable(){
        getServer().getLogger().info("[Craft+]Disabled");
    }
}
