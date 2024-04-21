package vn.edu.fit.hoquochuy_20053561_tuan6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.fit.hoquochuy_20053561_tuan6.models.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

}
