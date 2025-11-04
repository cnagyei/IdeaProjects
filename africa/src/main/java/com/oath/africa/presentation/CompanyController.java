package com.oath.africa.presentation;

import com.oath.africa.business.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {

    private final CompanyService companyService;
    private final UserService userService;
    @Autowired CompanyDTOMapper companyDTOMapper;

    public CompanyController(CompanyService companyService, UserService userService) {
        this.companyService = companyService;
        this.userService = userService;
    }

    // GET one company
    @GetMapping("/companies/{id}")
    public Optional<Company> findById(@PathVariable Long id) {
        return companyService.findById(id);
    }

    // GET all companies
    @GetMapping("/companies")
    public List<CompanyDTO> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @PostMapping("/company")
    public Company save(@RequestBody CompanyDTO companyDTO) {
        return companyService.saveCompany(companyDTO);
    }
}
