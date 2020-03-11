package Calc;

import java.util.Objects;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {
    private Run run = new Run();

    @org.junit.jupiter.api.Test
    void start() {
        Scanner in = new Scanner(System.in);
        run.start("23+rty");
        String excepted = "error";
        Objects.equals(excepted, in.toString());
    }
}