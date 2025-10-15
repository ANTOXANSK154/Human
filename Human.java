public class Human {
    int id;
    String name;
    String surname;
    String department;
    double salary;
    int experience;

    Human(int id, String name, String surname, String department, double salary, int experience) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
    }

    Human(int id, String name, String surame, String department) {
        this(id, name, surame, department, 0, 0);

    }

    Human() {
        this(0, " ", " ", " ", 0, 0);
    }
}

class HumanTest {
    void printHumanInfo(Human hm) {
        System.out.println("Сотрудник: " + hm.name + " " + hm.surname + "\nОтдел: " + hm.department + "\nЗарплата: " + hm.salary + " " + "руб." + "\nСтаж" + " " + hm.experience + " " + "года");
        System.out.println();// Пишем без значений чтобы был пробел в столбцах в ответе

    }

    private double printInfo() {
        return 0;
    }

    public static void main(String[] args) {
        Human hm1 = new Human();
        hm1.id = 1;
        hm1.name = "Антон";
        hm1.surname = "Алексеев";
        hm1.department = "IT";
        hm1.salary = 150000;
        hm1.experience = 3;

        Human hm2 = new Human(2, "Марина", "Алексеева", "Методист");
        hm2.salary = 100000;
        hm2.experience = 5;

        Human hm3 = new Human(3, "Алиса", "Алексеева", "Школьник", 0, 2);

        HumanTest ht = new HumanTest();
        ht.printHumanInfo(hm1);
        ht.printHumanInfo(hm2);
        ht.printHumanInfo(hm3);

    }
}

