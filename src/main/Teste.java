package main;

import java.util.Scanner;
import classes.Worker;
import classes.HourContract;
import classes.Department;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<HourContract> t = new ArrayList();
        HourContract contract = new HourContract();
        Date date = new Date();
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            try {
                date = data.parse(ler.nextLine());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        contract.setDate(date);
        t.add(contract);
        
        /*HourContract contract1 = new HourContract();
        Date date1 = new Date();
        date1.setDate(02);
        contract1.setDate(date1);
        t.add(contract1);
        
        HourContract contract2 = new HourContract();
        Date date2 = new Date();
        date2.setDate(03);
        contract2.setDate(date2);
        //t.add(contract2);*/
        
        System.out.println("t = " + t.size());
        System.out.println("Data: " + t.get(0).getDate());
        //t.remove(contract2);
        
        //System.out.println("t = " + t.size());
    }
}
