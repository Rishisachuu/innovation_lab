class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void introduce(){
        System.out.println("Hello! I am "+name+". I am "+age+"years old");
    }
    public static void main(String[] args) {
        Person p=new Person("Dheekshi",18);
        p.introduce();
    }
}