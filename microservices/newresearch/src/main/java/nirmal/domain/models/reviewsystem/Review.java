package nirmal.domain.models.reviewsystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Review {

  @Id @GeneratedValue private Long id;

  private String rating;

  private String description;

  @ManyToOne private Course course;
}
