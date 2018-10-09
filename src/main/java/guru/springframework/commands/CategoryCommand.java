package guru.springframework.commands;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class CategoryCommand {
// ------------------------------ FIELDS ------------------------------

    private Long id;
    private String description;

// --------------------- GETTER / SETTER METHODS ---------------------

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
}
