package org.itclass.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String image;
    private Integer gender;
    private Integer job;
    private LocalDate entryDate;
    private LocalDateTime updateTime;

}
