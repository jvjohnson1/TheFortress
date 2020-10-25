package com.thefortress.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "Role")
@Table(name = "Roles")

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int roleID;

    private String userName;

    private String roleName;


}
