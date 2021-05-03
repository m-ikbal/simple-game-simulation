package Adapters;

import Entities.Customer;

public interface CheckLogger {
    boolean CheckIfRealCustomer(Customer customer);
    boolean joinControl(Customer customer);
}
