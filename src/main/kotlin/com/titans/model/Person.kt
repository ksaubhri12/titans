package com.titans.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("person")
data class Person(

        @Id val id: Long?=null,
        @Column("name")val name:String,
        @Column("region")val region:String,
        @Column("birthday")val birthday:String

        )
