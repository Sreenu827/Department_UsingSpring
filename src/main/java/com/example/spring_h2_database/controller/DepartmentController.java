package com.example.spring_h2_database.controller;

import com.example.spring_h2_database.entity.Department;
import com.example.spring_h2_database.error.DepartmentNotFoundException;
import com.example.spring_h2_database.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    private final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        logger.info("inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchAllDepartments() {

        logger.info("inside fetchAllDepartments of DepartmentController");
        return departmentService.fetchDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") long departmentId) throws DepartmentNotFoundException {
        logger.info("inside fetchDepartmentById of DepartmentController");
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        logger.info("inside deleteDepartmentById of DepartmentController");
        return "deleted Success fully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") long departmentId, @RequestBody Department department){
        logger.info("inside updateDepartment of DepartmentController");
       return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        logger.info("inside fetchDepartmentByName of DepartmentController");
        return departmentService.fetchDepartmentByName(departmentName);
    }

    @GetMapping("departments/address/{address}")
    public Department fetchDepartmentByAddress(@PathVariable("address") String departmentAddress) {
        logger.info("inside fetchDepartmentByAddress of DepartmentController");
        return departmentService.fetchDepartmentByAddress(departmentAddress);
    }

    @GetMapping("departments/code/{code}")
    public Department fetchDepartmentByCode(@PathVariable("code") String departmentCode){
        return departmentService.fetchDepartmentByCode(departmentCode);

    }
    }








