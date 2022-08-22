public class Hotel implements PayRent {
    private Person[] person;

    @Override
    public void payingRent() {
        System.out.println("Family paying rend for Hotel");
    }
    public Hotel(Person[] person){
        this.person = person;
    }
    public void family(){
        System.out.println("------------HOTEL--------------");
        for (Person e:person) {
            System.out.println(e);
        }
    }
}
