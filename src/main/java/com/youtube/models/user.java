package com.youtube.models;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
    
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "BINARY(16)")
    private UUID id;

    @NotNull
    @Size(min = 1)
    private String firstname;

    @NotNull
    @Size(min = 1)
    private String lastname;

    @NotNull
    @Size(min = 1)
    @Column(unique = true)
    private String username;

    @NotNull
    @Size(min = 1)
    @Email
    @Column(unique = true)
    private String email;

    @NotNull
    @Size(min = 6)
    private String password;

    private String channelDescription;

    @NotNull
    private boolean isAdmin=false;

    public UUID getId(){
        return id;
    }

    public boolean getIsAdmin(){
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin){
        this.isAdmin=isAdmin;
    }

    public String getChannelDescription(){
        return channelDescription;
    }
    public void setChannelDescription(String channelDiscription){
        this.channelDescription=channelDiscription;
    }


 
}
