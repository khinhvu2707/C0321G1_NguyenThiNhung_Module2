package manager.customer;

import models.Customer;

import java.util.Comparator;

public class SortName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getName().compareTo(o2.getName());
    }
//    rs = o1.getName().compareTo(o2.getName()
//    if (rs == 0) {
//     return  o1.getBirthday().compareTo(o2.getBirthday());
//    } else {
//     return rs;
//    }
}
