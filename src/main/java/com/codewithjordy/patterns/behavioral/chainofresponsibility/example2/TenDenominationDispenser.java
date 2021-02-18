package com.codewithjordy.patterns.behavioral.chainofresponsibility.example2;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class TenDenominationDispenser implements Command {
    public boolean execute(Context context) throws Exception {
        int amountLeftToBeWithdrawn = (Integer)context.get("amountLeftToBeWithdrawn");
        if (amountLeftToBeWithdrawn >= 10) {
            context.put("noOfTensDispensed", amountLeftToBeWithdrawn / 10);
            context.put("amountLeftToBeWithdrawn", amountLeftToBeWithdrawn % 10);
        }
        return false;
    }
}
