package Abstract;
 
abstract class Animal {
     void bried();
     void sound();
     void action();

   
}
 
public class abstract_trial{
    public static void main(String[] args) {
        Animal dog= new Animal(){ /// Anonymous class
            void bried(){
                System.out.println("---bull dog----");
            }
            void sound(){
                System.out.println("....bhou....");
            }
            void action(){
                System.out.println("---jump---");
            }
        };
        dog.bried();
        dog.sound();
        dog.action();
        
    }
}
 
 