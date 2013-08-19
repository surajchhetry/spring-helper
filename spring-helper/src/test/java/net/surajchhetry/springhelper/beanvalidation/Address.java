package net.surajchhetry.springhelper.beanvalidation;

import javax.validation.constraints.NotNull;

/**
 *
 * @author suraj
 */
public class Address {
    
    private String address;

    @NotNull(message = "address is blank")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
