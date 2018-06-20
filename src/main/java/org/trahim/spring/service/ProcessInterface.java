package org.trahim.spring.service;


import org.springframework.security.access.annotation.Secured;

public interface ProcessInterface {
    @Secured({"ROLE_ADMIN"})
    public String getMessage();
}
