package br.com.adde.multipletransactionmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StatusDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void addStatus(String status) {
        var query = "insert into status (status) values (?)";
        jdbcTemplate.update(query, pss -> pss.setString(1, status));
    }

}
