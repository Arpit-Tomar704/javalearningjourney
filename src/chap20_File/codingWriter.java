package chap20_File;

import java.io.FileWriter;
import java.io.IOException;

public class codingWriter {
    static void main(String[] args) {
        String fileName = "java-course.txt";

        try ( FileWriter writer= new FileWriter(fileName)) {

            writer.write("This is the good java course. \n");
            for (int i = 0; i <10000 ; i++) {
               writer.write('@');
               // System.out.println("@");

            }
            writer.flush();
            System.out.println("file written Successfully");
        }catch (IOException exception){
            System.out.printf("Exception occured %s\n",exception.getMessage());
        }

    }
}
