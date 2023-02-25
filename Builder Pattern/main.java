public class main {

    public static void main(String[] args) {

        User user = UserBuilder.builder()
                        .setName("User 1")
                        .setAge(28)
                        .setDepartment("dept")
                        .build();

        System.out.println("User Details - ");
        System.out.println("Name - " + user.name);
        System.out.println("Department - " + user.department);
        System.out.println("Age - " + user.age);

    }
    
}
