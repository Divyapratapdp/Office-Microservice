package com.example.Address.Service.Service;

import com.example.Address.Service.Model.AddressModel;
import com.example.Address.Service.Model.AddressResponse;
import com.example.Address.Service.Repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    ModelMapper modelMapper;
    public AddressResponse findAddress(Integer id) {
       AddressModel addressModel=addressRepository.findByempid(id);
       AddressResponse addressResponse=modelMapper.map(addressModel,AddressResponse.class);
       return addressResponse;
    }
}
