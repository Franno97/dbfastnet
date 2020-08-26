package net.fastnet.dbfastnet.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.fastnet.dbfastnet.entities.Claim;
import net.fastnet.dbfastnet.entities.Customer;
import net.fastnet.dbfastnet.interfaceService.IClaimService;
import net.fastnet.dbfastnet.interfaceService.ICustomerService;

@Controller
@RequestMapping  
public class MainController {

	@Autowired
	private ICustomerService serviceCustomer;
	
	@Autowired
	private IClaimService serviceClaim;
	
	@GetMapping("/")
    public String root() {
    	return "index";
    }


    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
    
    @GetMapping("/listcustomer")
    public String listCustomer(Model model) {
    	List<Customer>customers = serviceCustomer.list();
    	model.addAttribute("customers", customers);
    	return "listcustomer";
    }
    
    @GetMapping("/listclaim")
    public String listClaim(Model model) {
    	List<Claim>claims = serviceClaim.list();
    	//List<Breakdown>breakdowns = serviceBreakdown.list();
    	model.addAttribute("claims", claims);
    	//model.addAttribute("breakdowns", breakdowns);
    	return "listclaim";
    }
    
    @GetMapping("/newcustomer")
    public String addCustomer(Model model) {
    	model.addAttribute("customer", new Customer());
    	return "formcustomer";
    }
    
    @GetMapping("/newclaim")
    public String addClaim(Model model) {
    	model.addAttribute("claim", new Claim());
    	return "formclaim";
    }
    
    @PostMapping("/savecustomer")
    public String saveCustomer(@Valid Customer c, Model model) {
    	serviceCustomer.save(c);
    	return "redirect:/listcustomer";
    }
    
    @PostMapping("/saveclaim")
    public String saveClaim(@Valid Claim c, Model model) {
    	serviceClaim.save(c);
    	return "redirect:/listclaim";
    }
    
    @GetMapping("/editcustomer/{id}")
    public String editCustomer(@PathVariable String id, Model model) {
    	Optional<Customer>customer = serviceCustomer.listId(id);
    	model.addAttribute("customer", customer);
    	return "formcustomer";
    }
    
    @GetMapping("/editclaim/{id}")
    public String editClaim(@PathVariable int id, Model model) {
    	Optional<Claim>claim = serviceClaim.listId(id);
    	model.addAttribute("claim", claim);
    	return "formclaim";
    }
    
    @GetMapping("/deletecustomer/{id}")
    public String deleteCustomer(Model model, @PathVariable String id) {
    	serviceCustomer.delete(id);
    	return "redirect:/listcustomer";
    }
    
    @GetMapping("/deleteclaim/{id}")
    public String deleteClaim(Model model, @PathVariable int id) {
    	serviceClaim.delete(id);
    	return "redirect:/listclaim";
    }
}