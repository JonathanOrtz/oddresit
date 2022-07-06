/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooddresit.model;



/**
 *
 * @author cgallen / nickw
 */

// Product class
// Represents a single product sold by the shop
// Each product has an ID, a name, a manufacturer, a price, and a current 
// quantity in stock.

// TODO you need to complete this class

public class Product {
    
    private long id;
    private String name, manufacturer, productType;
    double price;
    int qtyInStock;
    
    public Product(long idProduct, String productName, String productManufacturer, String productType, double productPrice, int productStock){
        this.id = idProduct;
        this.name = productName;
        this.manufacturer = productManufacturer;
        this.productType = productType;
        this.price = productPrice;
        this.qtyInStock = productStock;
    }
    
   
    public long getId() {
        return id;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProductType() {
        return productType;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
    
    
}
