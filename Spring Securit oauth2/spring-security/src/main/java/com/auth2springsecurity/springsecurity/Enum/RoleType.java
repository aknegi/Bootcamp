package com.auth2springsecurity.springsecurity.Enum;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RoleType {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER"),
    PREMIUM("ROLE_PREMIUM");

    String userRole;
    RoleType(String userRole) {
    this.userRole=userRole;
    }
    @JsonValue
    public String getUserRole() {
        return userRole;
    }
}
