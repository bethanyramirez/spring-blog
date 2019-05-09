package com.codeup.blog;

import javax.persistence.*;

@Entity
@Table(name = "properties")
public class Property {

        @Id @GeneratedValue
        private long id;

        @Column(nullable = false, length = 100)
        private String address;

        @Column(nullable = false)
        private String description;

        @Column(nullable= false)
        private int bedroom_num;

        @Column
        private int bathroom_num;

        @Column
        private int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBedroom_num() {
        return bedroom_num;
    }

    public void setBedroom_num(int bedroom_num) {
        this.bedroom_num = bedroom_num;
    }

    public int getBathroom_num() {
        return bathroom_num;
    }

    public void setBathroom_num(int bathroom_num) {
        this.bathroom_num = bathroom_num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
