package com.example.ZenPay.Backend.security.user;

import com.example.ZenPay.Backend.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomUserDetails implements UserDetails {

    private final User user;

    public CustomUserDetails(User user) {
        this.user = user;
    }

    public User getAppUser() {
        return user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null; // No roles for now
    }

    @Override
    public String getPassword() {
        return user.getPassword(); // return hashed password
    }

    @Override
    public String getUsername() {
        return user.getEmail(); // we use email as username
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // you can add account expiry logic later
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
