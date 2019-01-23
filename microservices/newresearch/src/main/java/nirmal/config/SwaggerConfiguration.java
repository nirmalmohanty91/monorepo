package nirmal.config;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
  @Value("${details.title}")
  private String title;
  @Value("${details.version}")
  private String version;
  @Value("${details.description}")
  private String description;

  @Bean
  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(
            new ApiInfoBuilder().title(title).version(version).description(description).build())
        .select().apis(RequestHandlerSelectors.basePackage("com.nirmal.web.service.controller"))
        .paths(PathSelectors.any()).build()
        .directModelSubstitute(LocalDateTime.class, java.util.Date.class);
  }

}
