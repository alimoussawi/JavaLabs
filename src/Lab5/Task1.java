package Lab5;

public class Task1 {

    public static void main(String[] args) {
        Person person1=new Person("ali","moussawi",21,"male",123456);

        person1.setFirstName("person");
        person1.setLastName("my last name");
        person1.setAge(25);
        person1.setGender("female");
        person1.setPhoneNumber(654321);
        System.out.println(
                "first name :"+person1.getFirstName()+"| last name : "
                        +person1.getLastName()+"| age : "
                        +person1.getAge()+"| gender : "
                        +person1.getGender()+"| phone number : "
                        +person1.getPhoneNumber());

    }
}
