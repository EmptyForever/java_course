// public class Main {
//     public static void main(String[] args) {
//         Cat barsic = new Cat("barsic", "vesloyx", 3);
//         barsic.age = 3;
//         barsic.name = "barsic";
//         barsic.poroda = "vesloyx";

//         barsic.info();

//         Cat leo = new Cat("leo", 5);
//         // leo.age = 5;
//         // leo.name = "leo";
//         // leo.poroda = "siamsk";

//         leo.info();
//         System.out.println(leo);
//         leo.setAge(56);
//         System.out.println(leo.getAge());

//         // Cat loh = new Cat();

//     }
// }

import DZseminars.dz6.Cat;

public class Main {
    public static void main(String[] args) {
        Cat barsic = new Cat("barsic", "vesloyx", 3);
        // barsic.age;
        System.out.println(barsic.getName());
        // barsic.name = "barsic";
        // barsic.poroda = "vesloyx";
        barsic.info();
        barsic.setAge(4);
        barsic.info();


        Cat leo = new Cat("leo", 5);
        // leo.age = 5;
        // leo.name = "leo";
        // leo.poroda = "siamsk";

        leo.info();
        System.out.println(leo);
    }
}