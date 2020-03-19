package com.strategival.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="user_info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="username")
    private String userName;

    public User(){}

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
