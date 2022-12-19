package Exercise11;

import java.util.Arrays;
import java.util.List;

public class Person {
    private double heigth;
    private char gender;

    public Person(double heigth, char gender) {
        this.heigth = heigth;
        if(checkGender(gender)){
            this.gender = gender;
        }else{
            throw new IllegalArgumentException("Invalid gender!");
        }
    }

    private boolean checkGender(char gender) {
        if(gender != 'm' && gender != 'M' && gender != 'f' && gender != 'F') {
            return  false;
        }

        return true;
    }

    public double getHeigth() {
        return heigth;
    }

    public char getGender() {
        return gender;
    }
}
