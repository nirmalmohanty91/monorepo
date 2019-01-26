package nirmal.domain.ui;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class User {
  private String id;
  private String firstName;
  private String lastName;
  private String address;
}
