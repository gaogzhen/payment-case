package com.gaogzhen.paymentdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaogzhen
 * @since 2024/2/28 10:31
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping()
    public String test01() {
        return "test01";
    }
}
