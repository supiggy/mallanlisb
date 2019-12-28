package net.suncaper.mallanli.controller;

import net.suncaper.mallanli.common.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class TestController {
    @GetMapping("/")
    public Object testHello(){
        return Result.fail(120);
    }
}
