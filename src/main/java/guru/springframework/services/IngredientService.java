package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * @author Nelson Simão
 * @since 1.0
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
