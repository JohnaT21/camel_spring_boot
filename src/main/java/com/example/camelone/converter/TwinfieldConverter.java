package com.example.camelone.converter;

//import com.example.camelone.schema.com.twinfield.nl.auditfiles.xaf._3.*;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


@Component
public class ExactConverter extends RouteBuilder {

    public JaxbDataFormat jaxbFormat(Class<ObjectFa> clazz) throws  Exception {
        try {
            return new JaxbDataFormat(JAXBContext.newInstance(clazz));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
    private Logger logger = LoggerFactory.getLogger(ExactConverter.class);

    @Override
    public void configure() throws Exception{
        try {

            logger.info("from the converter");
            from("file:C:\\Users\\jenye\\Desktop\\camelProject\\camel_spring_boot\\src\\main\\resources\\xml/?fileName=twinfield.xml&noop=true")
                    .log("file reading:\n${body}")
                    .unmarshal(jaxbFormat(ObjectFactory.class))
                    .process(exchange -> {
                        logger.info(exchange.getMessage().toString());
                    })
                    .log("file done:${body}");

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