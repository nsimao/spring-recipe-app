package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface CategoryRepository extends CrudRepository<Category, Long> {
// -------------------------- OTHER METHODS --------------------------

    Optional<Category> findByDescription(String description);
}
