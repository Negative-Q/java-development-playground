//Java Calculator Version 0.0.1


import java.util.*;



class MyCalculator{
    public static void main(String[] args){

        userInterface();

       

        
    }

    public static void userInterface(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose from the option: \n 1: Multiplication \n 2: Division \n 3: Addiction \n 4: Subraction \n 5: Exit");
        int user = scanner.nextInt();

        switch(user){
            case 1:
                calculateProduct();
                break;
            case 2:
                calculateQuotient(); 
                break;
            case 3:
                calculateSum();
                break;
            case 4 :
                calculateDifference();
                break;
            case 5:
                System.out.println("MATULOG KA NA MUKHA KA NANG SABOG YEYYY!");
                break;
                
        }
        scanner.close();
        
    }

    public static void calculateProduct(){
        Scanner scanner = new Scanner(System.in);
        boolean is_Valid = false;

        int firstInput = 0;
        int secondInput = 0;

        do{
            try {
                System.out.println("Enter a valid  first number for multiplication:");
                firstInput = scanner.nextInt();

                System.out.println("Enter a valid second number for multiplication :");
                secondInput = scanner.nextInt();
                is_Valid = true;

                

                
            } catch (InputMismatchException e) {
                System.out.println("Number ba ang word?! ULITIN MO!");
                scanner.nextLine();
            }
            
            
        }
        while (!is_Valid);

        System.out.println("The product of the two number is: " + (firstInput * secondInput));

        scanner.close();

        userInterface();

        


        

    }

    public static void calculateSum(){
        Scanner scanner = new Scanner(System.in);
        boolean is_Valid = false;

        int firstInput = 0;
        int secondInput = 0;

        do{
            try {
                System.out.println("Enter a valid  first number for addition:");
                firstInput = scanner.nextInt();

                System.out.println("Enter a valid second number for addition:");
                secondInput = scanner.nextInt();
                is_Valid = true;

                

                
            } catch (InputMismatchException e) {
                System.out.println("Number ba ang word?! ULITIN MO!");
                scanner.nextLine();
            }
            
            
        }
        while (!is_Valid);

        System.out.println("The sum of the two number is: " + (firstInput + secondInput));

        scanner.close();

        userInterface();

        
    }

    public static void calculateQuotient(){
        Scanner scanner = new Scanner(System.in);
        boolean is_Valid = false;

        int firstInput = 0;
        int secondInput = 0;

        do{
            try {
                System.out.println("Enter a valid  first number for division:");
                firstInput = scanner.nextInt();

                System.out.println("Enter a valid second number to be division:");
                secondInput = scanner.nextInt();
                is_Valid = true;

                

                
            } catch (InputMismatchException e) {
                System.out.println("Number ba ang word?! ULITIN MO!");
                scanner.nextLine();
            }
            
            
        }
        while (!is_Valid);

        System.out.println("The quotient of the two number is: " + (firstInput / secondInput));

        scanner.close();

        userInterface();

        
    }

    public static void calculateDifference(){
        Scanner scanner = new Scanner(System.in);
        boolean is_Valid = false;

        int firstInput = 0;
        int secondInput = 0;

        do{
            try {
                System.out.println("Enter a valid  first number for subtraction:");
                firstInput = scanner.nextInt();

                System.out.println("Enter a valid second number for subtraction:");
                secondInput = scanner.nextInt();
                is_Valid = true;

                

                
            } catch (InputMismatchException e) {
                System.out.println("Number ba ang word?! ULITIN MO!");
                scanner.nextLine();
            }
            
            
        }
        while (!is_Valid);

        System.out.println("The difference of the two number is: " + (firstInput - secondInput));

        scanner.close();

        userInterface();

        
    }

   

   

   


    

}

