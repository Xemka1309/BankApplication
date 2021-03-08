package com.bankapp.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ResidencePlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = WRITE_ONLY)
    private long id;

    @Column(unique = true)
    private String place;
}
