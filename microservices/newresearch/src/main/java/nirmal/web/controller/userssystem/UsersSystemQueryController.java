package nirmal.web.controller.userssystem;

import nirmal.entity.usersystem.Users;
import nirmal.entity.usersystem.UsersContact;
import nirmal.repository.userssystem.UsersContactRepository;
import nirmal.repository.userssystem.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UsersSystemQueryController {
  @Autowired private UsersRepository usersRepository;
  @Autowired private UsersContactRepository usersContactRepository;

  @GetMapping(path = "/all-contacts")
  public List<UsersContact> getUsersContact() {
    return usersContactRepository.findAll();
  }

  @GetMapping(path = "/all-users")
  public List<Users> findAll() {
    return usersRepository.findAll();
  }

  @GetMapping(path = "/{id}")
  public Users findById(@PathVariable Long id) {
    Optional<Users> optional = usersRepository.findById(id);
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
    usersRepository.save(users);
    Optional<Users> optional = usersRepository.findById(users.getId().longValue());
    if (optional.isPresent()) {
      return optional.get();
    } else {
      return null;
    }
  }
}
