package practice.contacts.identifiers;

public class PhoneNumber {

    private String countryCode;
    private String localNumber;

    public PhoneNumber(String countryCode, String localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }

    public String getPhoneNumber() {
        return "+" + countryCode + " " + localNumber;
    }



}
