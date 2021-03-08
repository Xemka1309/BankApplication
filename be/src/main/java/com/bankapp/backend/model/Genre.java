package com.bankapp.backend.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Genre {
    MALE("male"),
    FEMALE("female");

    private final String value;

    public String getValue() {
        return value;
    }
}
