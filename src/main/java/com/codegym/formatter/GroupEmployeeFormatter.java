package com.codegym.formatter;

import com.codegym.model.GroupEmployee;
import com.codegym.service.GroupEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class GroupEmployeeFormatter implements Formatter<GroupEmployee> {

    private GroupEmployeeService groupService;

    @Autowired
    public GroupEmployeeFormatter(GroupEmployeeService groupService) {
        this.groupService = groupService;
    }

    @Override
    public GroupEmployee parse(String text, Locale locale) throws ParseException {
        return groupService.findById(Long.parseLong(text));
    }

    @Override
    public String print(GroupEmployee object, Locale locale) {
        return null;
    }
}
