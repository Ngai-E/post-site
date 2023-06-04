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
@Table(name = "t_token")
public class TToken implements Serializable {
    private static final long serialVersionUID = 1810186251601974839L;
    @Id
    @Column(name = "lg_token_id", nullable = false, length = 50)
    private String lgTokenId;

    @Column(name = "str_refresh")
    private String strRefresh;

    @Column(name = "status", length = 10)
    private String status;

    @Column(name = "dt_created")
    private Instant dtCreated;

}
