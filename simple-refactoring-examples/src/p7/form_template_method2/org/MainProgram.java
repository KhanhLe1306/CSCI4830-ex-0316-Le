package p7.form_template_method2.org;

public class MainProgram {
   public static void main(String[] args) {
	   
	   
      System.out.println("Before Refactoring:");
      System.out.println("A: " + new SubClassA().compute(5, 10));
      System.out.println("B: " + new SubClassA().compute(7, 4));
      
      
   }
}
