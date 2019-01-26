package nirmal.repository;

import nirmal.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<Users, Long> {
  Users findById(int id);
}
