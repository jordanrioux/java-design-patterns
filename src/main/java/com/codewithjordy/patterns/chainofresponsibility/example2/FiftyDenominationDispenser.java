package com.codewithjordy.patterns.chainofresponsibility.example2;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class FiftyDenominationDispenser implements Command {
    public boolean execute(Context context) throws Exception {
        int amountLeftToBeWithdrawn = (Integer)context.get("amountLeftToBeWithdrawn");
        if (amountLeftToBeWithdrawn >= 50) {
            context.put("noOfFiftiesDispensed", amountLeftToBeWithdrawn / 50);
            context.put("amountLeftToBeWithdrawn", amountLeftToBeWithdrawn % 50);
        }
        return false;
    }
}
