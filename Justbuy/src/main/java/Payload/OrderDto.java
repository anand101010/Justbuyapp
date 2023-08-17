package Payload;

import com.bezkoder.spring.datajpa.model.Product;
import com.bezkoder.spring.datajpa.model.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
public class OrderDto {
    private long order_id;
    private float order_price ;
    private String order_address ;
    private String  order_status ;
    private Product product;
    private User user;

}
