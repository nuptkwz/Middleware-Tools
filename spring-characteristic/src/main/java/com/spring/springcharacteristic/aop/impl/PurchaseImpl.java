package com.spring.springcharacteristic.aop.impl;

import com.spring.springcharacteristic.aop.Purchase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Description
 * Date 2020/5/20 22:34
 * Created by kwz
 */
@Service
@Slf4j
public class PurchaseImpl implements Purchase {

    @Override
    public String buy() {
        log.info("i want to buy something...");
        return "Book";
    }
}
