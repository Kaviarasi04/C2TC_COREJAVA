package com.tns.ifet.certificatemodule.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tns.ifet.certificatemodule.entity.Certificate;
import com.tns.ifet.certificatemodule.service.CertificateService;

import java.util.List;

@RestController
@RequestMapping("/api/certificates")
public class CertificateController {

    private final CertificateService certificateService;

    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @PostMapping
    public ResponseEntity<Certificate> createCertificate(@RequestBody Certificate certificate) {
        return ResponseEntity.ok(certificateService.createCertificate(certificate));
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<Certificate>> getCertificatesByStudentId(@PathVariable Long studentId) {
        return ResponseEntity.ok(certificateService.getCertificatesByStudentId(studentId));
    }

    @GetMapping("/company/{companyName}")
    public ResponseEntity<List<Certificate>> getCertificatesByCompany(@PathVariable String companyName) {
        return ResponseEntity.ok(certificateService.getCertificatesByCompany(companyName));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Certificate> updateCertificate(@PathVariable Long id, @RequestBody Certificate certificateDetails) {
        return ResponseEntity.ok(certificateService.updateCertificate(id, certificateDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCertificate(@PathVariable Long id) {
        certificateService.deleteCertificate(id);
        return ResponseEntity.ok("Certificate deleted successfully.");
    }
}