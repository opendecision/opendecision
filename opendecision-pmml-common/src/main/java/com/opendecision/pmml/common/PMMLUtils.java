package com.opendecision.pmml.common;


import org.dmg.pmml.PMML;
import org.jpmml.model.JAXBUtil;
import org.jpmml.model.filters.ImportFilter;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import java.io.File;
import java.io.StringReader;

/**
 * PMML utility class
 * @author lihongjie
 */
public class PMMLUtils {

    public static final String VERSION_4_3 = "4.3";

    private PMMLUtils() {}

    public static PMML createPMMLfromString(String pmmlStr) throws SAXException, JAXBException {
        XMLReader reader = XMLReaderFactory.createXMLReader();
        ImportFilter filter = new ImportFilter(reader);

        InputSource inputSource = new InputSource(new StringReader(pmmlStr));
        Source source = new SAXSource(filter, inputSource);
        Unmarshaller unmarshaller = JAXBUtil.createUnmarshaller();
//        unmarshaller.setEventHandler(new SimpleValidationEventHandler());
        return (PMML) unmarshaller.unmarshal(source);
    }

    public static PMML createPMMLfromFile(File file) {

        return null;
    }
}
