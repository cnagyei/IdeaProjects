package com.oath.africa.business;

import com.oath.africa.persistence.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyDTOMapper companyDTOMapper;

    @Autowired
    public CompanyService(CompanyRepository companyRepository, CompanyDTOMapper companyDTOMapper) {
        this.companyRepository = companyRepository;
        this.companyDTOMapper = companyDTOMapper;
    }

    public Optional<Company> findById(Long id) {
        return companyRepository.findById(id);
    }

    public Company saveCompany(CompanyDTO companyDTO) {
        Company companyToSave = companyDTOMapper.convertDTOToCompany(companyDTO);
        return companyRepository.save(companyToSave);
    }

    public List<CompanyDTO> getAllCompanies() {
        return companyRepository.findAll().stream()
                .map(CompanyDTOMapper::convertCompanyToDTO)
                .collect(Collectors.toList());
    }
}
