public class Demo {
    public static void main(String[] args) {
        //Задача 1
        Fraction fraction = new Fraction(4, 5);

        fraction.showFraction();
        System.out.println(fraction.addFraction(7.8));
        System.out.println(fraction.multiplyFraction(9.999));
        System.out.println(fraction.divideFraction(4.4));

        //Задача 2
        Phone phone1 = new Phone("375259098678");
        phone1.setModel("Samsung");
        phone1.setWeight(178.4);

        Phone phone2 = new Phone("375299098678", "Huawei", 190.2);

        Phone phone3 = new Phone();
        phone3.setNumber("375259092583");
        phone3.setModel("iPhone");
        phone3.setWeight(150);

        System.out.println("Номер " + phone1.getNumber() + ", модель " + phone1.getModel() + ", вес " + phone1.getWeight());
        System.out.println("Номер " + phone2.getNumber() + ", модель " + phone2.getModel() + ", вес " + phone2.getWeight());
        System.out.println("Номер " + phone3.getNumber() + ", модель " + phone3.getModel() + ", вес " + phone3.getWeight());

        phone1.receiveCall("Мария");
        phone2.receiveCall("Петр", "375291970989");
        phone3.sendMessage("375447896789", "375299007895", "375257896789", "375298978966");
        phone1.sendMessage("375291963724");

    }
}
