package com.tns.ifet.certificatemodule.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "certificates")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String studentName;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String certificateDetails;

    @Column(nullable = false)
    private LocalDate issueDate;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    public Certificate() {}

    public Certificate(String studentName, String companyName, String certificateDetails, LocalDate issueDate, Student student) {
        this.studentName = studentName;
        this.companyName = companyName;
        this.certificateDetails = certificateDetails;
        this.issueDate = issueDate;
        this.student = student;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getCertificateDetails() { return certificateDetails; }
    public void setCertificateDetails(String certificateDetails) { this.certificateDetails = certificateDetails; }

    public LocalDate getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDate issueDate) { this.issueDate = issueDate; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}