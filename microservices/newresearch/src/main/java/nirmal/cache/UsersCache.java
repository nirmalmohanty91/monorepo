//package nirmal.cache;
//
//import nirmal.domain.models.Users;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UsersCache {
//    @Autowired
//    UsersRepository usersRepository;
//
//    @Cacheable(value = "usersCache", key = "#name")
//    public Users getUser(String name) {
//        System.out.println("Retrieving from Database for name: " + name);
//    System.out.println("Hello");
//        return usersRepository.findByName(name);
//
//    }
//}
