package com.qoobico.remindme.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "taxi")
public class taxi {

    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;

    @Column(name = "taxiname", nullable = false, length = 50)
    private String title;

    @Column(name = "rubkm", nullable = true)
    private int rubkm;

    @Column(name = "rubin", nullable = true)
    private int rubin;

    @Column(name = "phone", nullable = false, length = 50)
    private String phone;



    public taxi() {
    }

    public long getId() {
        return id;
    }

  /*  public void setId(long id) {
        this.id = id;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaxiPhone() {
        return phone;
    }

}
