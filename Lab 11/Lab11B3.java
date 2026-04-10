// 3. The Transport interface declares a deliver () method. The abstract class Animal is the 
// super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is 
// implemented by the Camel and Donkey classes. Write a test program that initialize an 
// array of four Animal objects. If the object implements the Transport interface, the 
// deliver () method is invoked. [B] 

interface Transport {

    public void deliver();
}

abstract class Animal {

}

class Tiger extends Animal {

}

class Camel extends Animal implements Transport {

    public void deliver() {
        System.out.println("Deliver Method Call (Camel)");
    }
}

class Deer extends Animal {

}

class Donkey extends Animal implements Transport {

    public void deliver() {
        System.out.println("Deliver Method Call (Donkey)");

    }
}


public class Lab11B3 {
      public static void main(String[] args) {

        Animal obj1[] = new Animal[4]; // Usually Abstarct Class No Object No bane (Animal obj = new Animal) But Apnne
                                        // Object No array Banavi Sakiyee And Tema Tena Concrete (je Abstract Class No Hoi) SubClass j Mukvana

        obj1[0] = new Tiger();
        obj1[1] = new Camel();
        obj1[2] = new Deer();
        obj1[3] = new Donkey();

        for (int i = 0; i < 4; i++) {

            if (obj1[i] instanceof Transport) {     // instanceof : Checks if object really implements the interface Transport

               ((Transport)obj1[i]).deliver();  // We cast because the object reference is of type  Animal, which does NOT have deliver()
                // Type casting is used so we can call methods of that interface (deliver())
            }
        }

    }
}
