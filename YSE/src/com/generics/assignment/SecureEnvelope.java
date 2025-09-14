package com.generics.assignment;

import java.util.List;

public class SecureEnvelope<T extends Document> {

	
	    T document;

	    SecureEnvelope(T document) {
	        this.document = document;
	    }

	    void encryptAndSend() {
	        System.out.println("Encrypting & Sending: " + document);
	    }
	}

	// Service class
	class SecureDeliveryService {
	    static void deliverDocument(List<? extends Document> docs) {
	        for (Document d : docs) {
	            System.out.println("Delivering: " + d);
	        }
	    }
	}
	
	// Service class
	class SecureDeliveryServices {
	    static void deliverDocument(List<? extends Document> docs) {
	        for (Document d : docs) {
	            System.out.println("Delivering: " + d);
	        }
	    }
	}
