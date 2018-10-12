package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Nelson Simão
 * @since 1.0
 */

@Controller
public class IngredientController {
// ------------------------------ FIELDS ------------------------------

    private final RecipeService recipeService;

// --------------------------- CONSTRUCTORS ---------------------------

    public IngredientController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

// -------------------------- OTHER METHODS --------------------------

    @GetMapping("/recipe/{recipeId}/ingredients")
    public String listIngredients(@PathVariable String recipeId, Model model) {
        model.addAttribute("recipe", recipeService.findCommandById(Long.valueOf(recipeId)));
        return "recipe/ingredient/list";
    }
}
