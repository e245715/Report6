package jp.ac.uryukyu.ie.e245715;
import java.util.ArrayList;

import java.time.LocalDate;

public class Idol extends Person{
    public Idol(String name,LocalDate birthDate){
        super(name, birthDate);

        }

    public static ArrayList<String> idols = new ArrayList<String>();

    public ArrayList<String> getIdols(){
        return idols;
    }

    public void addIdol(String name){
        idols.add(name);
    }

    

    
}
