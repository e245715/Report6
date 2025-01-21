package jp.ac.uryukyu.ie.e245715;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class FcMember extends Person {

    private LocalDate joinDate;
    private String Oshimen;

    public FcMember(String name,LocalDate birthDate,LocalDate joinDate,String Oshimen){

        super(name, birthDate);

        this.joinDate = joinDate;
        this.Oshimen = Oshimen;
    }

    //getterメソッド
    public LocalDate getJoinDate(){
        return joinDate;
    }

    public String getOshimen(){
        return Oshimen;
    }

    //会員歴を計算するメソッド
    public void calculateMembershipLog(){

        LocalDate today = LocalDate.now();
        
        long daysBetween = ChronoUnit.DAYS.between(joinDate,today);

        System.out.println("会員歴:" + daysBetween + "日");
    }
    
    
}
