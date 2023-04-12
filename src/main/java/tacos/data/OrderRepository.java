package tacos.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long>{
	List<TacoOrder> findByDeliveryZip(String deliveryZip);
	
	/*
	 * @Query("Order o where o.deliveryCity = `Seatle`") List<TacoOrder>
	 * readOrdersDeliveredInSeatle();
	 */
}
