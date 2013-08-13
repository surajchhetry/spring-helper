package net.surajchhetry.springhelper;

import javax.validation.constraints.NotNull;

/**
 *
 * @author suraj
 */
public class Company {

    private String name = null;
    private int id;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @NotNull(message = "Company name can't be null")
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
