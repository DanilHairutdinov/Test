import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String result = calc(input);
        System.out.println(result);
    }
    public static String calc(String input) throws IOException {
        String[] parts = input.split(" ");
        if(parts.length==1 || parts.length==2){
            throw new IOException("т.к. строка не является математической операцией");
        }
        if(parts.length!=3){
            throw new IOException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор(+,-,*,/)");
        }

        int op1 = parseInt(parts[0]);
        int op2 = parseInt(parts[2]);
        if(op1>10 || op1==0 || op2>10 || op2==0){
            throw new IOException("Принимаются значения от 1 до 10");
        }
        String operator = parts[1];
        int result;

        switch(operator){
            case "+": result=op1+op2;break;
            case "-": result=op1-op2;break;
            case "*": result=op1*op2;break;
            case "/": result=op1/op2;break;
            default:
                throw new IOException("Введена неверная операция");
        }
        return String.valueOf(result);
        }
    }
