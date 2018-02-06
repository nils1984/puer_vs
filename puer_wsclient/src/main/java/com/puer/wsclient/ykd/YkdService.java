package com.puer.wsclient.ykd;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.puer.wsclient.ykd.api.Ec;
import com.puer.wsclient.ykd.api.Ec_Service;

@Service
@RefreshScope
public class YkdService {
    
    @Value("${ykdwsUrl}")
    private String url;
    @Value("${ykdappToken}")
    private String AppToken;
    @Value("${ykdappKey}")
    private String AppKey;
    
    private static QName SERVICE_NAME = new QName("http://www.example.org/Ec/", "Ec");
    private final static Logger logger = LoggerFactory.getLogger(YkdService.class); 
    public Ec getService(){
        URL wsdlURL = null;
        try {
            wsdlURL = new URL(url);
        } catch (MalformedURLException e) {
            logger.error("Can not initialize the default wsdl from : "+url);
        }
      
        Ec_Service ss = new Ec_Service(wsdlURL, SERVICE_NAME);
        Ec port = ss.getEcSOAP(); 
        return port;
    }
    
    public String callService(String serviceName, String paramsJson ){
        Ec port = getService();  
        logger.error(" serviceName : "+serviceName+" paramsJson : "+paramsJson+" Invoking callService...");
        java.lang.String _callService__return = port.callService(paramsJson, AppToken, AppKey, serviceName);
        logger.error(" serviceName : "+serviceName+" callService.result=" + _callService__return);
        return _callService__return;
    }

}
