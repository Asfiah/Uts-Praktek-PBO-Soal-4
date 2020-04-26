/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo4;

/**
 *
 * @author asus
 */
public class UTSPBO4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here Instructor myInstructor =
          Instructor myInstructor = new Instructor("SI 065", "Asfiah","Unesa");
      

          TextBook myTextBook = new TextBook("Pengenalan Sitem Informasi","Abdul Kadir", "Andi Offset");

      Course myCourse = new Course("Information Systems", myInstructor, myTextBook);

      System.out.println(myCourse);
   }
}
