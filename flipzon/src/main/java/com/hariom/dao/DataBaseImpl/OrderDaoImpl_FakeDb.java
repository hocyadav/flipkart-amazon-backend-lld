package com.hariom.dao.DataBaseImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.hariom.dao.OrderDao;
import com.hariom.entity.Order;
import com.hariom.entity.Quantity;
import com.hariom.util.DateTimeUtil;
import com.hariom.util.PaymentMode;

@Repository
@Qualifier("fakeDb")
public class OrderDaoImpl_FakeDb implements OrderDao {
	private static Map<Integer, Order> orders;
	
	static {									//add some dummy data
		orders = new HashMap<Integer, Order>(){
			{
				List<Quantity> list = new LinkedList();
				list.add(new Quantity(1, 2));
				list.add(new Quantity(2, 4));
				
				put(1, new Order(1, 1, list, PaymentMode.CASH_ON_DELIVERY.name(), 
								DateTimeUtil.orderDateTime(), 
								DateTimeUtil.deliveryDateTime(), 100));
				
				put(2, new Order(2, 1, list, PaymentMode.UPI.name(), 
								DateTimeUtil.orderDateTime(), 
								DateTimeUtil.deliveryDateTime(), 300));
				
				put(3, new Order(3, 2, list, PaymentMode.CREDIT_CARD.name(), 
								DateTimeUtil.orderDateTime(), 
								DateTimeUtil.deliveryDateTime(), 1400));
				
				put(4, new Order(4, 3, list, PaymentMode.NET_BANKING.name(), 
								DateTimeUtil.orderDateTime(), 
								DateTimeUtil.deliveryDateTime(), 999));
			}
		};
	}
	
	
	public Collection<Order> getAllOrders(){
		return orders.values();
	}
	
	public Order getOrderById(int id) {
		return orders.get(id);
	}
	
	//new order
	//1. add in user-order db
	//2. add in order db
	//3. Iterate over item and decrement item count in quantity db
	//TODO : String uniqueID = UUID.randomUUID().toString();
	public void insertOrder(Order order) {
		String orderDate = DateTimeUtil.orderDateTime();
		order.setOrderDate(orderDate);
		
		String deliveryDate = DateTimeUtil.deliveryDateTime();
		order.setDeliveryDate(deliveryDate);
		
		order.setTotalPrice(1999);
		orders.put(order.getOrderId(), order);
	}
	
	//remove data : future use
    public void removeOrderById(int id) {
        orders.remove(id);
    }
    
    //update old data
    public void updateOrder(Order order){
    	Order it = orders.get(order.getOrderId());
    	//TODO : future implementation when user want to modify order 
    }
	
}
