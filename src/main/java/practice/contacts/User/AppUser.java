package practice.contacts;

public class AppUser {

    HumanName userName;
    PhoneNumber userPhoneNumber;

    public AppUser(HumanName userName, PhoneNumber userPhoneNumber) {
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
    }

    public HumanName getUserName() {
        return userName;
    }

    public void setUserName(HumanName userName) {
        this.userName = userName;
    }

    public PhoneNumber getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(PhoneNumber userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }
}
