package com.juamber.demows.impl;

import com.juamber.demows.WSSecurityInterceptor;
import com.juamber.sumservice.schema.GetSumRequest;
import com.juamber.sumservice.schema.GetSumResponse;
import com.juamber.sumservice.wsdl.SumServicePort;
import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.interceptor.InInterceptors;
import org.springframework.stereotype.Service;

@Service
@SchemaValidation(type = SchemaValidation.SchemaValidationType.REQUEST)
@InInterceptors(classes = WSSecurityInterceptor.class)
public class SumServiceImpl implements SumServicePort {
    @Override
    public GetSumResponse getSum(GetSumRequest parameters) {
        GetSumResponse res = new GetSumResponse();
        res.setResult(parameters.getAddendOne() + parameters.getAddendTwo());
        return res;
    }
}
