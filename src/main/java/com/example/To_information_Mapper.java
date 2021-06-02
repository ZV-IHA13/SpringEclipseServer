package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
 
public class To_information_Mapper implements RowMapper<To_information> {
 
    public To_information mapRow(ResultSet rs, int rowNum) throws SQLException {
        To_information car = new To_information();
        car.setId(rs.getInt("ID"));
        car.setText(rs.getString("Text"));
        car.setReplace(rs.getBoolean("Replace"));
        car.setTo(rs.getInt("TO"));
        car.setArticule(rs.getString("Articule"));
        return car;
    }
}