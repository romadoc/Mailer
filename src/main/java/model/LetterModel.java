package model;

public class LetterModel {
    private String toAddress; // destination address
    private String subject; // subject of mail
    private String message; // message
    private String[] addressForCopy; // copy-to address

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String[] getAddressForCopy() {
        return addressForCopy;
    }

    public void setAddressForCopy(String[] addressForCopy) {
        this.addressForCopy = addressForCopy;
    }
}
