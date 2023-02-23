package com.example.SportsHub.Repository;

import com.example.SportsHub.Model.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface GameRepository extends JpaRepository<GameModel,Integer> {

}
