package com.spring.boot.section6.SecondSpringBoot.Filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.spring.boot.section6.SecondSpringBoot.Employee.Employee;
import com.spring.boot.section6.SecondSpringBoot.Employee.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(description = "Contains static and dynamic filtering methods for Employees")
@RestController
public class EmployeeFiltering {

    @Autowired
    private EmployeeService service;

    @PostMapping("/employees/filter/dynamic")
    @ApiOperation(value = "filters Employees details Dynamically",
            notes = "It Dynamically selects the items to omit in response")
    public MappingJacksonValue dynamicFilter(@Valid @RequestBody Employee newEmployee) {

        Employee savedEmployee = service.save(newEmployee);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("age", "name");

        FilterProvider filters = new SimpleFilterProvider().addFilter("EmployeeFilter", filter);
        MappingJacksonValue mapping = new MappingJacksonValue(savedEmployee);
        mapping.setFilters(filters);
        return mapping;
    }

    @PostMapping("/employees/filter/static")
    @ApiOperation(value = "filters Employees details statically",
            notes = "It selects the items to omit in response which are predefined")
    public Employee createEmployee(@Valid @RequestBody Employee newEmployee) {
        Employee savedEmployee = service.save(newEmployee);
        return savedEmployee;
    }
}