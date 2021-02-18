package com.codewithjordy.patterns.chainofresponsibility.example2;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class HundredDenominationDispenser implements Command {
    public boolean execute(Context context) throws Exception {
        int amountLeftToBeWithdrawn = (Integer)context.get("amountLeftToBeWithdrawn");
        if (amountLeftToBeWithdrawn >= 100) {
            context.put("noOfHundredsDispensed", amountLeftToBeWithdrawn / 100);
            context.put("amountLeftToBeWithdrawn", amountLeftToBeWithdrawn % 100);
        }
        return false;
    }
}
