package nirmal.web.controller;

import nirmal.domain.User;
import nirmal.web.service.UserService;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserController {
  public static final int ID_LENGTH = 10;

  @Autowired User user;

  @Autowired UserService userService;

  @GetMapping(path = "searchUserByFirstName")
  public List<User> searchUserByFirstName(@RequestParam(required = true) String firstName) {
    List<User> list = userService.getUserByFirstName(firstName);
    return list;
  }

  @PostMapping(
      value = "/insertUser",
      consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public User insertUser(@RequestBody User user) {
    boolean inserted = userService.insertData(user);
    if (inserted) return user;
    else return null;
  }

  public String generateUniqueId() {
    return RandomStringUtils.randomAlphanumeric(ID_LENGTH);
  }

  @GetMapping(path = "search/{name}/{id}")
  public List<User> search(
      @PathVariable(required = false) String name, @PathVariable(required = false) String id) {

    if (!StringUtils.isEmpty(name)) {
      // Query for search name to DB
    }

    if (!StringUtils.isEmpty(id)) {
      int i = Integer.parseInt(id);
      // Query for search id to DB
    }

    return null;
  }

  @GetMapping(path = "/testingException")
  public void getError() {
    userService.getError();
  }
}
