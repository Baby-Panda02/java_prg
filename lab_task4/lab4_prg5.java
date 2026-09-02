class Patient {
    String patientName;
    int patientId;
    String disease;

    // Parameterized constructor
    Patient(String patientName, int patientId, String disease) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.disease = disease;
    }

    // Copy constructor
    Patient(Patient p) {
        this.patientName = p.patientName;
        this.patientId = p.patientId;
        this.disease = p.disease;
    }

    void display() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Disease: " + disease);
    }
}

public class lab4_prg5 {
    public static void main(String[] args) {
        Patient P1 = new Patient("Alice", 101, "Fever");
        Patient P2 = new Patient(P1); // copy constructor

        System.out.println("Patient 1 Details:");
        P1.display();

        System.out.println("\nPatient 2 Details:");
        P2.display();
    }
}
