package com.threads.assignment;

//import com.threads.assignment.PrescriptionDatabase.DoctorConsole;
//import com.threads.assignment.PrescriptionDatabase.LabSystem;
//import com.threads.assignment.PrescriptionDatabase.PharmacySystem;

public class HospitalManagementSystem {

	public static void main(String[] args) {
        PatientRecords records = new PatientRecords();
        PrescriptionDatabase prescriptions = new PrescriptionDatabase();

        DoctorConsole doctor = new DoctorConsole(records, prescriptions);
        PharmacySystem pharmacy = new PharmacySystem(prescriptions);
        LabSystem lab = new LabSystem(records);

        doctor.start();
        pharmacy.start();
        lab.start();
    }
}
