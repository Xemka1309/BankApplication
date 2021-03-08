package com.bankapp.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String surname;
    @Column
    private String firstName;
    @Column
    private String middleName;
    @Column
    private OffsetDateTime birthDate;
    @Column
    private Genre genre;
    @Column(unique = true)
    private String passportId;
    @Column
    private String issuedBy;
    @Column
    private OffsetDateTime issuedWhen;
    @Column(unique = true)
    private String identificationNumber;
    @Column
    private String birthPlace;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "residence_place_id")
    private ResidencePlace residencePlace;
    @Column
    private String residenceAddress;
    @Column
    private String homePhone;
    @Column
    private String mobilePhone;
    @Column
    private String email;
    @Column
    private String workPlace;
    @Column
    private String registrationAddress;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "marital_status_id")
    private MaritalStatus maritalStatus;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "citizenship_id")
    private Citizenship citizenship;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dosability_id")
    private Disability disability;
    @Column
    private boolean isRetire;
    @Column
    private BigDecimal monthlyIncome;
    @Column
    private boolean armyRequired;
}
