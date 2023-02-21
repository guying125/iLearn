package com.guying.ilearn.restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "")
@RestController
public class RestfulDemoController {
    @RequestMapping(value = "/book/1", method = RequestMethod.GET)
    public String queryById() {
        return "";
    }
}
