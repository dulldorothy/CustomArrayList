package epam.jwd;

import epam.jwd.impl.CustomArrayListImpl;

public class Main {
    public static void main(String[] args) {
        CustomArrayList arr= new CustomArrayListImpl();
        arr.showAll();

        arr.add(22);
        arr.add(23);
        arr.add(1);
        arr.showAll();
        arr.remove(0);
        arr.showAll();
        System.out.println(arr.get(2));
    }
}
