package org.gorshkovdev.service.images;

import jakarta.validation.constraints.Pattern;
import org.springframework.core.io.Resource;

/**
 * @author gorshkovdev
 * @version 1.0-SNAPSHOT
 */
public interface ImageContentService {

  record ContentResponse<T>(Image image, T content) {

  }

  ContentResponse<Resource> getResource(Long id);

  ContentResponse<String> getBase64(Long id);

  Image create(@Pattern(regexp = Image.FILENAME_REGEXP) String filename, String contentType,
               Resource conte1nt);

  void delete(Long id);
}