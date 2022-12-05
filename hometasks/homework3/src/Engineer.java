/* Описать класс Инженер у которого есть поля (характеристики):
 * имя,
 * фамилия,
 * должность,
 * зарплата.
 * Добавить конструктор для всех полей.
 * Инженер должен уметь вывести в консоль все данные о себе.
 * В отдельном Main классе в main методе создать несколько экземпляров класса и
 * вызвать методы для вывода данных инженера;
 */

public class Engineer {
    String name;
    String surname;
    String position;
    int salary;

    Engineer(String name, String surname, String position, int salary){
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public void printAllInfo() {
        System.out.println(name + " " + surname + " works as " + position + " and earns " + salary + " USD.");
    }
}
