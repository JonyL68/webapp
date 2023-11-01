package com.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "er_new", schema = "refrec")

public class ErNew {
    @Id
    private String account;

    private String adress;

    private int territory;



// геттеры и сеттеры
    public String getAccount() {
    return account;
}

    public void setAccount(String account) {
        this.account = account;
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getTerritory() {
        return territory;
    }

    public void setTerritory(int territory) {
        this.territory = territory;
    }
}
