package com.strategival.controller;

import com.strategival.model.FirstModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/")
public class FirstController {

    @GetMapping
    public String helloStrategival() {
        log.info("++++Test log1++++++++");
        FirstModel model = new FirstModel("name1");

        return "Hello this is strategival!!!" + model.getName();
    }
}
