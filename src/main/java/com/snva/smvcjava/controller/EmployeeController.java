package com.snva.smvcjava.controller;

import com.snva.smvcjava.controller.command.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@Controller
@RequestMapping("/employees")
public class EmployeeController {


    static List<Employee> employees = new ArrayList<>();

    @RequestMapping(path = "/addemployee", method = RequestMethod.GET)
    public ModelAndView employee(ModelMap modelMap){
        return new ModelAndView("employee","command",new Employee());
    }

    @RequestMapping(path = "/addemployee", method = RequestMethod.POST)
    public ModelAndView employeeAdd(@ModelAttribute Employee employee,
                                    ModelMap modelMap){
        employees.add(employee);
        // We will make cour service calls --> dao -->> db
        modelMap.put("employees",employees);
        return  new ModelAndView("employee","command",new Employee());
    }

//    static  List<String> empNames = new ArrayList<>();
//    @RequestMapping(value = "/processForm")
//    public ModelAndView showDashobard(@RequestParam("empName") String empName, Model model ) {
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");
//        empNames.add(empName);
//        model.addAttribute("empNames", empNames);
//        return modelAndView;
//    }


}
