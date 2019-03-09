package ro.ubb.dp1819.mihai.uscat.lab1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "C://Users//mihai//Desktop//test.txt";
        CoffeeService cs = new CoffeeService(fileName);
        List<Coffee> l = cs.getCoffees();
        l.forEach((c) -> System.out.println(c));
    }
}
