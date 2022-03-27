public class Cat extends Animals{

    public Cat(String name, int run, int swim ){
        super(name,run,swim);
    }




    void run () {
        if (run > 200){
            System.out.println(name + " не может бегать больше 200м");
        }else
            System.out.println(name + " пробежал " + run + "м");
    }
    void swim () {
            System.out.println(name +" не умеет плавать");

    }
}
