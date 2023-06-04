package com.hustler.post.dal.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "t_users", indexes = {
        @Index(name = "user status", columnList = "status")
})
public class TUser implements Serializable {
    private static final long serialVersionUID = -4541805584875211202L;
    @Id
    @Column(name = "user_id", nullable = false, length = 50)
    private String userId;

    @Column(name = "name")
    private String name;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "status", length = 15)
    private String status;

    @Column(name = "dt_created")
    private Instant dtCreated;

    @Column(name = "dt_updated")
    private Instant dtUpdated;

}
