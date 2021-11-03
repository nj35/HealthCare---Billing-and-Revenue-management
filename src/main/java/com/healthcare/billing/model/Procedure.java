package com.healthcare.billing.model;

public class Procedure {

    private String id;
    private String codingType;
    private Diagnosis diagnosis;
    private String code;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodingType() {
        return codingType;
    }

    public void setCodingType(String codingType) {
        this.codingType = codingType;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "id='" + id + '\'' +
                ", codingType='" + codingType + '\'' +
                ", diagnosis=" + diagnosis +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
