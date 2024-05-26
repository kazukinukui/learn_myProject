package com.example.bbbbbb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MyRestController {

    @Autowired
    private BirthStoneRepository birthStoneRepository;

    @GetMapping("/")
    public BirthStone getBirthStone() {
        // 任意のデータを返す例
        BirthStone birthStone = new BirthStone();
        birthStone.setStone("kazuki");
        birthStone.setMonth("Dec");
        return birthStone;
    }

    @PostMapping("/save")
    public BirthStone saveBirthStone(@RequestBody BirthStone birthStone) {
        return birthStoneRepository.save(birthStone);
    }
    @GetMapping("/all")
    public List<BirthStone> getAllBirthStones() {
        return birthStoneRepository.findAll();
    } 
    
}
