package com.example.camelone.converter;

//import com.example.camelone.schema.com.twinfield.nl.auditfiles.xaf._3.*;

import com.example.camelone.schema.ObjectFactory;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class TwinFieldConverter extends RouteBuilder {

    public JaxbDataFormat jaxbFormat(String contextPath) throws  Exception {
        JaxbDataFormat jaxbDataFormat = new JaxbDataFormat();
        jaxbDataFormat.setContextPath(contextPath);
        return jaxbDataFormat;
    }
    private Logger logger = LoggerFactory.getLogger(TwinFieldConverter.class);

    @Override
    public void configure() throws Exception{
        try {

            logger.info("from the converter");
            from("file:C:\\Users\\jenye\\Desktop\\camelProject\\camel_spring_boot\\src\\main\\resources\\xml/?fileName=twinfield.xml&noop=true")
                    .log("file reading:\n${body}")
                    .unmarshal(jaxbFormat(ObjectFactory.class.getPackage().getName()))
//                    .process(exchange -> {
//                        logger.info(exchange.getMessage().toString());
//                    })
                    .marshal(jaxbFormat(com.example.camelone.schemas.esb.ObjectFactory.class.getPackage().getName()))
                    .log("file done:${body}")
                    .to("file:C:\\Users\\jenye\\Desktop\\camelProject\\camel_spring_boot\\src\\main\\resources\\destination");


//            JAXBElement<com.employee.EmployeeType> sampleXml = (JAXBElement<com.employee.EmployeeType>) unmarshaller.unmarshal(new File("C:\\Users\\jenye\\Desktop\\camelProject\\camel_spring_boot\\src\\main\\resources\\xml\\employee.xml"));
//            logger.info("the file shoud be");
//            logger.info(sampleXml.getClass().getName());
//            logger.info(sampleXml.getValue().getFirstName());




        }catch (Exception exe) {
            logger.info("here is the failed in");
            logger.info(exe.getMessage());
            exe.printStackTrace();
        }

    }
}