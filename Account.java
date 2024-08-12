package src;

import java.io.*;
import java.util.*;

public class Account {
   private  String contact;
   private String pass;

   Account(){}
    Account(String contact,String pass){
       this.contact = contact;
       this.pass = pass;
    }
    public void setcontact(String contact){this.contact = contact;}
    public String getcontact(){return this.contact;}

    public void setPass(String pass){this.pass = pass;}
    public String getPass(){return this.pass;}

    public void addAccount(){
        try{
            File file2 = new File("account.txt");
            FileWriter fw = new FileWriter(file2,true);
            fw.write(getcontact()+"\t");
            fw.write(getPass()+"\t");
            fw.write("\n---------------------------------------------\n");
            fw.flush();
            fw.close();
    }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public boolean checkAccount(String contact,String pass){
       boolean check = false;
       try{
           File file2 = new File("account.txt");
            Scanner scanner =  new Scanner(file2);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split("\t");
                if(data[0].equals(contact) && data[1].equals(pass)){
                    check = true;
                }
            }
       }
       catch (Exception e){
           e.printStackTrace();
       }
       return check;
    }
}
