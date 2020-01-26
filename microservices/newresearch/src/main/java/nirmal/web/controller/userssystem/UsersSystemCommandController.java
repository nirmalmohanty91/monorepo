package nirmal.web.controller.userssystem;

import nirmal.entity.usersystem.Users;
import nirmal.repository.userssystem.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/users")
public class UsersSystemCommandController {
  @Autowired private UsersRepository usersRepository;

  //  @GetMapping(path = "/update/{name}")
  //  public List<UsersContact> update(@PathVariable final String name) {
  //
  //    User user = User.builder().name(name).teamName("Flex").salary(1000).build();
  //    usersContactRepository.save(UsersContact.builder().phoneNo(1111).users(user).build());
  //
  //    return usersContactRepository.findAll();
  //  }

  @PostMapping(path = "add-user")
  public Users addUser(@RequestBody Users user) {
    return usersRepository.save(user);
  }

  @PostMapping(path = "update-user")
  public Users updateUser(@RequestBody Users user) {
    return usersRepository.save(user);
  }

  @PostMapping(path = "delete-user")
  public List<Users> deleteUser(@RequestBody Users user) {
    usersRepository.delete(user);
    return usersRepository.findAll();
  }
}
