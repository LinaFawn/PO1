package Calc;

import java.util.Scanner;


public class Run{
        private Colc func = new Colc();

public void start(){
        Scanner in = new Scanner(System.in);
        String s = in.next();


        char [] ch = s.toCharArray();
        String str1 = "";
        String str2 = "";
        String operator = "";
        char charTmp = ' ';
        int count = 0;
        int countFirsDigit = 0;
        int countSecondDigit= 0;
        double x = 0;
        double y = 0;

        while (count < ch.length - 1){
                char c = ch[countFirsDigit];

                try {
                        if (Character.isDigit(c)) {//проверка является ли символ числом
                                String strTmp = Character.toString(c);//преобразование char в String
                                str1 = str1.concat(strTmp);//склеивание последовательности символов
                                x = Double.parseDouble(str1);//преобразование строки чисел в double
                                countFirsDigit++;//счетчик первого числа
                                count++;//общий счетчик
                                countSecondDigit++;//счетчик второго числа

                        } else {
                                countSecondDigit++;
                                count = countSecondDigit;

                                charTmp = c;//определяем оператор
                                operator = Character.toString(charTmp);

                                char c2 = ch[countSecondDigit];

                                if (Character.isDigit(c2)) {
                                        String strTmp = Character.toString(c2);
                                        str2 = str2.concat(strTmp);
                                        y = Double.parseDouble(str2);
                                }
                        }
                }
                catch (IllegalArgumentException ex) {
                        System.out.println(ex);
                }
        }

        try {
                if (operator.equals("*")) {
                        func.setRes(x);
                        System.out.println("x * y =  " + func.Mult(y));
                }
                if (operator.equals("/")) {
                        func.setRes(x);
                        System.out.println("x / y =  " + func.Division(y));
                }
                if (operator.equals("+")) {
                        func.setRes(x);
                        System.out.println("x + y =  " + func.Sum(y));
                }
                if (operator.equals("-")) {
                        func.setRes(x);
                        System.out.println("x - y =  " + func.Diff(y));
                }
        }
        catch (IllegalArgumentException ex){
                System.out.println(ex);
        }
}

        public void start(String str){
                Scanner in = new Scanner(System.in);
                String s = in.next();
                char [] ch = s.toCharArray();
                String str1 = "";
                String str2 = "";
                String operator = "";
                char charTmp = ' ';
                int count = 0;
                int countFirsDigit = 0;
                int countSecondDigit= 0;
                double x = 0;
                double y = 0;

                while (count < ch.length - 1){
                        char c = ch[countFirsDigit];

                        try {
                                if (Character.isDigit(c)) {//проверка является ли символ числом
                                        String strTmp = Character.toString(c);//преобразование char в String
                                        str1 = str1.concat(strTmp);//склеивание последовательности символов
                                        x = Double.parseDouble(str1);//преобразование строки чисел в double
                                        countFirsDigit++;//счетчик первого числа
                                        count++;//общий счетчик
                                        countSecondDigit++;//счетчик второго числа

                                } else {
                                        countSecondDigit++;
                                        count = countSecondDigit;

                                        charTmp = c;//определяем оператор
                                        operator = Character.toString(charTmp);

                                        char c2 = ch[countSecondDigit];

                                        if (Character.isDigit(c2)) {
                                                String strTmp = Character.toString(c2);
                                                str2 = str2.concat(strTmp);
                                                y = Double.parseDouble(str2);
                                        }
                                }
                        }
                        catch (IllegalArgumentException ex) {
                                System.out.println(ex);
                        }
                }

                try {
                        if (operator.equals("*")) {
                                func.setRes(x);
                                System.out.println("x * y =  " + func.Mult(y));
                        }
                        if (operator.equals("/")) {
                                func.setRes(x);
                                System.out.println("x / y =  " + func.Division(y));
                        }
                        if (operator.equals("+")) {
                                func.setRes(x);
                                System.out.println("x + y =  " + func.Sum(y));
                        }
                        if (operator.equals("-")) {
                                func.setRes(x);
                                System.out.println("x - y =  " + func.Diff(y));
                        }
                }
                catch (IllegalArgumentException ex){
                        System.out.println("error");
                }
        }
}