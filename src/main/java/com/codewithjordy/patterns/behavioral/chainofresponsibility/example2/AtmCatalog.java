package com.codewithjordy.patterns.behavioral.chainofresponsibility.example2;

import org.apache.commons.chain.impl.CatalogBase;

public class AtmCatalog extends CatalogBase {
    public AtmCatalog() {
        super();
        addCommand("atmWithdrawalChain", new AtmWithdrawalChain());
    }
}

