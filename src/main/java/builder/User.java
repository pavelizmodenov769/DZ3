package builder;

import java.util.Objects;

public final class User {

    private final String name;
    private final String email;

    private final int age;
    private final String phone;
    private final String address;

    private User(Builder b) {
        this.name = b.name;
        this.email = b.email;
        this.age = b.age;
        this.phone = b.phone;
        this.address = b.address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "' email='" + email
                + "', age" + age
                + (phone != null ? ", phone='" + phone + "'" : "")
                + (address != null ? ", address='" + address + "'" : "")
                + "}";
    }

    public static final class Builder {
        private final String name;
        private final String email;

        private int age = 0;
        private String phone = null;
        private String address = null;

        public Builder(String name, String email) {
            this.name = Objects.requireNonNull(name, "name не может быть null");
            this.email = Objects.requireNonNull(email, "email не может быть null");
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
