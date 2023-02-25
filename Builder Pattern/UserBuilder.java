public class UserBuilder {

    String name;
    String department;
    Integer age;
    
    private static UserBuilder userBuilder;

    // public UserBuilder(){
    //     userBuilder = new UserBuilder();
    // }

    public static UserBuilder builder(){
        userBuilder = new UserBuilder();
        return userBuilder;
    }

    public static UserBuilder setName(String name){
        userBuilder.name = name;
        return userBuilder;
    }

    public static UserBuilder setDepartment(String department){
        userBuilder.department = department;
        return userBuilder;
    }

    public static UserBuilder setAge(Integer age){
        userBuilder.age = age;
        return userBuilder;
    }

    public static User build(){
        return new User(userBuilder);
    }

    





}
