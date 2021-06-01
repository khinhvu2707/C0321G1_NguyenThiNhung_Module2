package manager.customer;

import models.Customer;

import java.util.Comparator;

public class SortName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        String[] a1 = o1.getBirthday().split("/");
        String[] a2 = o2.getBirthday().split("/");
        int rs = o1.getName().compareTo(o2.getName());
                for (int i = a1.length-1; i >0; i--) {
        if (rs == 0) {
            return a1[i].compareTo(a2[i]);
        } else {
            return rs;
        }
    }return rs;
    }
}
