package org.example.exception;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employe> {

    public int compare(Employe e1, Employe e2) {
        return e1.getSalary() - e2.getSalary();
    }

}
