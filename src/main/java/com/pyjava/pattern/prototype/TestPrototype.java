package pattern.prototype;

import java.util.Arrays;

/**
 * Created by wangheng on 16/7/4.
 */
public class TestPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        String [] testArr=new String[]{"22","33"};
        Person person =new Person();
        person.setName("person");
        person.setPhoneArr(testArr);


        System.out.println("person的内存地址:"+person);
        System.out.println("person的int类型的hashcode:"+person.age.hashCode());
        System.out.println("person的String类型的hashcode:"+person.name.hashCode());
        System.out.println("person的String[]的内存地址:"+person.phoneArr);

        System.out.println("-----------------------------");

        Person personCopy= (Person) person.clone();

        System.out.println("personCopy的内存地址:"+personCopy);
        System.out.println("person的int类型的hashcode:"+person.age.hashCode());
        System.out.println("personCopy的String类型的hashcode:"+personCopy.name.hashCode());
        System.out.println("personCopy的String[]的内存地址:"+"personCopy:"+personCopy.phoneArr);

        System.out.println("-----------------------------");
        System.out.println(person.getName());
        System.out.println(personCopy.getName());
        System.out.println(Arrays.toString(person.getPhoneArr()));
        System.out.println(Arrays.toString(personCopy.getPhoneArr()));

        System.out.println("-----------------------------");
        person.getPhoneArr()[1]="88";//修改数组的值,测试是否为浅拷贝

        System.out.println(person.getName());
        System.out.println(personCopy.getName());
        System.out.println(Arrays.toString(person.getPhoneArr()));
        System.out.println(Arrays.toString(personCopy.getPhoneArr()));
        System.out.println("-----------------------------");

    }


}
