package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Nelson Simão
 * @since 1.0
 */
public interface ImageService {
// -------------------------- OTHER METHODS --------------------------

    void saveImageFile(Long recipeId, MultipartFile file);
}
