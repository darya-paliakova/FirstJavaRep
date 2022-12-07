/* Создать класс Солнце:
* метод рассвет;
* счетчик рассветов;
* метод для вывода информации сколько раз Солнце вставало.
 */

public class Sun {
    public static int counter = 0;

    public static void countDawns() {
        counter += 1;
    }

    public static void printCounter(){
        System.out.println("The Sun has risen " + counter + " time(s).");
    }
}
