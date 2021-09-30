package com.example.demo.restservice.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="material")
public class MaterialEntity {
    @Id
    private Integer material_code;
    private String merchandise_name;
    private String manufacture_number;
    private Integer quantity;
    private Integer unit_number;
    private String unit_name;
    private float price;
    private Integer total;
    private String delivery_date;
    private String used_date;
    private Integer attached_count;
    private String remake;
    private String stickynote;

    // public Integer getMaterialCode() {
    //     return material_code;
    // }
    // public String getMerchandiseName() {
    //     return merchandise_name;
    // }
    // public String getManufactureNumber() {
    //     return manufacture_number;
    // }
    // public Integer getQuantity() {
    //     return quantity;
    // }
    // public Integer getUnitNumber() {
    //     return unit_number;
    // }
    // public String getUnitName() {
    //     return unit_name;
    // }
    // public float getPrice() {
    //     return price;
    // }
    // public Integer getTotal() {
    //     return total;
    // }
    // public Date getDeliveryDate() {
    //     return delivery_date;
    // }
    // public Date getUsedDate() {
    //     return used_date;
    // }
    // public Integer getAttachedCount() {
    //     return attached_count;
    // }
    // public String getRemake() {
    //     return remake;
    // }
    // public String getStickynote() {
    //     return stickynote;
    // }
}
