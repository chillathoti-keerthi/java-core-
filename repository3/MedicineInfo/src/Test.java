public class Test {
    public static void main(String[] args) {
        // Declare instances of different medicines
        MedicineInfo tablet = new Tablet();
        MedicineInfo syrup = new Syrup();
        MedicineInfo ointment = new Ointment();

        // Demonstrate polymorphic behavior
        tablet.displayLabel();
        syrup.displayLabel();
        ointment.displayLabel();
    }
}