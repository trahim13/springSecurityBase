package org.trahim.spring.service;

import org.springframework.stereotype.Service;

@Service("process")
public class ProcessImpl implements ProcessInterface {
    @Override
    public String getMessage() {
        return "Secured message";
    }
}
