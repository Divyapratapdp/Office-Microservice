package com.example.Address.Service.Model;

import lombok.Data;

@Data
public class AddressResponse {
    Integer id;
    private String lane1;
    private String lane2;
    private Integer zip;
    private String State;

}
