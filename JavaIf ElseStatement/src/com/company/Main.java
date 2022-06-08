package com.company;


public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;  // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +2;
        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2;  // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;     //Condition is false oludgu icin 53. ve 54. satiri atliyor.
        if (isAlien == true) {            //isAlien ve false bir Operand dir // == isareti bir operatör dür.

            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100){ //topScore ve 100 bir Operand dir. //== isareti bir operatördür.
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greate than second top score and less than 100");
        }

        if ((topScore > secondTopScore) || (topScore > 100)){
            System.out.println("Greate than second top score and less than 100");
        }

        if ((topScore>90) || (secondTopScore<=90)){
            System.out.println("Either or both of the condition are true");
        }

        //if demek bir CONDITION demektir ve biz if blogunun icinde bir condition kullanmadik.
        //Ve bu yüzden hata aliyoruz.
        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if(isCar == false) {
            System.out.println("This is not supposed to happen");
        }

        boolean isCar1 = false;
        if(isCar1) {
            System.out.println("This is not supposed to happen");
        }




    }

}