package com.healthcare.billing.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.healthcare.billing.controller.model.ProcedureRate;
import com.healthcare.billing.model.Procedure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingManagement {

    private static final String PROCEDURES_PATH = "build/resources/main/templates/procedures.json";

    private List<Procedure> procedures;
    private Map<String, Procedure> procedureMap;
    private Map<String, ProcedureRate> procedureRateMap;

    private BillingManagement() {
        initialize();
    }

    private static BillingManagement billingManagement;

    public static BillingManagement getInstance() {
        if (billingManagement == null) {
            billingManagement = new BillingManagement();
        }
        return billingManagement;
    }

    private void initialize() {
        List<Procedure> procedures = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(PROCEDURES_PATH));
            Type listType = new TypeToken<ArrayList<Procedure>>() {
            }.getType();
            procedures = new Gson().fromJson(br, listType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.procedures = procedures;
        this.procedureMap = new HashMap<>();
        this.procedureRateMap = new HashMap<>();
        for (Procedure procedure : procedures) {
            this.procedureMap.put(procedure.getId(), procedure);
            ProcedureRate pr = new ProcedureRate();
            pr.setId("random-" + System.currentTimeMillis());
            pr.setRate(100);
            pr.setProcedureId(procedure.getId());
            this.procedureRateMap.put(procedure.getId(), pr);
        }
        System.out.println(this.procedureMap);
        System.out.println(this.procedureRateMap);
    }

    public List<Procedure> getAllProcedures() {
        return this.procedures;
    }

    public Procedure getProcedure(String id) {
        return this.procedureMap.get(id);
    }

    public ProcedureRate getProcedureRate(String id) {
        return this.procedureRateMap.get(id);
    }
}
