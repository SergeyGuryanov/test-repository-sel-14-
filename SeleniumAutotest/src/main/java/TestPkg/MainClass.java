package TestPkg;

import org.junit.runner.Computer;
import org.junit.runner.JUnitCore;

public class MainClass {
    public static void main(String[] Args){
        Computer computer = new Computer();
        JUnitCore jUnitCore = new JUnitCore();
        jUnitCore.run(computer, LoginTestClass.class);
    }
}
