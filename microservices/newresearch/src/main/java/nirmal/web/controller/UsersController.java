package nirmal.web.controller;

import nirmal.domain.models.Users;
import nirmal.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsersController {
  @Autowired private UserJpaRepository userJpaRepository;

  @GetMapping(path = "/all")
  public List<Users> findAll() {
    return userJpaRepository.findAll();
  }

  @GetMapping(path = "/{id}")
  public Users findByName(@PathVariable Long id) {
    Optional<Users> optional = userJpaRepository.findById(id);
    if (optional.isPresent()) {
      return optional.get();
    } else {
      return null;
    }
  }

  /**
   * To load data into the the Database
   *
   * @param users
   * @return
   */
  @PostMapping(path = "/load")
  public Users load(@RequestBody Users users) {
    userJpaRepository.save(users);
    Optional<Users> optional = userJpaRepository.findById(users.getId());
    if (optional.isPresent()) {
      return optional.get();
    } else {
      return null;
    }
  }
}
