package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Dao.gameDao;
import com.example.demo.models.game;



@Service
public class gamesservice {
	
	@Autowired
    private gameDao repos;

	public game addUser(game usr) {
		return repos.save(usr);
	}

	public ArrayList<game> getAllUser(){
		return (ArrayList<game>) repos.findAll();
	}
	
}
