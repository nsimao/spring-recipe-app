package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
// -------------------------- OTHER METHODS --------------------------

    Optional<UnitOfMeasure> findByDescription(String description);
}
