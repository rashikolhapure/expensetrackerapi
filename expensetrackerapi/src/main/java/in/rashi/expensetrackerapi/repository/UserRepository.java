package in.rashi.expensetrackerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.rashi.expensetrackerapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
