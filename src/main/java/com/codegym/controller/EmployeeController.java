package com.codegym.controller;

import com.codegym.model.Employee;
import com.codegym.model.GroupEmployee;
import com.codegym.service.EmployeeService;
import com.codegym.service.GroupEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;
    private GroupEmployeeService groupEmployeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService, GroupEmployeeService groupEmployeeService) {
        this.employeeService = employeeService;
        this.groupEmployeeService = groupEmployeeService;
    }

    @ModelAttribute("groupEmployees")
    public Iterable<GroupEmployee> listGroup(){
        return groupEmployeeService.findAll();
    }

    @GetMapping("/")
    public ModelAndView showEmployees(Pageable pageable){

        Page<Employee> employees = employeeService.findAllEmployee(pageable);
        ModelAndView modelAndView = new ModelAndView("/employee/list");
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){

        ModelAndView modelAndView = new ModelAndView("/employee/create");
        modelAndView.addObject("employee", new Employee());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        ModelAndView modelAndView = new ModelAndView("/employee/create");
        modelAndView.addObject("employee", employee);
        modelAndView.addObject("message", "Create New Employee Success!!!!");
        return modelAndView;
    }

    @GetMapping("/{id}/edit")
    public ModelAndView showEditForm(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView();
        Employee employee = employeeService.findById(id);
        if (employee == null) {
            modelAndView.setViewName("/error404");
            return modelAndView;
        }
        modelAndView.setViewName("/employee/edit");
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    @PostMapping("/{id}/edit")
    public ModelAndView editEmployee(@ModelAttribute("employee") Employee employee){

        employeeService.save(employee);
        ModelAndView modelAndView = new ModelAndView("/employee/edit");
        modelAndView.addObject("employee", employee);
        modelAndView.addObject("message", "Update Success!!!!");
        return modelAndView;
    }

    @PostMapping("/search")
    public ModelAndView searchEmployee(@RequestParam("txtSearch") String txtSearch){
        Iterable<Employee> employees = employeeService.findAllByEmployeeName(txtSearch);
        ModelAndView modelAndView = new ModelAndView("/employee/search");
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }
}
