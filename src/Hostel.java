public class Hostel implements PayRent{
    private Person[] person;
    public Hostel(Person[] person){
        this.person = person;
    }
    @Override
    public void payingRent() {
        System.out.println("Family paying rend for Hostel");
    }
    public void family(){
        System.out.println("-----------HOSTEL-------------");
        for (Person q:person) {
            System.out.println(q);
        }
    }
}
