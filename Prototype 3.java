// Interface extending Cloneable
interface MedicalReport extends Cloneable {
    void setPatientName(String name);
    void updateDetails(String details);
    void showReport();
    MedicalReport cloneReport(); 
}

// Abstract BaseReport Template
abstract class BaseReport implements MedicalReport {
    protected String patientName;
    protected String reportDetails;
    protected String reportType;

    @Override
    public void setPatientName(String name) {
        this.patientName = name;
    }

    @Override
    public void updateDetails(String details) {
        this.reportDetails = details;
    }

    @Override
    public void showReport() {
        System.out.println("--- " + reportType + " ---");
        System.out.println("Patient Name: " + (patientName != null ? patientName : "N/A"));
        System.out.println("Details: " + (reportDetails != null ? reportDetails : "N/A"));
        System.out.println("-------------------------");
    }

    // Prototype pattern core: cloning method
    @Override
    public MedicalReport cloneReport() {
        try {
            return (MedicalReport) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

// Concrete Classes
class BloodReport extends BaseReport {
    public BloodReport() {
        this.reportType = "Blood Report";
    }
}

class XrayReport extends BaseReport {
    public XrayReport() {
        this.reportType = "X-Ray Report";
    }
}

class Prescription extends BaseReport {
    public Prescription() {
        this.reportType = "Prescription";
    }
}

// Main class to demonstrate the system
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // 1. Create original templates (Prototypes) once
        BloodReport bloodTemplate = new BloodReport();
        Prescription prescriptionTemplate = new Prescription();

        // 2. Generate new reports by cloning templates for Patient 1
        MedicalReport patient1Blood = bloodTemplate.cloneReport();
        patient1Blood.setPatientName("John Doe");
        patient1Blood.updateDetails("Blood Group: O+, Hemoglobin: 14 g/dL");

        MedicalReport patient1Prescription = prescriptionTemplate.cloneReport();
        patient1Prescription.setPatientName("John Doe");
        patient1Prescription.updateDetails("Take Paracetamol 500mg 1x3 times a day.");

        // 3. Generate a new report for Patient 2
        MedicalReport patient2Blood = bloodTemplate.cloneReport();
        patient2Blood.setPatientName("Jane Smith");
        patient2Blood.updateDetails("Blood Group: A+, Hemoglobin: 12 g/dL");

        // 4. Show the cloned reports
        patient1Blood.showReport();
        patient1Prescription.showReport();
        patient2Blood.showReport();
    }
}
