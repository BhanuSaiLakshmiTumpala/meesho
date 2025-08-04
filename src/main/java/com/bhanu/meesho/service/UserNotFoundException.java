package com.bhanu.meesho.service;

public class UserNotFoundException extends RuntimeException{
   public UserNotFoundException(String message){
    super(message);
   }
}
