package com.lenoox.classifiedads;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer price;
    private String state;
    private String color;
    private String description;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date dateCreated;
    public Item() {
    }

    public Item(String name, Integer price, String state, String color, String description) {
        this.name = name;
        this.price = price;
        this.state = state;
        this.color = color;
        this.description = description;
        this.setDateCreated();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated() {
        Calendar cal = Calendar.getInstance();
        Date date=cal.getTime();
        this.dateCreated = date;
    }
}
