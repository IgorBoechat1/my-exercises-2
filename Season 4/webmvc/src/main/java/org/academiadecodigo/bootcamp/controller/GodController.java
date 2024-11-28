package org.academiadecodigo.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GodController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String sayHello(Model model) {

        Customer customer = new Customer();

        customer.setId(1);
        customer.setFirstName("Rui");
        customer.setLastName("Ferrão");
        customer.setEmail("rui.ferrao@academiadecodigo.org");
        customer.setPhone("916668877");

        model.addAttribute("customer", customer);

        return "index";
    }
}
