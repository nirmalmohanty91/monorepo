package nirmal.web.controller.reviewsystem;

import nirmal.domain.models.reviewsystem.Course;
import nirmal.domain.models.reviewsystem.Review;
import nirmal.repository.reviewsystem.CourseJpaRepository;
import nirmal.repository.reviewsystem.ReviewJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/review")
public class ReviewSystemCommandController {

  @Autowired CourseJpaRepository courseJpaRepository;
  @Autowired ReviewJpaRepository reviewJpaRepository;

  @PostMapping(path = "/load-course")
  public Course loadCourse(@RequestBody Course course) {
    courseJpaRepository.save(course);
    Optional<Course> optional = courseJpaRepository.findById(course.getId());
    if (optional.isPresent()) {
      return optional.get();
    } else {
      return null;
    }
  }

  @PostMapping(path = "/load-review")
  public Review loadReview(@RequestBody Review review) {

    reviewJpaRepository.save(review);

    Optional<Review> optional = reviewJpaRepository.findById(review.getId());
    if (optional.isPresent()) {
      return optional.get();
    } else {
      return null;
    }
  }
}
