package nirmal.repository.reviewsystem;

import nirmal.domain.models.reviewsystem.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseJpaRepository extends JpaRepository<Course, Long> {}
