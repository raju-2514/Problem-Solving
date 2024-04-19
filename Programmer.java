package com.example.springmvc.DataController;

import jakarta.persistence.*;

@Entity
public class Programmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pId;
    @Column(name = "programmer_name")
    private String pName;
    private String plan;

    public Programmer() {
        super();
    }

    public Programmer(int pId, String pName, String plan) {
        super();
        this.pId = pId;
        this.pName = pName;
        this.plan = plan;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Programmer Data{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", plan='" + plan + '\'' +
                '}';
    }
}

