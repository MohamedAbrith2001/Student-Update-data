package com.mysqldata.Springmysql.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name ="Student_DB")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @Column(name ="ID")
    @GeneratedValue
    private int id;
    @Column(name = "MARK")
    private int mark;
    @Column(name = "NAME")
    private String name;
}
