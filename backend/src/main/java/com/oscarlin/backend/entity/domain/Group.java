package com.oscarlin.backend.entity.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "group_list")
public class Group {
    @Id
    @Column(name = "id")
    private String groupId;

    @Column(name = "name")
    private String groupName;

    @Column(name = "functions")
    private String functions;

}
