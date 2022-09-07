package com.juanma.kikeana.controller;

import com.juanma.kikeana.entity.Employee;
import com.juanma.kikeana.entity.Enterprise;
import com.juanma.kikeana.entity.Profile;
import com.juanma.kikeana.entity.Transaction;
import com.juanma.kikeana.enums.Enum_RolName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class Rest {

    @GetMapping("/profile")
    public String generarProfile(){
        Profile miProfile = new Profile("159", "image.jpg", "3015874962", new Employee(), new Date(), new Date());
        return miProfile.toString();
    }

    @GetMapping("/employee")
    public String generarEmployee(){
        Employee miEmployee = new Employee(789L, "ingjuanmasuarez@gmail.com", new Profile(), Enum_RolName.Admin, new Enterprise(), new ArrayList<Transaction>(), new Date(), new Date());
        return miEmployee.toString();
    }

    @GetMapping("/transaction")
    public String generarTransaction(){
        Transaction miTransaction = new Transaction(456L, "Pago de nomina", 5000000, new Employee(), new Enterprise(), new Date(), new Date());
        return miTransaction.toString();
    }

    @GetMapping("/enterprise")
    public String generarEnterprise(){
        Enterprise miEmpresa = new Enterprise(123L, "Kikeana", "01500123", "3001234567", "Calle Falsa No 123", new ArrayList<Employee>(), new ArrayList<Transaction>(), new Date(), new Date());
        return miEmpresa.toString();
    }

}