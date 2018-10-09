package guru.springframework.commands;

/**
 * @author Nelson Simão
 * @since 1.0
 */

public class NotesCommand {
// ------------------------------ FIELDS ------------------------------

    private Long id;
    private String recipeNotes;

// --------------------- GETTER / SETTER METHODS ---------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
