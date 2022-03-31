package com.blog.front.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogFrontPageController {
    @RequestMapping(value = "/front/{pageModel}",method = RequestMethod.GET)
    public String pageModel(@PathVariable(name = "pageModel") String pageModel){
        return pageModel;
    }
}
