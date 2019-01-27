import nirmal.Application;
import nirmal.repository.reviewsystem.CourseJpaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ReviewSystemTest {
  private Logger logger = LoggerFactory.getLogger(this.getClass());
  @Autowired CourseJpaRepository courseJpaRepository;

  @Test
  public void contextLoads() {
    logger.info("Test is running");
    Assert.assertEquals("Angular", courseJpaRepository.findById(4l).get().getName());
  }
}
