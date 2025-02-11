package com.tns.ifet.certificatemodule.service;

import java.util.List;

import com.tns.ifet.certificatemodule.entity.Certificate;

public interface CertificateService {
    Certificate createCertificate(Certificate certificate);
    List<Certificate> getCertificatesByStudentId(Long studentId);
    List<Certificate> getCertificatesByCompany(String companyName);
    Certificate updateCertificate(Long id, Certificate certificateDetails);
    void deleteCertificate(Long id);
}