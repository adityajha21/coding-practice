package design.pattern.observer.Builder;

public class User {
    private String name;
    private int age;
    private String gender; // optional

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.gender = userBuilder.gender;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    static class UserBuilder{
        private String name;
        private int age;
        private String gender;

        // create constructor  for mandatory fields
        UserBuilder(String name, int age){
            this.name = name;
            this.age = age;
        }

        // create setter method for Optional field
        UserBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}

class UserMain {
    public static void main(String[] args) {

        User u2 = new User.UserBuilder("Rashmi" , 20)
                   .setGender("Female")
                   .build();
        System.out.println(u2);

        User u3 = new User.UserBuilder("Bittu", 23).build();
        System.out.println(u3);
    }
}
