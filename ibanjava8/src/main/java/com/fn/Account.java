package com.fn;

public class Account {

        private String rawAccount;
        private String account;
        private String BBAN;
        private String bankCode;
        private String checkDigit;
        private String nationalCheckDigit;
        private String countryCode;
        private boolean valid;


    public Account() {
        this.valid = false;
        this.rawAccount = "NA";
        this.account = "NA";
        this.BBAN = "NA";
        this.bankCode = "NA";
        this.checkDigit = "NA";
        this.nationalCheckDigit = "NA";
        this.countryCode = "NA";
    }

    public Account(String rawAccount) {
        this();
        this.rawAccount = rawAccount;
    }

    public Account(String rawAccount, String account, String BBAN,
                   String bankCode, String checkDigit, String nationalCheckDigit,
                   String countryCode, boolean valid ) {
        this.valid = true;
        this.rawAccount = rawAccount;
        this.account = account;
        this.BBAN = BBAN;
        this.bankCode = bankCode;
        this.checkDigit = checkDigit;
        this.nationalCheckDigit = nationalCheckDigit;
        this.countryCode = countryCode;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getRawAccount() {
        return rawAccount;
    }

    public void setRawAccount(String rawAccount) {
        this.rawAccount = rawAccount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBBAN() {
        return BBAN;
    }

    public void setBBAN(String BBAN) {
        this.BBAN = BBAN;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(String checkDigit) {
        this.checkDigit = checkDigit;
    }

    public String getNationalCheckDigit() {
        return nationalCheckDigit;
    }

    public void setNationalCheckDigit(String nationalCheckDigit) {
        this.nationalCheckDigit = nationalCheckDigit;
    }

    public String getCountryCode() {
        return countryCode.toString();
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
