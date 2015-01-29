package com.ludtek;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ludtek.jsonparser.model.Cotizacion;

/**
 * Parsea Json a objeto java y hace un toString
 *
 */
public class App
{
    public static void main( String[] args) throws IOException {       
    	ObjectMapper om = new ObjectMapper();    	
    	final Cotizacion cot = om.readValue(getInputStream("example.json"), Cotizacion.class);    	
    	System.out.println(cot);    	
    }
        
    private static InputStream getInputStream(String fileName) throws IOException {
    	return App.class.getClassLoader().getResourceAsStream(fileName);
    }
}
