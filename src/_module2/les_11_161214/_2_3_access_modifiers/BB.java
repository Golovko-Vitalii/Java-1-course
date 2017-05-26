package _module2.les_11_161214._2_3_access_modifiers;

import _module2.les_11_161214._2_3_access_modifiers.pack.A;

public class BB extends A {
    int newField;

    void m(){
        this.value = 1;
        // protected field is accessible from outer-extend
        // outer package in descendent
    }
}
