package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        User minimal = new User.Builder("Андрей", "andrey@mail.com").build();
        System.out.println(minimal);

        User full = new User.Builder("Екатерина", "katya@mail.com")
                .age(30)
                .phone("+7 999 435-21-16")
                .address("г. Москва, ул. Пушкина, д. 13")
                .build();
        System.out.println(full);
    }
}
