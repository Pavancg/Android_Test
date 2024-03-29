package ui.cherry.com.retrofitexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by PPS on 2/2/2018.
 */

public class Employee {

    @SerializedName("name")
    private String name;
     @SerializedName("email")
    private  String email;
    @SerializedName("email")
    private String phone;

    public Employee(String name,String email,String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
