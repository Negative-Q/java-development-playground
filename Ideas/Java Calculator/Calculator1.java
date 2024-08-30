//Java Calculator Version 1.0.1
//Minor changes and bug fix 1.0.1
//Made by Christian Kenneth Gonzales with the help of my classmates
//Date where the idea starts: 08/30/24

//Try to rename the java class from Calculator1.java to Calculator.java if you want to run into your IDE.

import java.util.*;



public class Calculator{
    public static void main(String[] args){
        
        try (Scanner scanner = new Scanner(System.in)) {
            userInterface(scanner);

        }

    }

    public static void userInterface(Scanner scanner){
        
        boolean is_Valid = false;
        
        int firstInput;
        int secondInput;



        do{
            try{
                
                System.out.println("Enter a first value");
                firstInput = scanner.nextInt();
    
                System.out.println("Enter a second value");
                secondInput = scanner.nextInt();


                System.out.println("Choose from the option:\n 0: Exit \n 1: Multiplication \n 2: Division \n 3: Addiction \n 4: Subraction");
                int user = scanner.nextInt();
                
                switch(user){
                    case 0 -> {
                        System.out.println("Thank you for using my program");
                        is_Valid = true;
                    }

                    case 1 -> {
                        System.out.println(calculateProduct(firstInput, secondInput));
                        scanner.nextLine();
                    }

                    case 2 -> {
                        System.out.println(calculateQuotient(firstInput, secondInput));
                        scanner.nextLine();
                    }

                    case 3 -> {
                        System.out.println(calculateSum(firstInput, secondInput));
                        scanner.nextLine();
                    }

                    case 4 -> {
                        System.out.println(calculateSubtraction(firstInput, secondInput));
                        scanner.nextLine();
                    }
                }


            }
            catch(InputMismatchException e){
                System.out.println("Invalid input!");
                scanner.nextLine();

            }

        }
        while(!is_Valid);

        
    }

    public static int calculateProduct(int firstNum, int secondNum){
        return firstNum * secondNum;


        

    }

    public static int calculateSum(int firstNum, int secondNum){
        return firstNum + secondNum;


        
    }

    public static int calculateQuotient(int firstNum, int secondNum){
        return firstNum / secondNum;


        
    }

    public static int calculateSubtraction(int firstNum, int secondNum){
        return firstNum - secondNum;

        
    }

   

   

   


    

}

