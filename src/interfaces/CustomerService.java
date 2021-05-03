package interfaces;

import Entities.Customer;
import Entities.Player;

public interface CustomerService {
    void save(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
}
