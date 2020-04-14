package com.titans.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.validation.constraints.Size


@Document("tweets")
data class Tweet( @Id val id:String?,@Size(max=140) val text:String) {
}