class BasedClass{
    public String name = "BasedClass.name";
    public static String staticName = "BasedClass.staticName";

    public void display(){
        System.out.println("BasedClass.display()");
    }
    public static void staticDisplay(){
        System.out.println("BasedClass.staticDisplay");
    }
}

class DerivedClass extends  BasedClass{
    public String name = "DerivedClass.name";
    public static String staticName = "DerivedClass.staticName";
    public String personalName = "DerivedClass.personalName";

    public void display(){
        System.out.println("DerivedClass.display()");
    }
    public static void staticDisplay(){
        System.out.println("DerivedClass.staticDisplay");
    }
    public void personalDisplay(){
        System.out.println("DerivedClass.personalDisplay");
    }
}

public class TypeConversion {

    public static void main(String[] args) {
        System.out.println("============= BasedClass bc = new DerivedClass(); =============");
        BasedClass bc = new DerivedClass();
        System.out.println(bc.name);            //BasedClass.name
        System.out.println(bc.staticName);      //BasedClass.staticName
        bc.display();                           //DerivedClass.display()
        bc.staticDisplay();                     //BasedClass.staticDisplay
        /* BasedClass类型的变量不能访问DerivedClass类自己多出来的属性和方法 */

        System.out.println("============= DerivedClass dc = (DerivedClass)bc; =============");
        DerivedClass dc = (DerivedClass)bc;
        System.out.println(dc.name);            //DerivedClass.name
        System.out.println(dc.staticName);      //DerivedClass.staticName
        dc.display();                           //DerivedClass.display()
        dc.staticDisplay();                     //DerivedClass.staticDisplay
        System.out.println(dc.personalName);    //DerivedClass.personalName
        dc.personalDisplay();                   //DerivedClass.personalDisplay
    }

}
