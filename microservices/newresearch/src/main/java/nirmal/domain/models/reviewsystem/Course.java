package nirmal.domain.models.reviewsystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
  @Id @GeneratedValue private Long id;

  @Column(nullable = false)
  private String name;

  @OneToMany(mappedBy = "course",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
  public List<Review> reviewList = new ArrayList<>();

  @UpdateTimestamp private LocalDate lastUpdatedDate;
  @CreationTimestamp private LocalDate createdDate;

  public void addReview(Review review) {
    this.reviewList.add(review);
  }

  public void removeReview(Review review) {
    this.reviewList.remove(review);
  }
}
