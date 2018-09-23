package guru.springframework.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Nelson Simão
 * @since 1.0
 */

@Entity
public class Ingredient {
// ------------------------------ FIELDS ------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    //private UnitOfMeasure uom;
    @ManyToOne
    private Recipe recipe;

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

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}