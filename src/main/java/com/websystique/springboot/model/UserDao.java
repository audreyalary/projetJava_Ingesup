package com.websystique.springboot.model;


public interface UserDao extends UserRepository <User> {

    /**
     * This method will find an User instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    public User findById(Long id);

}
