public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Eldiar");
        Person person2 = new Person("Toha");
        Person person3 = new Person("Elman");
        Person person4 = new Person("Mirbek");
        Person person5 = new Person("Beka");
        Person person6 = new Person("Nurba");
        Person person7 = new Person("Muhamed");
        Person person8 = new Person("Argen");
        Person person9 = new Person("Bokmurun");

        Person[] people1 ={person1,person2,person3};
        Person[] people2 ={person4,person5,person6};
        Person[] people3 ={person7,person8,person9};

        Flat flat = new Flat(people3);
        Hotel hotel = new Hotel(people1);
        Hostel hostel = new Hostel(people2);

        flat.family();
        flat.payComUsluga();
        hotel.family();
        hotel.payingRent();
        hostel.family();
        hostel.payingRent();

    }
}