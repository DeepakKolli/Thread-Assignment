package com.generics.assignment;

import java.util.*;

public class Main {

	
	    public static void main(String[] args) {
	        KYCForm kyc = new KYCForm("D1", "Bank");
	        LoanAgreement loan = new LoanAgreement("D2", "Finance");
	        TransactionSummary txn = new TransactionSummary("D3", "Audit");

	        // Wrap in envelopes
	        new SecureEnvelope<>(kyc).encryptAndSend();
	        new SecureEnvelope<>(loan).encryptAndSend();
	        new SecureEnvelope<>(txn).encryptAndSend();

	        // Deliver list of docs
	        List<Document> docs = Arrays.asList(kyc, loan, txn);
	        SecureDeliveryServices.deliverDocument(docs);
	    }
}
