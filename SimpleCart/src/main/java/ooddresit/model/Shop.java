/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooddresit.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nick
 */

// Class representing the shop as a whole
// Contains methods for retrieving products by name, by ID, etc.

// TODO you need to complete this class

public class Shop {
    
    String name;
    private ArrayList<Product> products = new ArrayList<Product>();
    
    public Shop(String nameIn) {
        this.name = nameIn;
        Product shoes = new Product(232, "shoesA", "adidas", "shoes", 120.00, 100);
        Product bikes = new Product(123, "mountain bike", "carrera", "bike", 400.00, 100);
        Product ball = new Product(134, "Football ball", "adidas", "ball", 120.00, 100);
        
        products.add(shoes);
        products.add(bikes);
        products.add(ball);
    }
    
    public ArrayList<Product> getList(){
        
        return products;
    }
        
  
}