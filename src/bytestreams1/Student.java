package bytestreams1;

import java.io.*;

public class Student implements Serializable {
    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
