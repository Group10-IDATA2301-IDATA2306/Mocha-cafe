package no.ntnu.mocha.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import no.ntnu.mocha.domain.entities.Role;


/**
 * Contains authentication information, needed by UserDetailService.
 */
public class AccessUserDetails implements UserDetails {
    
    private final String username;
    private final String password;
    private Set<GrantedAuthority> authorities = new HashSet<>();

    public AccessUserDetails(String username, String password, Set<Role> authorities) {
        this.username = username;
        this.password = password;
        this.convertRoles(authorities);
    }

    private void convertRoles(Set<Role> roles) {
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
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
