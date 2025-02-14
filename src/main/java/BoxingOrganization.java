package org.example;
import org.springframework.stereotype.Component;

@Component
public class BoxingOrganization {
    private String name;
    private String country;


    public BoxingOrganization() {
        this.name = "WBC";
        this.country = "USA";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BoxingOrganization(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
