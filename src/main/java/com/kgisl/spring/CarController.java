package com.kgisl.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/app")
@Controller
public class CarController {

   @RequestMapping("/")
   public String show() {
      return "home";
   }

   @RequestMapping(value = "/index", method = RequestMethod.POST)
   public String car(@Validated Car c, Model model) {
      model.addAttribute("customername", c.getcustomername());
      model.addAttribute("carname", c.getcarname());
      model.addAttribute("tnNo", c.gettnno());
      model.addAttribute(("ranking"), c.getranking());
      System.out.println(c.getcarname());
      return "index";
   }

}
