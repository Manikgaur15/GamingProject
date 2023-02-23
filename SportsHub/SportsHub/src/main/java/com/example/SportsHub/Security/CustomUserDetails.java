package com.example.SportsHub.Security;

import com.example.SportsHub.Model.UserModel;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class CustomUserDetails implements UserDetails {
    private UserModel userModelObject;
    public CustomUserDetails(UserModel userModelObject) {
        this.userModelObject=userModelObject;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(userModelObject.getRole()));
    }

    @Override
    public String getPassword() {
        return userModelObject.getPassword();
    }

    @Override
    public String getUsername() {
        return userModelObject.getUsername();
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
