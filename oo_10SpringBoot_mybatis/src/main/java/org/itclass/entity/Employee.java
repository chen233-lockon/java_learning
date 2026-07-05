package org.itclass.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private String image;
    private Integer gender;
    private Integer job;
    private Integer salary;
    private LocalDate entryDate;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
