package nirmal.repository.userssystem;

import nirmal.domain.models.usersystem.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
//  Users findById(int id);
}
