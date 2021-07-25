public class Main {
    public static void main(String[] args) {
        //         создаем список людей и передаем их в PersonRegistry
        Address person1Address = new Address("Минск", "Беларусь");
        Person person1 = new Person("Паша","MALE", 15, person1Address);

        Address person2Address = new Address("Брест", "Беларусь");
        Person person2 = new Person("Миша", "MALE", 27, person2Address);

        Address person3Address = new Address("Минск", "Беларусь");
        Person person3 = new Person("Паша", "MALE", 34, person3Address);

        Address person4Address = new Address("Гродно", "Беларусь");
        Person person4 = new Person("Олег", "MALE", 15, person4Address);

        Address person5Address = new Address("Витебск", "Беларусь");
        Person person5 = new Person("Андрей", "MALE", 22, person5Address);

        Address person6Address = new Address("Минск", "Беларусь");
        Person person6 = new Person("Женя", "FEMALE", 18, person6Address);

        Address person7Address = new Address("Минск", "Беларусь");
        Person person7 = new Person("Миша", "MALE", 25, person7Address);

        Address person8Address = new Address("Минск", "Беларусь");
        Person person8 = new Person("Максим", "MALE", 20, person8Address);

        Address person9Address = new Address("Минск", "Беларусь");
        Person person9 = new Person("Максим", "MALE", 25, person9Address);

        PersonRegistry registry = new PersonRegistry(new Person[]{person1, person2, person3, person4, person5, person6, person7, person8, person9});
        registry.findPersonsByNameAge();
        registry.findPersonsByName("Максим");
        registry.findPersonsByAge25to27();
        registry.findPersonsByCity("Минск");


    }
}


