/*
 * @author : xCODE
 * Project : Project02
 * Date    : 7/18/2024 (Thursday)
 * Time    : 4:15 PM
 * For GDSE course of IJSE institute.
 */

package lk.ccns.thogakade.dto;

public class ItemDTO {
    private String item_code;
    private String item_description;
    private double item_price;
    private int item_qty;

    public ItemDTO() {
    }

    public ItemDTO(String item_code, double item_price, int item_qty) {
        this.item_code = item_code;
        this.item_price = item_price;
        this.item_qty = item_qty;
    }

    public ItemDTO(String item_code, String item_description, double item_price, int item_qty) {
        this.setItem_code(item_code);
        this.setItem_description(item_description);
        this.setItem_price(item_price);
        this.setItem_qty(item_qty);
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public int getItem_qty() {
        return item_qty;
    }

    public void setItem_qty(int item_qty) {
        this.item_qty = item_qty;
    }
}
