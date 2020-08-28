package com.devc.myreceipts.service

import com.devc.myreceipts.db.ReceiptEntity
import com.devc.myreceipts.model.ReceiptResponsePayload
import com.devc.myreceipts.repository.ReceiptRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

/**
 *
 * author: acerbk
 * Date: 14/08/2020
 * Time: 19:53
 *
 *
 */
class ReceiptService {

    private lateinit var receiptRepository: ReceiptRepository

    fun createRepository(receiptEntity: ReceiptEntity): ResponseEntity<*>{
        receiptRepository.save(receiptEntity)

        val receiptResponsePayload = ReceiptResponsePayload()
        return ResponseEntity.status(HttpStatus.CREATED).body(receiptResponsePayload)
    }
}
