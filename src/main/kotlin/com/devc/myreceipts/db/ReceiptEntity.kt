package com.devc.myreceipts.db

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

/**
 *
 * author: acerbk
 * Date: 14/08/2020
 * Time: 19:43
 *
 */
@Document
class ReceiptEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,

        var imageURL: String,

        var imageDescription: String
)



