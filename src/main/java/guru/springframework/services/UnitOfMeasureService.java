package guru.springframework.services;

import guru.springframework.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * @author Nelson Simão
 * @since 1.0
 */
public interface UnitOfMeasureService {
// -------------------------- OTHER METHODS --------------------------

    Set<UnitOfMeasureCommand> listAllUoms();
}
