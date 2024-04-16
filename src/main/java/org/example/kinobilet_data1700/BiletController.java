package org.example.kinobilet_data1700;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BiletController {
    @Autowired
     private BiletRepository biletRepository;
    @Autowired
    private FilmRepository filmRepository;
    @GetMapping("/hentfilmer")
    public List<Film> hentFilmer(){
        return filmRepository.hentFilmer();
    }
    @PostMapping("/lagreBilet")
    public void lagreBilet(Bilet bilet){biletRepository.lagreBilet(bilet);}
    @GetMapping("/hentBiletter")
    public List<Bilet> hentBiletter(){
       return  biletRepository.hentAlle();
    }
    @GetMapping("/slettBiletter")
    public void slettBiletter(){
        biletRepository.slettAlle();
    }
}
