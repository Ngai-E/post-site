package com.hustler.post.dal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "t_parameters")
public class TParameter implements Serializable {
    private static final long serialVersionUID = 1030760737791099625L;
    @Id
    @Column(name = "str_key", nullable = false)
    private String strKey;

    @Column(name = "str_value")
    private String strValue;

    @Column(name = "b_encrypted")
    private Boolean bEncrypted;

    @Column(name = "dt_created_at")
    private Instant dtCreatedAt;

    @Column(name = "b_active")
    private Boolean bActive;

}
