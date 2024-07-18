/*
 * @author : xCODE
 * Project : Project02
 * Date    : 7/18/2024 (Thursday)
 * Time    : 4:12 PM
 * For GDSE course of IJSE institute.
 */

package lk.ccns.thogakade.dto;

public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private double salary;

    public CustomerDTO() {
    }

    public CustomerDTO(String id, String name, String address, double salary) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
