package Binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Binding {
    public static void main(String[] args) {
        IntegerProperty a = new SimpleIntegerProperty(10);
        IntegerProperty b = new SimpleIntegerProperty();
     
        System.out.println(b.getValue());
        b.bind(a.add(3));
        System.out.println(b.getValue());
        a.setValue(12);
        System.out.println(b.getValue());
        a.setValue(10);
        System.out.println(b.getValue());
    }
}
