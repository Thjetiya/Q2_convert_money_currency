package org.example;
import java.text.DecimalFormat;
import java.util.HashMap;

public class MoneyCurrency {

    private int THB;
    private String type;
    private int NumberOfConverted;

    public MoneyCurrency(int THB, String type) {
        this.THB = THB;
        this.type = type;
    }

    public int getTHB() {
        return THB;
    }

    public void setTHB(int THB) {
        this.THB = THB;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfConverted() {
        return NumberOfConverted;
    }

    public void setNumberOfConverted(int numberOfConverted) {
        NumberOfConverted = numberOfConverted;
    }

    public int convertTHBTo(String type) {
        HashMap<String, Double> currency = new HashMap<String, Double>();
        currency.put("WON", 33.72);
        currency.put("USD", 0.028);
        currency.put("YEN", 3.4);

        return  (int) (this.THB*currency.get(type));
    }

    public String numberOfConvertedToString() {
        DecimalFormat df=new DecimalFormat("#,###");
        String formattedNumberWithComma = df.format(NumberOfConverted);

        return formattedNumberWithComma + " " + type;
    }
}
