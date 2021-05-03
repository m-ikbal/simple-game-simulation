package Adapters;

import Adapters.CheckLogger;
import Entities.Customer;

public class EDevletCheckLogger implements CheckLogger {

    @Override
    public boolean CheckIfRealCustomer(Customer customer) {
        return true;
    }

    @Override
    public boolean joinControl(Customer customer) {
        System.out.println("Müşteri bilgileri doğru giriş yapıldı.");
        return true;
    }
}
