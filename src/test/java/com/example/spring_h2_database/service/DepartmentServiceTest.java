package com.example.spring_h2_database.service;

import com.example.spring_h2_database.entity.Department;
import com.example.spring_h2_database.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp(){
        Department department =
                Department.builder()
                        .departmentName("IT")
                        .departmentAddress("Ahmedabad")
                        .departmentCode("IT-06")
                        .departmentId(1L)
                        .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))
                .thenReturn(department);
        Mockito.when(departmentRepository.findByDepartmentAddressIgnoreCase("Ahmedabad"))
                .thenReturn(department);
        Mockito.when(departmentRepository.findByDepartmentCodeIgnoreCase("IT-06"))
                .thenReturn(department);

    }


    @Test
    @DisplayName("get departmentName when valid department")
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentName = "IT";
        Department foundName = departmentService.fetchDepartmentByName(departmentName);

       assertEquals(departmentName,
               foundName.getDepartmentName());
    }

    @Test
    @DisplayName("get departmentAddress when valid department")
    public void whenValidDepartmentAddress_thenDepartmentShouldFound(){
        String departmentAddress = "Ahmedabad";
        Department foundAddress = departmentService.fetchDepartmentByAddress(departmentAddress);
        assertEquals(departmentAddress, foundAddress.getDepartmentAddress());
    }

    @Test
    @DisplayName("get departmentCode when valid department")
    public void whenValidDepartmentCode_thenDepartmentShouldFound(){
        String departmentCode = "IT-06";
        Department foundCode = departmentService.fetchDepartmentByCode(departmentCode);
        assertEquals(departmentCode, foundCode.getDepartmentCode());
    }
}