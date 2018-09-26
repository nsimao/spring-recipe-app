package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface RecipeService {
// -------------------------- OTHER METHODS --------------------------

    Set<Recipe> getRecipes();
}
