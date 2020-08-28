package com.devc.myreceipts.model

import org.springframework.data.mongodb.core.mapping.Document

/**
 *
 * author: acerbk
 * Date: 14/08/2020
 * Time: 19:00
 *
 */
data class ReceiptPayload(val userID: Long, val imageURL: String, val imageDescription: String)
