public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber){
        this.id = id;
        this.name = name;
        if(birthYear <= 0 ){
            System.out.println("invalid birthYear");
        } else {
            this.birthYear = birthYear;
        }
        if(height <= 0 ){
            System.out.println("invalid height");
            this.height = height*(-1);
        } else {
            this.height = height;
        }
        if(weight <= 0 ){
            System.out.println("invalid weight");
            this.weight = weight*(-1);
        } else {
            this.weight = weight;
        }
        if (bloodGroup == null || bloodGroup != "A" || bloodGroup != "B" || bloodGroup != "AB" || bloodGroup != "O") {
            System.out.println("Invalid bloodGroup");
            this.bloodGroup = "Unknown";
        } else {
            this.bloodGroup = bloodGroup;
        }
        if (phoneNumber == null || phoneNumber.length() < 10) {
            System.out.println("Invalid phone number.");
            this.phoneNumber = "000-000-0000";
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public int getAge(int currentYear){
        if(currentYear < 0){
            System.out.println("invalid currentYear");
        }
        int age = currentYear - birthYear;
        return age;
    }

    public double getBMI(){
        double bmi = 0.0;
        if (height > 0 && weight > 0) {
            bmi = weight / ((height / 100) * (height / 100));
        }
        return bmi;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient bloodGroup: " + bloodGroup);
        System.out.println("Patient phoneNumber: " + phoneNumber);
        System.out.println("Patient BMI: " + getBMI());
    }
}
