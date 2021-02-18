package com.codewithjordy.patterns.chainofresponsibility.example2;

import org.apache.commons.chain.impl.ChainBase;

public class AtmWithdrawalChain extends ChainBase {
    public AtmWithdrawalChain() {
        super();
        addCommand(new HundredDenominationDispenser());
        addCommand(new FiftyDenominationDispenser());
        addCommand(new TenDenominationDispenser());
        addCommand(new AuditFilter());
    }
}
