
public class Main {
    public static void main(String[] args) {
        FieldExample fe = new FieldExample(); //calls FieldExample into Main class
        System.out.println("Names"); //Print to prompt
        System.out.println(fe.toString());

        
        System.out.println("\nInsecure/non-compliant usage");
        for (String arg : args) {
            fe.zeroField(arg);
            System.out.println(fe.toString());
        }
    }
}