package com.example.workadd4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

    @RequestMapping("/add")
    public  Integer add(@RequestBody AddRequest addRequest){
        
    }
}
