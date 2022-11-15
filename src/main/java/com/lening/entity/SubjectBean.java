package com.lening.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "subject")
public class SubjectBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer slnid;
    private String slnname;
    private Integer slnduration;
}
