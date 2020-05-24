package com.spring.springcharacteristic.controller;

import com.spring.springcharacteristic.aop.LogAnnotation;
import com.spring.springcharacteristic.aop.Purchase;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * Date 2020/5/24 0:15
 * Created by kwz
 */
@RestController("purchase")
public class PurchaseController {

    @Setter(onMethod_ = @Autowired)
    private Purchase purchase;

    @GetMapping()
    @LogAnnotation
    public String testBuy() {
        return purchase.buy();
    }
}
