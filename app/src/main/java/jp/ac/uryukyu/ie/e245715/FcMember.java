package jp.ac.uryukyu.ie.e245715;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class FcMember extends Person {

    private LocalDate joinDate;
    private String Oshimen;

    //getter,setterメソッド
    public LocalDate getJoinDate(){
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate){
        this.joinDate = joinDate;
    }

    public String getOshimen(){
        return Oshimen;
    }

    public void setOshimen(String Oshimen){
        this.Oshimen = Oshimen;
    }

   //コンストラクタ
    public FcMember(String name,LocalDate birthDate,LocalDate joinDate,String Oshimen){

        super(name, birthDate);
        this.joinDate = joinDate;
        this.Oshimen = Oshimen;
    } 

    

    
    //会員歴を計算するメソッド
    public void calculateMembershipLog(){

        LocalDate today = LocalDate.now();
        
        long daysBetween = ChronoUnit.DAYS.between(joinDate,today);

    }
    
    //マイプロフィールを表示するメソッド
    public void displayMyProfile(){

        long daysBetween = ChronoUnit.DAYS.between(joinDate,LocalDate.now());
        System.out.println( "(名前)"+ getName() + 
                            "(誕生日)" + getBirthDay() + 
                            "(入会日)" + getJoinDate() + 
                            "(会員歴)" + daysBetween + "日" +
                            "(推しメンバー)" + getOshimen());
    }

    
}
