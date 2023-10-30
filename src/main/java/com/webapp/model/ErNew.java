package com.webapp.model;

import javax.persistence.*;
import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "er_new", schema = "refrec")
public class ErNew {

    private Integer territory;
    private String account;
    private String adress;


    @Id
    @Column(name = "territory")
    public Integer getTerritory() {
        return territory;
    }
    public void setTerritory(Integer territory) {
        this.territory = territory;
    }

    @Basic
    @Column(name = "account")
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "adress")
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErNew ernew = (ErNew) o;
        return Objects.equals(adress, ernew.adress) && Objects.equals(account, ernew.account) && Objects.equals(territory, ernew.territory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adress, account, territory);
    }
}
