package org.example.config.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class EmployeeService {
    private JdbcTemplate jdbcTemplate;

    public EmployeeService(DataSource dataSource){
        jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
    }

    public List<String> listAllEmails(){
        return jdbcTemplate.queryForList("select email from employee",
                String.class);
    }
}
