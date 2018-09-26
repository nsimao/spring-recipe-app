package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nelson Simão
 * @since 1.0
 */

@Controller
public class IndexController {
// ------------------------------ FIELDS ------------------------------

    private final RecipeService recipeService;

// --------------------------- CONSTRUCTORS ---------------------------

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

// -------------------------- OTHER METHODS --------------------------

    @RequestMapping({"", "/", "/index", "/index.html", "/index.htm"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}