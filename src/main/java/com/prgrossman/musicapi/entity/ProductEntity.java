package com.prgrossman.musicapi.entity;


import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="product_id", nullable = false)
    private int productId;

    @Column(name ="model_name", nullable = false)
    private String modelName;

    @Column(name ="product_type", nullable = false)
    private String productType;

    @Column(name ="condition")
    private String condition;

    private String description;

    @Column(name ="shipping_cost")
    private double shippingCost;

    @Column(name ="list_price", nullable = false)
    private double listPrice;

    private double discount;

    @Column(name ="sale_price")
    private double salePrice;

    @Column(name ="tax_rate")
    private double taxRate;

    @Column(name = "final_price")
    private double finalPrice;

    private double weight;

    @Column(name = "country_of_origin")
    private String countryOfOrigin;

    @ManyToOne(optional = false)
    @JoinColumn(name = "brand_id", referencedColumnName = "id")
    private BrandEntity brand;

    public ProductEntity(){}

    public ProductEntity(int productId, String modelName, String productType, String condition, String description, double shippingCost, double listPrice, double discount, double salePrice, double taxRate, double finalPrice, double weight, String countryOfOrigin, BrandEntity brand) {
        this.productId = productId;
        this.modelName = modelName;
        this.productType = productType;
        this.condition = condition;
        this.description = description;
        this.shippingCost = shippingCost;
        this.listPrice = listPrice;
        this.discount = discount;
        this.salePrice = salePrice;
        this.taxRate = taxRate;
        this.finalPrice = finalPrice;
        this.weight = weight;
        this.countryOfOrigin = countryOfOrigin;
        this.brand = brand;
    }

    public ProductEntity(int productId,String modelName,String productType,double listPrice,double discount,BrandEntity brand) {
        this.productId = productId;
        this.modelName = modelName;
        this.productType = productType;
        this.listPrice = listPrice;
        this.discount = discount;
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntity brand) {
        this.brand = brand;
    }
}

