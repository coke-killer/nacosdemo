package com.example.demo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: yudongyue
 * @date: Created in 2021/6/3 19:16
 */
@Controller
@RequestMapping("config")
public class ConfigController {
    @NacosValue(value = "${userLocalCache:false}", autoRefreshed = true)
    private boolean userLocalCache;

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public boolean get() {
        return userLocalCache;
    }

}
