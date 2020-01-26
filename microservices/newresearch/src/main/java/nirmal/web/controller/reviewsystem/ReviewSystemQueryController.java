package nirmal.web.controller.reviewsystem;

import nirmal.entity.reviewsystem.Course;
import nirmal.entity.reviewsystem.Review;
import nirmal.repository.reviewsystem.CourseJpaRepository;
import nirmal.repository.reviewsystem.ReviewJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/review")
public class ReviewSystemQueryController {

  @Autowired CourseJpaRepository courseJpaRepository;
  @Autowired ReviewJpaRepository reviewJpaRepository;

  @GetMapping(path = "/all-courses")
  public List<Course> getAllCourses() {
    return courseJpaRepository.findAll();
  }

  @GetMapping(path = "/all-reviews")
  public List<Review> getAllReviews() {
    return reviewJpaRepository.findAll();
  }
}
