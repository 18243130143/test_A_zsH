package com.lening.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Table(name = "lntrainee")
public class LntraineeBean{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tlnid;
    private String nname;
    private String tlnsex;
    private Integer tlnage;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date tlnindate;
    private Integer  tisid;
    private Integer ticid;

    private LncoachBean lncoachBean = new LncoachBean();
    private SubjectBean subjectBean = new SubjectBean();

    public Integer getTlnid() {
        return tlnid;
    }

    public void setTlnid(Integer tlnid) {
        this.tlnid = tlnid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getTlnsex() {
        return tlnsex;
    }

    public void setTlnsex(String tlnsex) {
        this.tlnsex = tlnsex;
    }

    public Integer getTlnage() {
        return tlnage;
    }

    public void setTlnage(Integer tlnage) {
        this.tlnage = tlnage;
    }

    public Date getTlnindate() {
        return tlnindate;
    }

    public void setTlnindate(Date tlnindate) {
        this.tlnindate = tlnindate;
    }

    public Integer getTisid() {
        return tisid;
    }

    public void setTisid(Integer tisid) {
        this.tisid = tisid;
    }

    public Integer getTicid() {
        return ticid;
    }

    public void setTicid(Integer ticid) {
        this.ticid = ticid;
    }

    public LncoachBean getLncoachBean() {
        return lncoachBean;
    }

    public void setLncoachBean(LncoachBean lncoachBean) {
        this.lncoachBean = lncoachBean;
    }

    public SubjectBean getSubjectBean() {
        return subjectBean;
    }

    public void setSubjectBean(SubjectBean subjectBean) {
        this.subjectBean = subjectBean;
    }
}
