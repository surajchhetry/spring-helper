package net.surajchhetry.springhelper.beanvalidation;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

/**
 *
 * @author suraj
 */
public class Address {
    
    private String address;
    private int houseNumber;

    public Address() {
    }
    
    

    public Address(String address,int house) {
        this.address = address;
        this.houseNumber = house;
    }
    
    

    @NotNull(message = "address is blank")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    @AssertTrue(message = "Wrong house number")
    private boolean isValidHouseNumber(){
        return this.houseNumber > 0;
    }
    
}
