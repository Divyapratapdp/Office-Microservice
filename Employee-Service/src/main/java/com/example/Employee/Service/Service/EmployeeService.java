package com.example.Employee.Service.Service;

import com.example.Employee.Service.Model.AddressResponse;
import com.example.Employee.Service.Model.EmployeeModel;
import com.example.Employee.Service.Model.EmployeeResponse;
import com.example.Employee.Service.Repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    WebClient webClient;
   // @Autowired
//    RestTemplate restTemplate;
//
//    @Value("${addressService.base.url}")
//    String addressBaseUrl;
//    public EmployeeService(@Value("${addressService.base.url}") String addressBaseUrl,RestTemplateBuilder builder){
//        this.restTemplate=builder
//                .rootUri(addressBaseUrl)
//                .build();
//    }
    public EmployeeResponse getEmployee(Integer id) {
        EmployeeModel employeeModel=employeeRepository.findById(id).get();
        EmployeeResponse employeeResponse=modelMapper.map(employeeModel,EmployeeResponse.class);
        AddressResponse addressResponse=webClient.get().uri("/find/"+id)
                .retrieve()
                .bodyToMono(AddressResponse.class)
                .block();
        employeeResponse.setAddressResponse(addressResponse);
        return employeeResponse;
    }
//    public AddressResponse callByRestTemplate(int id){
//        return restTemplate.getForObject("/find/{id}",AddressResponse.class,id);
//    }
}
