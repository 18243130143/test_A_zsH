package com.lening.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "lncoach")
public class LncoachBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clnid;
    private String clnname;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date clnbirth;
    private String clnsex;
}
