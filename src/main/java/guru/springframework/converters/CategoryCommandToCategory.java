package guru.springframework.converters;

import guru.springframework.commands.CategoryCommand;
import guru.springframework.domain.Category;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @author Nelson Simão
 * @since 1.0
 */

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {
// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface Converter ---------------------

    @Nullable
    @Override
    public Category convert(CategoryCommand categoryCommand) {
        if (categoryCommand == null) {
            return null;
        }
        final Category category = new Category();
        category.setId(categoryCommand.getId());
        category.setDescription(categoryCommand.getDescription());
        return category;
    }
}
