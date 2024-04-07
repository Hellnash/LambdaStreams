package lamda;

public class Lambda {
    public static void main(String[] args) {

        //use it by implementing in a class and creating its object
        FunctionInterface interfaceObject = new FunctionInterfaceImpl();
        interfaceObject.onlyOneMethod();

        //use it in an anonymous class without implementing the interface
        var inter = new FunctionInterface() {
            @Override
            public void onlyOneMethod() {
                System.out.println("This is anonymous class implementation");
            }
        };
        inter.onlyOneMethod();

        //use it by lambda expression
        FunctionInterface lambdaObject = () -> System.out.println("Implementing using lambda expression");
        lambdaObject.onlyOneMethod();

        //sum operation through lambda expression
        SumInterface sumInterface = (a, b) -> a + b;
        //The same can be performed using a static method of integer class
        SumInterface sum = Integer::sum;
                      //Class::Static Method -> function reference
        System.out.println(sumInterface.sum(2,6));
        System.out.println(sum.sum(89,423));
    }
}
