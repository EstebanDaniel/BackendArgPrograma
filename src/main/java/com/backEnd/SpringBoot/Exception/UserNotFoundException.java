
package com.backEnd.SpringBoot.Exception;


public class UserNotFoundException extends RuntimeException {
    
    public UserNotFoundException(String message){
        super(message);
    }
}
