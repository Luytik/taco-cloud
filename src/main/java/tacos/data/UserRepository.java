package tacos.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tacos.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);
	
	/*
	 * @Query("Select u FROM User u where u.username = :username") User
	 * findUsername(@Param("username") String username);
	 */
}
