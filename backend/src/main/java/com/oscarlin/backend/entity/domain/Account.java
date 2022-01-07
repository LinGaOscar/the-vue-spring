package com.oscarlin.backend.entity.domain;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Data
@Entity
@Table(name = "account_list")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String loginAccount;
    private String loginPassword;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

}
