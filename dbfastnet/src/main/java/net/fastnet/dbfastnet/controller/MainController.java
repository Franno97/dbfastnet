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

import net.fastnet.dbfastnet.entities.Breakdown;
import net.fastnet.dbfastnet.entities.Claim;
import net.fastnet.dbfastnet.entities.Customer;
import net.fastnet.dbfastnet.interfaceService.IBreakdownService;
import net.fastnet.dbfastnet.interfaceService.IClaimService;
import net.fastnet.dbfastnet.interfaceService.ICustomerService;

@Controller
@RequestMapping  
public class MainController {

	@Autowired
	private ICustomerService serviceCustomer;
	
	@Autowired
	private IBreakdownService serviceBreakdown;
	
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
    
    @GetMapping("/listCustomers")
    public String listCustomer(Model model) {
    	List<Customer>customers = serviceCustomer.list();
    	model.addAttribute("customers", customers);
    	return "listCustomer";
    }
    
    @GetMapping("/listBreakdowns")
    public String listBreakdown(Model model) {
    	List<Breakdown>breakdowns = serviceBreakdown.list();
    	model.addAttribute("breakdowns", breakdowns);
    	return "listBreakdown";
    }
    
    @GetMapping("/listClaims")
    public String listClaim(Model model) {
    	List<Claim>claims = serviceClaim.list();
    	model.addAttribute("claims", claims);
    	return "listClaim";
    }
    
    @GetMapping("/newCustomer")
    public String addCustomer(Model model) {
    	model.addAttribute("customer", new Customer());
    	return "formCustomer";
    }
    
    @GetMapping("/newBreakdown")
    public String addBreakdown(Model model) {
    	model.addAttribute("breakdown", new Breakdown());
    	return "formBreakdown";
    }
    @GetMapping("/newClaim")
    public String addClaim(Model model) {
    	model.addAttribute("claim", new Claim());
    	return "formClaim";
    }
    
    @PostMapping("/saveCustomer")
    public String saveCustomer(@Valid Customer c, Model model) {
    	serviceCustomer.save(c);
    	return "redirect:/listCustomers";
    }
    
    @PostMapping("/saveBreakdown")
    public String saveBreakdown(@Valid Breakdown c, Model model) {
    	serviceBreakdown.save(c);
    	return "redirect:/listBreakdowns";
    }
    
    @PostMapping("/saveClaim")
    public String saveClaim(@Valid Claim c, Model model) {
    	serviceClaim.save(c);
    	return "redirect:/listClaims";
    }
    
    @GetMapping("/editCustomer/{id}")
    public String editCustomer(@PathVariable int id, Model model) {
    	Optional<Customer>customer = serviceCustomer.listId(id);
    	model.addAttribute("customer", customer);
    	return "formCustomer";
    }
    
    @GetMapping("/editBreakdown/{id}")
    public String editBreakdown(@PathVariable int id, Model model) {
    	Optional<Breakdown>breakdown = serviceBreakdown.listId(id);
    	model.addAttribute("breakdown", breakdown);
    	return "formBreakdown";
    }
    
    @GetMapping("/editClaim/{id}")
    public String editClaim(@PathVariable int id, Model model) {
    	Optional<Claim>claim = serviceClaim.listId(id);
    	model.addAttribute("claim", claim);
    	return "formClaim";
    }
    
    @GetMapping("/deleteCustomer/{id}")
    public String deleteCustomer(Model model, @PathVariable int id) {
    	serviceCustomer.delete(id);
    	return "redirect:/listCustomer";
    }
    
    @GetMapping("/deleteBreakdown/{id}")
    public String deleteBreakdown(Model model, @PathVariable int id) {
    	serviceBreakdown.delete(id);
    	return "redirect:/listBreakdown";
    }
    
    @GetMapping("/deleteClaim/{id}")
    public String deleteClaim(Model model, @PathVariable int id) {
    	serviceClaim.delete(id);
    	return "redirect:/listClaim";
    }
}