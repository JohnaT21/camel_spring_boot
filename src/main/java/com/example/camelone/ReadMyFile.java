package com.example.camelone;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.StringReader;


@Component
public class ReadMyFile extends RouteBuilder {

    private Logger logger = LoggerFactory.getLogger(ReadMyFile.class);
    @Override
    public void configure() throws Exception{

        try {
           /*
           moving a file form one folder to another
           from resources source to resources destination folder
            */
            from("file:C:\\Users\\jenye\\OneDrive\\Desktop\\jo\\chrome\\camel-one\\camel-one\\src\\main\\resources\\source/?fileName=sample.xml")
                    // we can specify a file by a file name and also we can add &noop=true if we want to only read the file
                    .log("File has been read:${body}")
                    .to("file:C:\\Users\\jenye\\OneDrive\\Desktop\\jo\\chrome\\camel-one\\camel-one\\src\\main\\resources\\destination")
                    .log("File has been moved");

        }catch (Exception exe) {
            logger.info("here is the failed");
            logger.info(exe.getMessage());
            exe.printStackTrace();
        }

    }
}
