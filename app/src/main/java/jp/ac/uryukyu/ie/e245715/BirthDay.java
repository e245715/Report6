package jp.ac.uryukyu.ie.e245715;

import java.time.LocalDate;

public class BirthDay extends Person{

    public BirthDay(String name,LocalDate birthDate){
        super(name, birthDate);
    }

    //誕生日かどうかを調べる
    public void checkBirthDay(){

        LocalDate today = LocalDate.now();

        if(today == getBirthDay()){
            System.out.println(getName() + "さん HappyBirthDay!! いい一年になりますように！");
        }else{
            System.out.println("誕生日までのお楽しみに！");
        }
    }



    
}
