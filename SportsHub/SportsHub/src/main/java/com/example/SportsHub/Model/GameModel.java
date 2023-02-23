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
public class GameModel {

    @Id
    private int gameid;
    private int price;
    private String game;
    private String equipment;
    private String info;

}
