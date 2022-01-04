package com.oscarlin.backend.entity.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "function_list")
public class Function {

    @Id
    @Column(name = "id")
    private String functionId;

    @Column(name = "name")
    private String functionName;

    @Column(name = "menu_level")
    private long menuLevel;

    @Column(name = "up_level")
    private String upLevel;

    @Column(name = "sort_no")
    private String sortNo;


}
