package nirmal.repository.userssystem;

import nirmal.entity.usersystem.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
//  Users findById(int id);
}
