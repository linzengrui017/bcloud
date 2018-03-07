package cn.zerry.bean;

/**
 * @author linzengrui
 * @Description TODO
 * @date 2018年03月07日 10:36
 */
public class User {
    private String name;
    private Integer age;

    public User(){}

    public User(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + ", age = " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
