package Cashflow.Cashflow;

import org.springframework.data.repository.CrudRepository;

import com.cashflow.persistence.User;

public interface UserRepository extends CrudRepository<User, Long> {

}