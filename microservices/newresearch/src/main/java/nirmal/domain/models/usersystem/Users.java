package nirmal.domain.models.usersystem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String firstName;
  private Integer age;
  private Integer salary;
}
