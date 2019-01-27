package nirmal.repository.reviewsystem;

import nirmal.domain.models.reviewsystem.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewJpaRepository extends JpaRepository<Review, Long> {}
