package com.yogaenequilibrio.ecommerce.dto;

import java.util.List;

public class UsuarioLoginResponse {
    private String user;
    private String token;
    private List<String> roles;

    public UsuarioLoginResponse() {
    }

    public UsuarioLoginResponse(String user, List<String> roles) {
        this.user = user;
        this.roles = roles;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public List<String> getRoles() {
        return roles;
    }
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UsuarioLoginResponse [user=" + user + ", token=" + token + ", roles=" + roles + "]";
    }
}
