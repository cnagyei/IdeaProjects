package com.oath.africa.business;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class CompanyDTOMapper {

    public static CompanyDTO convertCompanyToDTO(Company company) {
        return new CompanyDTO(company.getId(), company.getName(), company.getEmail());
    }

    public Company convertDTOToCompany(CompanyDTO companyDTO) {
        Company company = new Company(companyDTO.getName(), companyDTO.getEmail()); // Ignore id because auto-generated
        company.setAccountCreatedAt(LocalDate.now()); // Not auto so add manually
        company.setTimeCreatedAt(LocalTime.now()); // Not auto so add manually
        return company;
    }
}
