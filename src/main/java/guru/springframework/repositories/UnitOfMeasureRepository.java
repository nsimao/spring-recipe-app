package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
