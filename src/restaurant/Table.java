package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Table {
    public List<Integer> customersId = new ArrayList<Integer>();

    public void addCustomers(ArrayList<Integer> customersId){
        customersId.addAll(customersId);
    }
    public void addCustomer(Integer customerId){
        customersId.add(customerId);
    }
}
