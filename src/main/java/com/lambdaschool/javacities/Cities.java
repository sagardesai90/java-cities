package com.lambdaschool.javacities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Data
@Entity
public class Cities
{
    private @Id @GeneratedValue Long id;
    private String name;
    private int price;
    private int priceIndex;

    public Cities()
    {
        //default constructor
    }

    public Cities(String name, int price, int priceIndex)
    {
        this.name = name;
        this.price = price;
        this.priceIndex = priceIndex;
    }
}
