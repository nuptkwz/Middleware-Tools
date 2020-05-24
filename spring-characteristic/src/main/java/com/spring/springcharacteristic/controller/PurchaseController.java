package com.spring.springcharacteristic.controller;

import com.spring.springcharacteristic.aop.Purchase;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Description
 * Date 2020/5/24 0:15
 * Created by kwz
 */
@Controller
public class PurchaseController {

    @Setter(onMethod_ = @Autowired)
    private Purchase purchase;

    public String testBuy() {
        return purchase.buy();
    }
}
