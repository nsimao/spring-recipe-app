package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nelson Simão
 * @since 1.0
 */
@Controller
public class RecipeController {
// ------------------------------ FIELDS ------------------------------

    private final RecipeService recipeService;

// --------------------------- CONSTRUCTORS ---------------------------

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

// -------------------------- OTHER METHODS --------------------------

    @RequestMapping("/recipe/show/{id}")
    public String showById(@PathVariable String id, Model model) {
        model.addAttribute("recipe", recipeService.findById(new Long(id)));
        return "recipe/show";
    }
}
