package com.aula124.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id", columnDefinition = "INTEGER", nullable = false)
    private Long id;

    @Column(name = "username", columnDefinition = "TEXT", nullable = false, unique = true, length = 255)
    private String username;

    @Column(name = "email", columnDefinition = "TEXT", nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "password", columnDefinition = "TEXT", nullable = false, length = 255)
    private String password;

    public User() {
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
