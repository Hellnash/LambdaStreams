package lamda;

public class Main {
    public static void main(String[] args) {

        //use it by implementing in a class and creating its object
        FuncInter interfaceObject = new FuncInterImpl();
        interfaceObject.onlyOneMethod();

        //use it in an anonymous class without implementing the interface
        var inter = new FuncInter() {
            @Override
            public void onlyOneMethod() {
                System.out.println("This is anonymous class implementation");
            }
        };
        inter.onlyOneMethod();

        //use it by lambda expression
        FuncInter lambdaObject = () -> System.out.println("Implementing using lambda expression");
        lambdaObject.onlyOneMethod();

        //sum operation through lambda expression
        SumInter sumInter = (a,b) -> a + b;
        //The same can be performed using a static method of integer class
        SumInter sum = Integer::sum;
                      //Class::Static Method -> function reference
        System.out.println(sumInter.sum(2,6));
        System.out.println(sum.sum(89,423));
    }
}
