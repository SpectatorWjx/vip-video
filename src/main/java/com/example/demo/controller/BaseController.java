package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wjx
 * @Date:2019/1/27
 * @Description:
 */
@Controller
@RequestMapping("")
public class BaseController {

    @RequestMapping("")
    public String index(){
        return "/video";
    }
}
