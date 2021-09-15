package com.springbootapi.kt_spring_boot_api.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
}
