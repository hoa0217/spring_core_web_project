package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(10);
        helloLombok.setName("name");
        int age = helloLombok.getAge();
        System.out.println("age = "+age);
        System.out.println(helloLombok);

    }
}
