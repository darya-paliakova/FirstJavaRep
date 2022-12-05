/* Описать класс машина у которого есть поля:
 * скорость,
 * время разгона до ста,
 * время торможения
 * и константа название марки производителя.
 * Добавить конструктор для всех полей.
 * Машина должна уметь:
 * вывести в консоль свое название,
 * вывести разницу между временем разгона и торможения,
 * вывести равны ли между собой время разгона и торможения в виде true/false;
 */

public class Car {
    public static final String BRAND = "Audi";
    int speed;
    int accelerationTime;
    int decelerationTime;

    Car(int speed, int accelerationTime, int decelerationTime){
        this.speed = speed;
        this.accelerationTime = accelerationTime;
        this.decelerationTime = decelerationTime;
    }

    public void printBrand(){
        System.out.println("The car brand is " + BRAND + ".");
    }

    public void printTimeDifference(){
        System.out.println("The difference between acceleration time and deceleration time equals " +
                (accelerationTime - decelerationTime) + " km/h.");
    }

    public void printIfTimesEqual(){
        System.out.println(accelerationTime == decelerationTime);
    }
}
