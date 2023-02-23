package com.example.SportsHub.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class OrderModel {

    @Id
    private int orderid;
    private String name;
    private String phoneNo;
    private String email;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "gameid")
    private GameModel newgame;

}

