package nirmal.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
@ConfigurationProperties("details")
public class SwaggerUIDetails {
  private String title;
  private String description;
  private String version;

}
