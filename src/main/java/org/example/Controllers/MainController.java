package org.example.Controllers;

import org.example.Model.Calculator;
import org.example.dao.CalculatorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    CalculatorDao calculatorDao;

    @GetMapping("/")
    public String home() {
        return "calculator/index";
    }

    @GetMapping("/calculator")
    public String calculator(@ModelAttribute ("calculator")Calculator calculator, Model model) {
        model.addAttribute("solution", calculatorDao.lastSolution());
        return "calculator/calculator";
    }

    @PostMapping("/calculator")
    public String addCalculator(@ModelAttribute("calculator") Calculator calculator, Model model, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            //return model.addAttribute("solution", "Error");
        }
        calculatorDao.solution(calculator);
        return "redirect:/calculator";
    }

/*    @GetMapping("/history")
    public String history() {
        return "calculator/history";
    }*/

    @GetMapping("/history")
    public String show (Model model) {
        model.addAttribute("listHistory", calculatorDao.getCalculatorList());
        return "calculator/history";
    }


}
