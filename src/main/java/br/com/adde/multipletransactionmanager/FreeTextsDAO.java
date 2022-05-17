package br.com.adde.multipletransactionmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class FreeTextsDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void addText(String text) {
        var query = "insert into free_texts (free_text) values (?)";
        jdbcTemplate.update(query, pss -> pss.setString(1, text));
    }

}
