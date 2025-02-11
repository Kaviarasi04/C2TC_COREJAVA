package com.tns.ifet.certificatemodule.service;

import org.springframework.stereotype.Service;

import com.tns.ifet.certificatemodule.entity.Certificate;
import com.tns.ifet.certificatemodule.repository.CertificateRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateServiceImpl implements CertificateService {

    private final CertificateRepository certificateRepository;

    public CertificateServiceImpl(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    @Override
    public Certificate createCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Override
    public List<Certificate> getCertificatesByStudentId(Long studentId) {
        return certificateRepository.findByStudentId(studentId);
    }

    @Override
    public List<Certificate> getCertificatesByCompany(String companyName) {
        return certificateRepository.findByCompanyName(companyName);
    }

    @Override
    public Certificate updateCertificate(Long id, Certificate certificateDetails) {
        Optional<Certificate> existingCertificate = certificateRepository.findById(id);
        if (existingCertificate.isPresent()) {
            Certificate certificate = existingCertificate.get();
            certificate.setStudentName(certificateDetails.getStudentName());
            certificate.setCompanyName(certificateDetails.getCompanyName());
            certificate.setCertificateDetails(certificateDetails.getCertificateDetails());
            certificate.setIssueDate(certificateDetails.getIssueDate());
            return certificateRepository.save(certificate);
        } else {
            throw new RuntimeException("Certificate not found with ID: " + id);
        }
    }

    @Override
    public void deleteCertificate(Long id) {
        if (certificateRepository.existsById(id)) {
            certificateRepository.deleteById(id);
        } else {
            throw new RuntimeException("Certificate not found with ID: " + id);
        }
    }
}