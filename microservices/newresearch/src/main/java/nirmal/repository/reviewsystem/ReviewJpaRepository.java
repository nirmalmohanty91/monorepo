package nirmal.repository.reviewsystem;

import nirmal.entity.reviewsystem.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewJpaRepository extends JpaRepository<Review, Long> {}
