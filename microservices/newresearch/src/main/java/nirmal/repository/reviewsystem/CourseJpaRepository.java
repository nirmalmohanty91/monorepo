package nirmal.repository.reviewsystem;

import nirmal.entity.reviewsystem.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseJpaRepository extends JpaRepository<Course, Long> {}
