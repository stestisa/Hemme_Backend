package com.povodev.hemme.jdbcdao;

import com.povodev.hemme.dao.DiaryDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class DiaryJdbcDao implements DiaryDao{

    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}