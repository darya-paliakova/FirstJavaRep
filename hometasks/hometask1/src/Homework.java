public class Homework {

    public static void getTask1(){
        System.out.println("Task 1.1");
        for(int i = 0; i < 5; i++){
            if(i == 0) System.out.println("One");
            else if(i == 1) System.out.println("Two");
            else if(i == 2) System.out.println("Three");
            else if(i == 3) System.out.println("Four");
            else System.out.println("Five");
        }
    }

    public static void getTask2(){
        System.out.println("\nTask 1.2");
        for(int i = 1; i <= 5; i++){
            switch (i) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                default:
                    System.out.println("Invalid number");
            }
        }
    }

    public static void getTask3(){
        System.out.println("\nTask 1.3");
        int number = 0;
        int sumEvenNumbers = 0;
        while (number <= 55){
            if(number % 2 == 0) sumEvenNumbers += number;
            number++;
        }
        System.out.println("The sum of even numbers from 0 to 55 is " + sumEvenNumbers);
    }
}
