package Concrete;

import Adapters.CheckLogger;
import Entities.Customer;
import interfaces.CustomerService;


public class CustomerManager implements CustomerService {

    private CheckLogger logger;

    public CustomerManager() {

    }

    public CustomerManager(CheckLogger logger) {
        this.logger = logger;
    }

    @Override
    public void save(Customer customer) {
        System.out.println("Müşteri kaydedildi: " + customer.getFirstName());
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Müşteri güncellendi: " + customer.getFirstName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Müşteri silindi: " + customer.getFirstName());
    }

}
