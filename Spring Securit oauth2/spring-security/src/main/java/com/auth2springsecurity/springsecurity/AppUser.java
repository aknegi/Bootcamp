package com.auth2springsecurity.springsecurity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import java.util.Collection;
import java.util.List;

public class AppUser implements UserDetails {

    private String username;
    private String password;
    List<GrantAuthorityImpl> grantAuthorities;

    public AppUser(String username, String password, List<GrantAuthorityImpl> grantAuthorities) {
        this.username = username;
        this.password = password;
        this.grantAuthorities = grantAuthorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}