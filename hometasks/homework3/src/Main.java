public class Main {
    public static void main(String[] args){
        Engineer firstEngineer = new Engineer("Ivan", "Ivanov", "QA", 1100);
        Engineer secondEngineer = new Engineer("Peter", "Petrov", "PM", 2200);
        Engineer thirdEngineer = new Engineer("Test", "Tester", "FE Dev", 3300);

        firstEngineer.printAllInfo();
        secondEngineer.printAllInfo();
        thirdEngineer.printAllInfo();

        Car firstCar = new Car(100, 100, 70);
        Car secondCar = new Car(120, 129, 129);
        Car thirdCar = new Car(80, 50, 70);

        firstCar.printBrand();
        firstCar.printTimeDifference();
        secondCar.printIfTimesEqual();
        thirdCar.printIfTimesEqual();
    }
}