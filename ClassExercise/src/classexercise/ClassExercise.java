/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classexercise;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 *
 * @author arxid
 */
public class ClassExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Create an interactive program.
Ask a user for his/her name. All the following questions and answers should contain his/her name. Also ask for gender (M, F).
Ask for age. Based on age, the program should respond the following:
0-5 : You are too young for this app.
6-18: Oh you are a student
19-40:Well, you must be employed.

The program should provide more details about the age. For example:
If user answers 3, the program should respond: Come back in 3 years when you will be a student.
If user answers 10, the program should respond: Keep up... 8 more years left and afterwards you will make money.
If user answers 25, the program should respond: You finished school 7 years ago.

Also, the program should tell you how old you were in 1980 (if you were born) and how old you will be in 2040.

Then ask the user about his/her favorite season. You have to provide the following options and the user must choose one of them by inserting a number 1-4:
1. Winter    // Create an array
2. Spring
3. Summer
4. Autumn

Based on the answer, respond with a message:
Winter = It must be cold outside
Spring = Ohh, flowers are very beautiful these days
Summer = Let's go for swimming
Autumn = The trees are full of brown leaves

Ask user to enter his/her height and weight. Then find the BMI and print a message:
Underweight   = < 18.5
Normal weight = 18.5â€“24.9
Overweight    = 25â€“29.9
Obesity       = BMI of 30 or greater 
**BMI = kg/meters^2

Now let's find your lucky day. Transform your age to days. Add the digits of the days. If number is more than 6, use the modulo operation with number 7. Based on result find the lucky day.
0 = Monday
1 = Tuesday
...
6 = Sunday
For example 
30 years is 10950 days(1 year = 365 days)
Add digits : 1+0+9+5+0 = 15
15 is larger than 6
15%7 = 1
Lucky day is Tuesday.

The user now wants to go to a club. There is a man in the entrance of the club. Only people that their lucky day is Wednesday can enter. You must also be between 20 and 40. Can you enter? Print the message that the guy tells you at the door. If he doesn't let you pass, he will tell you the reason.
If you can enter and you are 20-25 the guy welcomes you with your name.
If you can enter, you are over 25 and male, the guy welcomes you with title Mr. 
If you are female he will ask you if you are married. If yes he welcomes you Mrs. otherwise Ms. */
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = input.nextLine();
        
        System.out.println("Are you male (M) of female (F)?");
        String gendre = input.nextLine(); // Make it char
        
        System.out.println("How old are you " + name + " ?" );
        int age = input.nextInt();
        
        System.out.println("Your name is " + name + " you are " + gendre + " and you are " + age + " years old.");
        
        int date = 2020;
        int yearBorn = 2020 - age;
        
        if (age < 5) {
            System.out.println("You are too young for this " + name);
            System.out.println("Come back in " + (6 - age) + " years when you will be a student.");
            System.out.println("In 1980 you werent even born!");
            System.out.println("In 2040 you will be " + (date + age) + " years old!");
        }else{
            if (age >= 6 && age <= 18 ) {
                System.out.println("You are a student " + name);
                System.out.println("Keep up.... " + (19 - age) + " more years left and afterwards you will make money.");
                System.out.println("In 1980 you werent even born!");
                System.out.println("In 2040 you will be " + (date + age) + " years old!");
            } else {
                if (age >= 19 && age <= 40) {
                    System.out.println("Well you must be employd " + name); 
                    System.out.println("You finished school " + (age - 18) + " years ago.");
                    System.out.println("In 1980 you werent even born!");
                    System.out.println("In 2040 you will be " + ((2040 - date) + age) + " years old!");
                }
            }
        }
        
        System.out.println();       
        
        
        String[] array = {"1. Winter" , "2. Spring", "3. Summer", "4. Autumn"};
        System.out.println(name + " what is your favorite season? (Choose a number) ");

        for (String element: array) {
            System.out.println(element);

    }
        int seasons = input.nextInt();
        if (seasons == 1) {
            System.out.println("It must be cold outside " + name);
        } else {
            if (seasons == 2) {
                System.out.println("Ohh, flowers are very beautiful these days " + name);
            } else {
                if (seasons == 3) {
                    System.out.println("Let's go for swimming " + name);
                } else {
                    System.out.println("The trees are full of brown leaves " + name);
                }
            }
        }

        System.out.println(name + " give me your height ");
        double height  = input.nextDouble();
        System.out.println(name + " now give me your weight");
        double weight = input.nextDouble();
        double BMI = weight / (height * height);
//        Math.pow(IBM,2);
        System.out.println("Your IBM is " + BMI);
        
        if (BMI < 18.5) {
            System.out.println(name + " you are underweight");  
        }else{
            if(BMI > 18.5 && BMI < 24.9 ){
               System.out.println(name + " you have normal weight");
        }else{
             if (BMI > 25 && BMI < 29.9) {
                    System.out.println(name + " you are overweight");
             }else{
                 if (BMI >= 30 ) {
                     System.out.println(name + " you are obesity "); 
                 }
              }
           }
        }
        
        int days = age * 365;
        int copyOfDays = days;
        
        int sum = 0;
        while(copyOfDays !=0){
            int lastDigit = copyOfDays % 10;
            sum = sum + lastDigit;
            copyOfDays = copyOfDays / 10;
        }
        System.out.println("Sum of all digits is " + copyOfDays + " = " + sum);
 
        if (sum > 6);{
        sum = sum % 7;
        if (sum == 0){
            System.out.println(name + " your lucky date is Monday");
        }else{
            if (sum == 1){
                System.out.println(name + " your lucky date is Tuesday");
            }else{
                if (sum == 2){
                    System.out.println(name + " your lucky date is Wednesday");
                }else{
                    if (sum == 3){
                        System.out.println(name + " your lucky date is Thursday");
                    }
                }
            }
        }
    }
 
        if (sum == 2 && age >= 25 && age < 40 && gendre.contains("M")){
            System.out.println("Mr " + name + " you can enter the club!");
        }else{
            if (sum == 2 && age >= 20 && age <= 25){
                System.out.println(name + " you can enter the club");
            }else{
                if (sum == 2 && age >= 20 && age < 40 && gendre.contains("F")){
                    System.out.println("Are you married");
                    String answer = input.nextLine();
                    if (answer.contains("yes")) {
                        System.out.println("Mrs " + name + " you can enter the club!");
                    } else {
                        System.out.println("Ms " + name + " you can enter the club!");
                    }
            }
                
        }
        }
        if (sum != 2)
        System.out.println("Its not your lucky day");
}
}
