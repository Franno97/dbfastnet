package net.fastnet.dbfastnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.fastnet.dbfastnet.entities.Customer;
import net.fastnet.dbfastnet.interfaceService.ICustomerService;

@Controller
@RequestMapping  //add
public class MainController {

	@Autowired
	private ICustomerService service;
	
	@GetMapping("/")
    public String listar(Model model) {
    	List<Customer>customers = service.listar();
    	model.addAttribute("customers", customers);
    	return "index";
    }
	
	//@GetMapping("/")
    //public String root() {
    //    return "index";
    //}

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
}