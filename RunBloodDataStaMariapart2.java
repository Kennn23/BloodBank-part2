import java.util.Scanner;
public class RunBloodData{
    public static void main(String[] args) {
    	BloodData bd = new BloodData();
        Scanner sc = new Scanner(System.in);
        String input1,input2;
        String data;
        System.out.print("Enter blood type of patient: ");
        input1 = sc.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        input2 = sc.nextLine();
        data = input1 + input2;
        if(data.isEmpty()){
            bd.display();
        }
        else if(data.equals("A+")||data.equals("A-")|| data.equals("B+")||data.equals("B-")||data.equals("AB+")||data.equals("AB-")||data.equals("O+")||data.equals("O-")){
            bd.setBloodType(input1);
            bd.setRhFactor(input2);
            bd.display();
        }
        else{
            System.out.println("Invalid input!");
        }
        sc.close();
}
}