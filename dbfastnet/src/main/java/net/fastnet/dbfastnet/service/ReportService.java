package net.fastnet.dbfastnet.service;


import net.fastnet.dbfastnet.entities.Claim;
import net.fastnet.dbfastnet.entities.Customer;
import net.fastnet.dbfastnet.repository.ClaimRepository;
import net.fastnet.dbfastnet.repository.CustomerRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    @Autowired
    private CustomerRepository repository;
    
    @Autowired
    private ClaimRepository repositoryClaim;
    


    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
        String path = "C:\\Users\\SYSTEMarket\\Desktop";
        List<Customer>customers = repository.findAll();
        //load file and compile it
        File file = ResourceUtils.getFile("classpath:customers.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(customers);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Data Trouble");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, "C:\\Users\\SYSTEMarket\\git\\dbfastnet\\dbfastnet\\src\\main\\resources\\customers.html");
        }
        
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\customers.pdf");
        }
        
        
        
        return "report generated in path : " + path;
    }
    
    
    
    public String exportReportClaim(String reportFormat) throws FileNotFoundException, JRException {
    	String path = "C:\\Users\\SYSTEMarket\\Desktop";
        List<Claim>claims = repositoryClaim.findAll();
        //load file and compile it
        File file = ResourceUtils.getFile("classpath:claims.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(claims);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Data Trouble");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        
        
        
        if (reportFormat.equalsIgnoreCase("html")) {
            JasperExportManager.exportReportToHtmlFile(jasperPrint, "C:\\Users\\SYSTEMarket\\git\\dbfastnet\\dbfastnet\\src\\main\\resources\\claims.html");
        
        }
        
        if (reportFormat.equalsIgnoreCase("pdf")) {
            JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\claims.pdf");
        }
        
        return "report generated in path: " + path;
    }
}