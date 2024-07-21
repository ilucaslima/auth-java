package com.stock.stock.privates;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivatesController {

    @GetMapping
    public String getMessage(){
        return "Controller";
    }
}
