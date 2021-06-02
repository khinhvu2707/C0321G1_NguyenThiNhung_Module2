package manager.Employee;
import commons.WriteAndReadEmployee;
import models.Employee;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class ShowEmployee {
    public static void showEmployee() throws IOException {

        List<Employee> result;
        result = WriteAndReadEmployee.readEmployee();
        Map<String,String> employee =new HashMap<>();

        for (int i=1;i<result.size();i++)
        {
            employee.put(("ID00"+i),result.get(i).toString());
        }
        Set<String> set = employee.keySet();
        for (String key : set) {
            System.out.println(key + " " + employee.get(key));
        }
    }
}
