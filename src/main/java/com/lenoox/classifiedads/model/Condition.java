package com.lenoox.classifiedads.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "item_condition")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Condition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(hidden = true)
    private int id;

    @NonNull
    private String name;

    @OneToMany(mappedBy = "condition", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonBackReference
    @ApiModelProperty(hidden = true)
    private Set<Item> items;

    public Condition() {
    }

    public Condition(String name) {
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }


}

