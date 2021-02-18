package com.codewithjordy.patterns.behavioral.chainofresponsibility.example2;

import org.apache.commons.chain.Context;
import org.apache.commons.chain.Filter;

public class AuditFilter implements Filter {
    public boolean postprocess(Context context, Exception exception) {
        // send notification to bank and user
        return false;
    }

    public boolean execute(Context context) throws Exception {
        return false;
    }
}
