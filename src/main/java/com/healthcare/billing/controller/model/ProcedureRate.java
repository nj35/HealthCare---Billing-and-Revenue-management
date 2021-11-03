package com.healthcare.billing.controller.model;

public class ProcedureRate {

    private String id;
    private String procedureId;
    private int rate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(String procedureId) {
        this.procedureId = procedureId;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "ProcedureRate{" +
                "id='" + id + '\'' +
                ", procedureId='" + procedureId + '\'' +
                ", rate=" + rate +
                '}';
    }
}
