
package bytestreams1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB5 {

    
    public static void main(String[] args) {
        Student s = new Student("111111","Earn");
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            ObjectOutputStream output= new ObjectOutputStream(file);
            output.writeObject(s);
               
        } catch (FileNotFoundException ex) {   
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {   
            FileInputStream file = new FileInputStream("data.dat");
            ObjectInputStream input= new ObjectInputStream(file);
            Student s1 = (Student)input.readObject();
            System.out.println(s1.id);
            System.out.println(s1.name);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
