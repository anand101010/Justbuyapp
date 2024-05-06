package Payload;

import com.justbuy.model.Product;
import com.justbuy.model.User;
import lombok.Data;

@Data
public class OrderDto {
    private long order_id;
    private float order_price ;
    private String order_address ;
    private String  order_status ;
    private Product product;
    private User user;

}
