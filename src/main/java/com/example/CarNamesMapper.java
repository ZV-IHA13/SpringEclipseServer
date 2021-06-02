package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CarNamesMapper implements RowMapper<CarNames> {
 
    public CarNames mapRow(ResultSet rs, int rowNum) throws SQLException {
        CarNames a = new CarNames();
        a.setCarNames(rs.getString("table_name"));
        return a;
    }
}


