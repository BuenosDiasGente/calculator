package pro.sky.java.cours2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String answerWelcom(){
        return "<h1> Добро пожаловать в калькулятор.</h1>";
    }

    public String calculatorSum(int num1,int num2){

        return num1+" + "+ num2+ " = "+ (num1+num2);
    }
    public String calculatorSubtraction(int num1,int num2){

        return num1+" - "+ num2+ " = "+ (num1-num2);
    }
    public String calculatorMultiply(int num1,int num2){

        return num1+" * "+ num2+ " = "+ (num1*num2);
    }
    public String calculatorDivide(int num1,int num2){
        if (num2!=0){
            return num1+" / "+ num2+ " = "+ (num1/num2);
        }
        else{
            return "Делить на ноль нельзя, измените значение!";
        }
    }
}
