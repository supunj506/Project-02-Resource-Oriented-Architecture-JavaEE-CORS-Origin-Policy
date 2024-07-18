/*
 * @author : xCODE
 * Project : Project02
 * Date    : 7/18/2024 (Thursday)
 * Time    : 4:21 PM
 * For GDSE course of IJSE institute.
 */

package lk.ccns.thogakade.dto;

public class OrderDetailDTO {
    private String order_id;
    private String item_code;

    private int item_qty;

    private double item_price;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(String order_id, String item_code, int item_qty, double item_price) {
        this.setOrder_id(order_id);
        this.setItem_code(item_code);
        this.setItem_qty(item_qty);
        this.setItem_price(item_price);
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public int getItem_qty() {
        return item_qty;
    }

    public void setItem_qty(int item_qty) {
        this.item_qty = item_qty;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }
}
