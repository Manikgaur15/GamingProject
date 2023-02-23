package com.example.SportsHub.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserModel {
    @Id
    private int id;
    private String username;
    private String password;
    private String role;

}
