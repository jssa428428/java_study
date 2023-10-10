class Person {
    private int weight;
    int age;
    protected int height;
    public String name;

    public int setWeight(int weight){
        return this.weight = weight;
    }
}


class Student extends Person{
    public void set() {
        age = 30;
        height = 175;
        name = "홍길동";
    }
    public void show(){
        System.out.println("weight= "+setWeight(99));
        System.out.println("age= "+age);
        System.out.println("height= "+height);
        System.out.println("name= "+name);
    }
}

public class Inherit {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.set();
        s1.show();
    }
}
