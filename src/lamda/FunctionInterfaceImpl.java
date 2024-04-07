package lamda;

public class FunctionInterfaceImpl implements FunctionInterface {
    @Override
    public void onlyOneMethod() {
        System.out.println("The Interface only contains this abstract method");
    }
}
