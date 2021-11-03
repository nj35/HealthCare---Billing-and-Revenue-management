package com.healthcare.billing.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.healthcare.billing.controller.model.ProcedureRate;
import com.healthcare.billing.model.Procedure;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BillingServiceImpl implements BillingService {

    @Override
    public ProcedureRate getProcedureRate(String id) {
        return BillingManagement.getInstance().getProcedureRate(id);
    }

    @Override
    public List<Procedure> getAllProcedures() {
        return BillingManagement.getInstance().getAllProcedures();
    }
}
