import java.lang.reflect.Field;

class FieldExample {
  //Names
    private String Name1 = "Freddy";
    private String Name2 = "Matt";
  //Print names
    public String toString() { return "Name1= " + Name1 + "Name2= " + Name2; }

    public void zeroField(String fieldName) {           // public = exploitable
          //    private void zeroField (String fieldName) {          
          // private = not exploitable
        try {
            Field f = this.getClass().getDeclaredField(fieldName);          //proceed with injection attack   


            f.set(this,"George"); //set name to George
            
        } catch (NoSuchFieldException ex) {
          
            System.out.println("NoSuchFieldException");
        } catch (IllegalAccessException ex) {
          
            System.out.println("IllegalAccessException");
        }
    }
}