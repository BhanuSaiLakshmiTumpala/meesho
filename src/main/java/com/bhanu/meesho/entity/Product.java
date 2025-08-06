package com.bhanu.meesho.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import com.bhanu.meesho.entity.Category;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO-INCREMENT
    private Integer id;
    @Column
    private String name;
    @Column
    private Long price;

    @ManyToOne
    @JoinColumn(name = "catCode")
    private Category category;

    

  

    public Product() {
    }





    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
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
        Product other = (Product) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        return true;
    }





    public Product(Integer id, String name, Long price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }





    public Integer getId() {
        return id;
    }





    public void setId(Integer id) {
        this.id = id;
    }





    public String getName() {
        return name;
    }





    public void setName(String name) {
        this.name = name;
    }





    public Long getPrice() {
        return price;
    }





    public void setPrice(Long price) {
        this.price = price;
    }





    public Category getCategory() {
        return category;
    }





    public void setCategory(Category category) {
        this.category = category;
    }


    

}
