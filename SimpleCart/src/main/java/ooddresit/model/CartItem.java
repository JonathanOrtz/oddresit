/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooddresit.model;


/**
 *
 * @author nick
 */

// CartItem
//
// Represents an individual item in the shopping cart.
//
// Each cart item stores the product, plus the quantity the user desires.
// 
// Note that this class is different to Product. Product is designed to store 
// information about each product in the shop, including its quantity in stock,
// but CartItem is designed to store an item WHILE IN THE CART
// (so it needs information about how many items of the product the user would 
// like)

// TODO You need to complete this class 

public class CartItem {
    
    private Product product;
    private int desiredQty;
    private long id;
    
    public CartItem(Product productItem, int desireQuantity, long id){
        this.product = productItem;
        this.desiredQty = desireQuantity;
        this.id = id;
    }
   
    public long getId() {
        return id;
    }
    
}
