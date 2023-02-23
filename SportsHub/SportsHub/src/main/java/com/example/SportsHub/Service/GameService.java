package com.example.SportsHub.Service;

import com.example.SportsHub.Model.GameModel;
import com.example.SportsHub.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepositoryObject;

    public void add(GameModel gameModelObject){
        gameRepositoryObject.save(gameModelObject);

    }

    public List<GameModel> display(){
       return gameRepositoryObject.findAll();
    }

    public Optional<GameModel>displayById(int id){
       return gameRepositoryObject.findById(id);
    }
    public String deleteById(int id){
        gameRepositoryObject.deleteById(id);
        return "Deleted";
    }
    public String updateById(int id,GameModel gameModelObject){
        if(gameRepositoryObject.findById(id)!=null){
            gameRepositoryObject.deleteById(id);
            gameRepositoryObject.save(gameModelObject);
            return "Updated";
        }
        return "No Such Id found";
    }
}
