package com.su.com;

import org.hibernate.validator.internal.util.stereotypes.ThreadSafe;

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;


@ThreadSafe
public class StatelessFacrorizer implements Servlet {


    private final AtomicLong count = new AtomicLong();

    public long getCount() {
        return count;
    }

    public void service2(ServletRequest request, ServletResponse response) {
        BigInteger i = extractFromRequest(request);
        BigInteger i = extractFromRequest(request);
        BigInteger[] factors = factor(i);
        count.incrementAndGet();
        encodeInResponse(response, factors);

    }
}
