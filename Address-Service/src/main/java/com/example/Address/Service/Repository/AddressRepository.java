package com.example.Address.Service.Repository;

import com.example.Address.Service.Model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressModel,Integer> {

    @Query(nativeQuery = true,value = "Select * from office.address where empid=:empid")
    AddressModel findByempid(@Param(value = "empid") Integer empid);
}
