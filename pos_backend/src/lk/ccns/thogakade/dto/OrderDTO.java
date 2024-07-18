/*
 * @author : xCODE
 * Project : Project02
 * Date    : 7/18/2024 (Thursday)
 * Time    : 4:18 PM
 * For GDSE course of IJSE institute.
 */

package lk.ccns.thogakade.dto;

import java.time.LocalDate;

public class OrderDTO {

    private String order_id;

    private LocalDate order_date;

    private String customer_id;

    public OrderDTO() {
    }

    public OrderDTO(String order_id, LocalDate order_date, String customer_id) {
        this.setOrder_id(order_id);
        this.setOrder_date(order_date);
        this.setCustomer_id(customer_id);
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
}
