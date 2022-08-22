public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }
    public String toString(){
        return name;
    }
}
