package com.devc.myreceipts.controller

import com.devc.myreceipts.model.ReceiptPayload
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/**
 *
 * author: acerbk
 * Date: 14/08/2020
 * Time: 13:27
 *
 */
@RestController
class RootController {

    @GetMapping("/")
    fun root(): String {
        return """
            {"status":"Successful"}
        """.trimIndent()
    }

    @PostMapping("/receipt")
    fun createReceipt(@RequestBody receiptPayload: ReceiptPayload){

    }
}
