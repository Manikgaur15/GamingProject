package com.example.SportsHub.Service;

import com.example.SportsHub.Model.UserModel;
import com.example.SportsHub.Repository.UserRepository;
import com.example.SportsHub.Security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepositoryObject;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserModel userModelObject=userRepositoryObject.findByUsername(s);
        return new CustomUserDetails(userModelObject);
    }
}
