interface MedicineInfo {
    void displayLabel();
}

class Tablet implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Store in a cool, dry place.");
    }
}
