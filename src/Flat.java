public class Flat implements PayPublicService{
    private Person[] person;
    public Flat(Person[] person){
        this.person = person;
    }
    @Override
    public void payComUsluga() {
        System.out.println("Family paying rent for Flat");
    }
    public void family(){
        System.out.println("------------FLAT---------------");
        for (Person w:person) {
            System.out.println(w);
        }
    }
}
