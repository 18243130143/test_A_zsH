package com.lening.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "lnrecord")
public class LnrecordBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rlnid;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date rlndate;
    private int rlnduration;
}
