package com.bhanu.meesho.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Table
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO-INCREMENT
    @Column(name = "id")
    private Integer catCode;
    @Column
    private String name;
    @Column
    private String des;

    @OneToMany(mappedBy="category")
    private List<Product> products;

    public Category(Integer catCode, String name, String des) {
        this.catCode = catCode;
        this.name = name;
        this.des = des;
    }

    public Category() {
    }

    public Integer getCatCode() {
        return catCode;
    }

    public String getName() {
        return name;
    }

    public void setCatCode(Integer catCode) {
        this.catCode = catCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((catCode == null) ? 0 : catCode.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((des == null) ? 0 : des.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Category other = (Category) obj;
        if (catCode == null) {
            if (other.catCode != null)
                return false;
        } else if (!catCode.equals(other.catCode))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (des == null) {
            if (other.des != null)
                return false;
        } else if (!des.equals(other.des))
            return false;
        return true;
    }

}
