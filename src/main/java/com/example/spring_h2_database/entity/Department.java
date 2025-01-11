package com.example.spring_h2_database.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "department_code")
    private String departmentCode;

    @Column(name = "department_address")
    private String departmentAddress;



//
//    public long getDepartmentId() {
//        return departmentId;
//    }
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "departmentId=" + departmentId +
//                ", departmentName='" + departmentName + '\'' +
//                ", departmentCode='" + departmentCode + '\'' +
//                ", departmentAddress='" + departmentAddress + '\'' +
//                '}';
//    }
//
//    public Department() {
//    }
//
//    public Department(long departmentId, String departmentName, String departmentCode, String departmentAddress) {
//        this.departmentId = departmentId;
//        this.departmentName = departmentName;
//        this.departmentCode = departmentCode;
//        this.departmentAddress = departmentAddress;
//    }
//
//    public void setDepartmentId(long departmentId) {
//        this.departmentId = departmentId;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public String getDepartmentCode() {
//        return departmentCode;
//    }
//
//    public void setDepartmentCode(String departmentCode) {
//        this.departmentCode = departmentCode;
//    }
//
//    public String getDepartmentAddress() {
//        return departmentAddress;
//    }
//
//    public void setDepartmentAddress(String departmentAddress) {
//        this.departmentAddress = departmentAddress;
//    
//    }
//
//    public void setDepartmentAddresscode() {
//
//    }


}
