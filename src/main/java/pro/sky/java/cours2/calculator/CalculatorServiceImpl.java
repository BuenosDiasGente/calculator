package pro.sky.java.cours2.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
public class CalculatorService implements CalculatorServiceInterface {
    public String answerWelcom(){
        return "<h1> Добро пожаловать в калькулятор.</h1>";
    }

    public int calculatorSum(int num1,int num2){
        int total=num1+num2;
        return total;
    }
}
