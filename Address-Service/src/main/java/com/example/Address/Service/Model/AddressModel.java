package com.example.Address.Service.Model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Data
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    private String lane1;
    private String lane2;
    private Integer zip;
    private String State;

}
