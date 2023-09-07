package net.yorksolutions.storespringboot.Entity;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy  = GenerationType.SEQUENCE)
    private Long id;


//    @ManyToMany
//  each order can have multiple products,and each product can appear on many orders
//     product;

//    private long id;
//    private String product_name;
//    private String display_name;
//    private double price;
//    private double salePercent;
//    private boolean onSale;
//    private double currentPrice;
//
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Id
//    public Long getId() {
//        return id;
//    }
}
