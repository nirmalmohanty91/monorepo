package nirmal;

import lombok.extern.slf4j.Slf4j;
import nirmal.domain.models.reviewsystem.Course;
import nirmal.repository.reviewsystem.CourseJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired private CourseJpaRepository courseJpaRepository;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) {
    Course course =
        courseJpaRepository.findById(3l).isPresent()
            ? courseJpaRepository.findById(3l).get()
            : null;
    logger.info("Course 3 -> {}", course);
  }
}
