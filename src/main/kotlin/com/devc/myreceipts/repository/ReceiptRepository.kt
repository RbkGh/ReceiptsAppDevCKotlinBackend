package com.devc.myreceipts.repository

import com.devc.myreceipts.db.ReceiptEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 *
 * author: acerbk
 * Date: 14/08/2020
 * Time: 19:55
 *
 */
@Repository
interface ReceiptRepository : CrudRepository<ReceiptEntity, Long> {
}
