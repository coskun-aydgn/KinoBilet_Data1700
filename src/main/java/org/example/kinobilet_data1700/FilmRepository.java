package org.example.kinobilet_data1700;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmRepository {
    private JdbcTemplate db;
    public List<Film> hentFilmer(){
        String sql = "SELECT * FROM Filmer;";
        List<Film> filmList = db.query(sql, new BeanPropertyRowMapper(Film.class));
        return filmList;
    }
}
