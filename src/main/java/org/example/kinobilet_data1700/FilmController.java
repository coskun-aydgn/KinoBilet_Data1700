package org.example.kinobilet_data1700;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class FilmController {
    @Autowired
    private FilmRepository filmRepository;
    @GetMapping("/hentFilmer")
    public ArrayList<Film> hentFilmer(){
        return filmRepository.hentFilmer();
    }
}
