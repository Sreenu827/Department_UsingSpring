package com.example.spring_h2_database.repository;

import com.example.spring_h2_database.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentNameIgnoreCase(String departmentName);

    public Department findByDepartmentAddressIgnoreCase(String departmentAddress);
    public Department findByDepartmentCodeIgnoreCase(String departmentCode);
}
