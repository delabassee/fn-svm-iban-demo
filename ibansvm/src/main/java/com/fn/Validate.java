package com.fn;

import org.iban4j.*;

public class Validate {

    public String handleRequest(String input) {

        //"BE84 3101 3936 6959"

        input = input.replace("\n", "");

        Account acct = new Account((input == null || input.isEmpty()) ? "NA"  : input);

        if (input.length()==16) { // probably a spaceless format
            input = input.substring(0,4) + " " + input.substring(4,8) + " " + input.substring(8,12) + " " + input.substring(12,16);
        }

        try {

            IbanUtil.validate(input, IbanFormat.Default);
            Iban iban = Iban.valueOf(input, IbanFormat.Default);

            acct = new Account(input,
                    iban.getAccountNumber(),
                    iban.getBban(),
                    iban.getBankCode(),
                    iban.getCheckDigit(),
                    iban.getNationalCheckDigit(),
                    iban.getCountryCode().getName(),
                    true);

        } catch (IbanFormatException |
                InvalidCheckDigitException |
                UnsupportedCountryException E) {
            return "Error, can't validate account!";
        }

        return "Valid Account";


    }

}