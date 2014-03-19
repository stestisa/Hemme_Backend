/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.povodev.hemme.dao;

import com.povodev.hemme.bean.ClinicalEvent;
import java.util.ArrayList;


/**
 * Public interface for ClinicalEventJdbcDao
 * @author smunarini.stage
 */
public interface ClinicalEventDao {
    
    /**
     * Retrieve a specific clinical event for a user
     * @return the clinical event
     * @param user_id
     * @param clinicalEvent_id
     */
    public ClinicalEvent getClinicalEvent(int user_id, int clinicalEvent_id);
    
    /**
     * Retrieve a list of clinical events for a user
     * @return the clinical event
     * @param user_id
     */
    public ArrayList<ClinicalEvent> getClinicalEvents(int user_id);
    
    /**
     * Create and insert a new clinical event for a given user
     * @param user_id
     */
    public void newClinicalEvent(int user_id);
}