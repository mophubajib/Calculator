package org.example.Model;

public class Calculator {

    private int elementOne;
    private int elementTwo;
    private String operations;
    private int answer;
    private int id;


    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }



    public Calculator(int elementOne, int elementTwo, String operations, int id, int answer) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
        this.operations = operations;
        this.id=id;
        this.answer=answer;
    }

    public Calculator(int elementOne, int elementTwo, String operations, int id) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
        this.operations = operations;
        this.id=id;
        this.answer=answer;
    }

    public Calculator() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getElementOne() {
        return elementOne;
    }

    public void setElementOne(int elementOne) {
        this.elementOne = elementOne;
    }

    public int getElementTwo() {
        return elementTwo;
    }

    public void setElementTwo(int elementTwo) {
        this.elementTwo = elementTwo;
    }

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }
}
