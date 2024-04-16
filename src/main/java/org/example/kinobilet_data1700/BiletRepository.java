package org.example.kinobilet_data1700;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BiletRepository {
    @Autowired
    private JdbcTemplate db;

    public void lagreBilet(Bilet bilet){
        String sql = "INSERT INTO Bilet(filmNavn, antall, fornavn, etternavn, telefonNr,email) VALUES (?, ?, ?, ?, ?,?);";
        db.update(sql, bilet.getFilmNavn(), bilet.getAntall(), bilet.getFornavn(), bilet.getEtternavn(), bilet.getTelefonNr(),bilet.getEmail());
    }

    public List<Bilet> hentAlle(){

        String sql = "SELECT * FROM Bilet ";
        List<Bilet> alleBiletter = db.query(sql, new BeanPropertyRowMapper(Bilet.class));
        return alleBiletter;
    }

    public List<Film> hentFilmer(){
        String sql = "SELECT * FROM Filmer;";
        List<Film> filmList = db.query(sql, new BeanPropertyRowMapper(Film.class));
        return filmList;
    }

    public void slettAlle(){
        String sql = "DELETE FROM Bilet;";
        db.update(sql);
    }


}
