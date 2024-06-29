package com.example.spring_h2_database.service;

import com.example.spring_h2_database.entity.Department;
import com.example.spring_h2_database.error.DepartmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartments();

   public Department fetchDepartmentById(long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentById(long departmentId);

   public Department updateDepartment(long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);

   public Department fetchDepartmentByAddress(String departmentAddress);
   public Department fetchDepartmentByCode(String departmentCode);
}

