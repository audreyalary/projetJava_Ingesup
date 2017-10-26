package com.websystique.springboot.controller;
import com.websystique.springboot.model.User;
import com.websystique.springboot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;



@Controller
public class InterfaceController {
    public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

    @Autowired
    UserService userService; //Service which will do all data retrieval/manipulation work
    @RequestMapping("/index")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="From my view !") String name, Model model) {
        List<User> users = userService.findAllUsers();
        ModelAndView modell = new ModelAndView("index");
        modell.addObject("lists", users);
        logger.error(users.toString());
      //  model.addAttribute(users, users);
        return "index";
    }

}
