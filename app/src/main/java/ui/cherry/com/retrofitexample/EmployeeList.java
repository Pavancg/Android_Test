package ui.cherry.com.retrofitexample;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by PPS on 2/2/2018.
 */

public class EmployeeList {

    @SerializedName("employeelist")
    private ArrayList<Employee> employeelist;

    public ArrayList<Employee> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(ArrayList<Employee> employeelist) {
        this.employeelist = employeelist;
    }
}
