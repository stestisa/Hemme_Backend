/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.povodev.hemme.jdbcdao;

import com.povodev.hemme.bean.ClinicalEvent;
import com.povodev.hemme.dao.ClinicalFolderDao;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcDao implementation for ClinicalFolder
 * @author smunarini.stage
 */
public class ClinicalFolderJdbcDao implements ClinicalFolderDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public ArrayList<ClinicalEvent> getClinicalFolder(int user_id) {
        
        ClinicalEvent ce;
        
        
        System.err.println(this.getClass().getName() + "  Is this null?" + jdbcTemplate==null);
        return null;//jdbcTemplate.execute("insert into STUDENT (name) values (?)",user_id );
    }
    
    @Override
    public void newClinicalFolder(int user_id, int clinicalEvent_id) {
        
    }
    
}
