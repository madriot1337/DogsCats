

public class Dog extends Animals{

    public Dog(String name, int run, int swim){
        super(name, run, swim);
    }


    void run () {
        if (run > 200){
            System.out.println(name + " не может бегать больше 500м");
        }else
            System.out.println(name + " пробежала " + run + "м");
    }
    void swim () {
        if (swim > 10) {
            System.out.println(name + " не может проплыть больше 10м");
        }else
            System.out.println(name + " проплыл/a " + swim + "м");

    }
}
