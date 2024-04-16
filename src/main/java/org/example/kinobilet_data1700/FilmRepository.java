package org.example.kinobilet_data1700;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FilmRepository {
    @Autowired
    private JdbcTemplate db;
    public ArrayList<Film> hentFilmer(){
        String sql = "SELECT * FROM Filmer;";
        ArrayList<Film> filmList = (ArrayList<Film>) db.query(sql, new BeanPropertyRowMapper(Film.class));
        return filmList;
    }
}
