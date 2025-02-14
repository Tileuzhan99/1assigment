package org.example;
import org.springframework.stereotype.Component;

@Component
public class Boxer {
    private String name;
    private String weightCategory;

    public Boxer(String weightCategory, String name) {
        this.weightCategory = weightCategory;
        this.name = name;
    }


    public Boxer() {
        this.name = "Mike Tyson";
        this.weightCategory = "Heavyweight";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeightCategory() {
        return weightCategory;
    }

    public void setWeightCategory(String weightCategory) {
        this.weightCategory = weightCategory;
    }
}
