package pl.sda.magazinonline.finalprojectbackend.dao;

import org.springframework.data.repository.CrudRepository;
import pl.sda.magazinonline.finalprojectbackend.entity.OrderDetail;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {

}
