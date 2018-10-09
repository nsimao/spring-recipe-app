package guru.springframework.commands;

import java.math.BigDecimal;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class IngredientCommand {
// ------------------------------ FIELDS ------------------------------

    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand unitOfMeasure;

// --------------------- GETTER / SETTER METHODS ---------------------

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UnitOfMeasureCommand getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasureCommand unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
