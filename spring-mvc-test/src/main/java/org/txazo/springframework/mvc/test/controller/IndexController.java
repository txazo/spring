package org.txazo.springframework.mvc.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Object index() {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("code", 200);
        data.put("message", null);
        data.put("data", "index");
        return data;
    }

}
