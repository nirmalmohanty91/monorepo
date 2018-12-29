package nirmal.loader;

import nirmal.domain.Users;
import nirmal.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Loader {
    @Autowired
    UsersRepository usersRepository;
//
//    @PostConstruct
//    public void load() {
//        List<Users> usersList = getList();
//        usersRepository.save(usersList);
//    }

    public List<Users> getList() {
        List<Users> usersList = new ArrayList<>();
        usersList.add(new Users("Batman", "Tech",123L));
        usersList.add(new Users("Robin", "Tech",13L));
        return usersList;
    }
}