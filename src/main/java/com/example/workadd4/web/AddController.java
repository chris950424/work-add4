package com.example.workadd4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddController {

    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestBody AddRequest addRequest) {
        Integer num1 = addRequest.getNum1();
        Integer num2 = addRequest.getNum2();
        Integer sum = (num1 + num2);
        return String.valueOf(sum);
    }
}
