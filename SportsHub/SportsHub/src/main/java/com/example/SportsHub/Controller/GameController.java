package com.example.SportsHub.Controller;

import com.example.SportsHub.Model.GameModel;
import com.example.SportsHub.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GameController {
    @Autowired
    GameService gameServiceObject;

    @PostMapping("/add")
    public void add(@RequestBody GameModel gameModelObject){
        gameServiceObject.add(gameModelObject);
    }
    @GetMapping("/get")
    public List<GameModel>display(){
       return gameServiceObject.display();
    }
    @GetMapping("/getById/{id}")
    public Optional<GameModel>displayById(@PathVariable int id){
        return gameServiceObject.displayById(id);

    }
    @DeleteMapping("/delete")
    public String deleteById(@PathVariable int id){
        gameServiceObject.deleteById(id);
        return "deleted";
    }

    @PutMapping("/update")
    public String updateById(@PathVariable int id,@RequestBody GameModel gameModelObject){
        return gameServiceObject.updateById(id,gameModelObject);
    }
}
