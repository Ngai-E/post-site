package com.hustler.post.dal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.Instant;

@Entity
public class TParameter implements Serializable {
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

    public String getStrKey() {
        return strKey;
    }

    public void setStrKey(String strKey) {
        this.strKey = strKey;
    }

    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public Boolean getBEncrypted() {
        return bEncrypted;
    }

    public void setBEncrypted(Boolean bEncrypted) {
        this.bEncrypted = bEncrypted;
    }

    public Instant getDtCreatedAt() {
        return dtCreatedAt;
    }

    public void setDtCreatedAt(Instant dtCreatedAt) {
        this.dtCreatedAt = dtCreatedAt;
    }

    public Boolean getBActive() {
        return bActive;
    }

    public void setBActive(Boolean bActive) {
        this.bActive = bActive;
    }

}
