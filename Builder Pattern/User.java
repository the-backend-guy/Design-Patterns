public class User {
    
    String name;
    String department;
    Integer age;

    public User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.department = userBuilder.department;
        this.age = userBuilder.age;
    }

}
