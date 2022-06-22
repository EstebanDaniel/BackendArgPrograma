
package com.backEnd.SpringBoot.Repository;

import com.backEnd.SpringBoot.Model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User,Integer> {
 Optional<User>findByEmail(String email);
    
}
 