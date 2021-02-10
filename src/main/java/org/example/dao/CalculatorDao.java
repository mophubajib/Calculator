package org.example.dao;

import org.example.Model.Calculator;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CalculatorDao {

    private static int historyId;
    private List<Calculator> calculatorList = new ArrayList<>();

/*    {
        calculatorList.add(new Calculator(1, 2, "+", historyId++, 3));
        calculatorList.add(new Calculator(7, 8, "-", historyId++, -1));
        calculatorList.add(new Calculator(6, 5, "-", historyId++, 1));
        calculatorList.add(new Calculator(4, 3, "*", historyId++, 12));
        calculatorList.add(new Calculator(5, 1, "/", historyId++, 5));

    }*/

    public List<Calculator> getCalculatorList() {
        return calculatorList;
    }

    public void setCalculatorList(List<Calculator> calculatorList) {
        this.calculatorList = calculatorList;
    }

    public void show(int id) {
        calculatorList.get(id - 1);
    }

    public void solution(Calculator calculator) {

        String operation = calculator.getOperations();
        int answer = 0;
        int elOne = calculator.getElementOne();
        int elTwo = calculator.getElementTwo();
        switch (operation) {
            case "+":
                answer = elOne + elTwo;
                break;
            case "-":
                answer = elOne - elTwo;
                break;
            case "*":
                answer = elOne * elTwo;
                break;
            case "/":
                answer = elOne / elTwo;
                break;
            default:
                answer = 0;
                break;
        }

        calculatorList.add(new Calculator(
                elOne,
                elTwo,
                operation,
                historyId++,
                answer));
    }

    public String lastSolution() {

        String result="";

        try {
            result= String.valueOf(calculatorList.get(calculatorList.size() - 1).getAnswer());
        } catch (Exception ex) {
            return result;
        }

        return result;
    }
}
