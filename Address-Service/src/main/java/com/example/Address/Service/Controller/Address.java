package com.example.Address.Service.Controller;

import com.example.Address.Service.Model.AddressResponse;
import com.example.Address.Service.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Address {
    @Autowired
    AddressService addressService;
    @GetMapping("/find/{id}")
    public AddressResponse address(@PathVariable Integer id){
        return addressService.findAddress(id);
    }
}
