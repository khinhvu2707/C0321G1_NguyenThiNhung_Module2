package manager.customer;

import commons.WriteAndReadCustomer;
import models.Customer;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ShowCustomer {

    public static void showInformationCustomers() throws IOException {
        List<Customer> result;
        result = WriteAndReadCustomer.readCustomer();
        SortName sortName = new SortName();
        Collections.sort(result,sortName);
        for (Customer customer : result)
        {
            System.out.println(customer.showInfor());
        }
    }
}
//SortName sortName = new SortName();
//        Collections.sort(result,sortName);