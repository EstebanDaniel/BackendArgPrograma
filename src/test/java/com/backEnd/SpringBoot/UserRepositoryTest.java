
package com.backEnd.SpringBoot;

import com.backEnd.SpringBoot.Model.User;
import com.backEnd.SpringBoot.Repository.UserRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;


@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    
    @Autowired
    UserRepository userRepository;
    
    @Test
    public void testCreateUser(){
    PasswordEncoder passwordEncoder= new BCryptPasswordEncoder();

        String rawPassword = "";
        String encodePassword= passwordEncoder.encode(rawPassword);
        User newUser = new User ("estebandanielcardozo65@gmail.com",encodePassword);
        User savedUser= userRepository.save(newUser);
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);
        
    }
    
}
