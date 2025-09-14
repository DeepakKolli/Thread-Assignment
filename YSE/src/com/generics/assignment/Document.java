package com.generics.assignment;
//Base class
import java.util.*;
public class Document {

	
	    String documentId, recipient;

	    Document(String documentId, String recipient) {
	        this.documentId = documentId;
	        this.recipient = recipient;
	    }

	    @Override
	    public String toString() {
	        return "DocID: " + documentId + ", Recipient: " + recipient;
	    }
	}

//Subclasses
class KYCForm extends Document {
 KYCForm(String id, String recipient) {
     super(id, recipient);
 }
}

class LoanAgreement extends Document {
 LoanAgreement(String id, String recipient) {
     super(id, recipient);
 }
}

class TransactionSummary extends Document {
 TransactionSummary(String id, String recipient) {
     super(id, recipient);
 }
}

