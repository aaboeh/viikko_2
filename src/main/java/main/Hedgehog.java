package main;

public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(String phrase) {
        System.out.println(name + ": " + phrase);
    }

    public void run(int rounds) {
        for (int i = 1; i <= rounds; i++){
            System.out.println(name + " juoksee kovaa vauhtia!");
        }
    }

    public void emptyString(){
        System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");
    }
}
