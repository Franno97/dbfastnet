package net.fastnet.dbfastnet.controller;

import net.fastnet.dbfastnet.entities.Claim;
import net.fastnet.dbfastnet.entities.Customer;
import net.fastnet.dbfastnet.repository.ClaimRepository;
import net.fastnet.dbfastnet.repository.CustomerRepository;
import net.fastnet.dbfastnet.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootJasperReportApplication {

    @Autowired
    private CustomerRepository repository;
    
    @Autowired
    private ClaimRepository repositoryClaim;
    
    @Autowired
    private ReportService service;
    
    

    @GetMapping("/getCustomers")
    public List<Customer> getCustomers() {

        return repository.findAll();
    }

    @GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportReport(format);
    }
    
    @GetMapping("/getClaims")
    public List<Claim> getClaims() {

        return repositoryClaim.findAll();
    }

    @GetMapping("/reportclaim/{format}")
    public String generateReportClaim(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportReportClaim(format);
    }
}