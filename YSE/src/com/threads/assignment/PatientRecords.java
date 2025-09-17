package com.threads.assignment;

public class PatientRecords {
	
	    public synchronized void accessRecords(String system) {
	        System.out.println(system + " is accessing Patient Records...");
	        try { Thread.sleep(1000); } catch (InterruptedException e) {}
	        System.out.println(system + " finished accessing Patient Records.\n");
	    }
	}

	class PrescriptionDatabase {
	    public synchronized void updatePrescription(String system) {
	        System.out.println(system + " is updating Prescription Database...");
	        try { Thread.sleep(1000); } catch (InterruptedException e) {}
	        System.out.println(system + " finished updating Prescription Database.\n");
	    }
	}

	class DoctorConsole extends Thread {
	    PatientRecords records;
	    PrescriptionDatabase prescriptions;

	    DoctorConsole(PatientRecords r, PrescriptionDatabase p) {
	        this.records = r;
	        this.prescriptions = p;
	    }

	    public void run() {
	        records.accessRecords("Doctor Console");
	        prescriptions.updatePrescription("Doctor Console");
	    }
	}

	class PharmacySystem extends Thread {
	    PrescriptionDatabase prescriptions;

	    PharmacySystem(PrescriptionDatabase p) {
	        this.prescriptions = p;
	    }

	    public void run() {
	        prescriptions.updatePrescription("Pharmacy System");
	    }
	}

	class LabSystem extends Thread {
	    PatientRecords records;

	    LabSystem(PatientRecords r) {
	        this.records = r;
	    }

	    public void run() {
	        records.accessRecords("Lab System");
	    }
}
