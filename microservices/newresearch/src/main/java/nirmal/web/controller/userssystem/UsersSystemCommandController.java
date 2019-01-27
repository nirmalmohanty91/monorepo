package nirmal.web.controller.userssystem;

import nirmal.domain.models.usersystem.Users;
import nirmal.domain.models.usersystem.UsersContact;
import nirmal.repository.userssystem.UsersContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersSystemCommandController {
  @Autowired private UsersContactRepository usersContactRepository;

  @GetMapping(path = "/update/{name}")
  public List<UsersContact> update(@PathVariable final String name) {

    Users user = Users.builder().name(name).teamName("Flex").salary(1000).build();
    usersContactRepository.save(UsersContact.builder().phoneNo(1111).users(user).build());

    return usersContactRepository.findAll();
  }
}
