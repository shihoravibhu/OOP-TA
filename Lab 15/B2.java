// 2. Write a program to check that whether the name given from command line is file or 
// not? If it is a file then print the size of file and if it is directory then it should display the 
// name of all files in it. [B] 

import java.io.File;

public class B2 {
    public static void main(String[] args) {
       
        if (args.length == 0) {
            System.out.println("Please provide file or directory name");
            return;
        }

        File f = new File(args[0]);
        
        if (!f.exists()) {
            System.out.println("File or Directory does not exist");
        }

        // Check Karse K Su aa File Che
        else if (f.isFile()) {
            System.out.println("It is a file");
            System.out.println("File size: " + f.length() + " bytes");
        }

        // If it is a directory (directory etle Folder)
        else if (f.isDirectory()) {
            System.out.println("It is a directory");
            System.out.println("Files inside directory:");

            File[] files = f.listFiles();
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}