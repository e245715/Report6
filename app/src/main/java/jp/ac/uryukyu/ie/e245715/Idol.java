package jp.ac.uryukyu.ie.e245715;
import java.util.ArrayList;
import java.time.LocalDate;

public class Idol extends Person{
    private String birthPlace;
    private static ArrayList<String> idols = new ArrayList<String>();

    public Idol(String name,LocalDate birthDate,String birthPlace){
        super(name, birthDate);
        this.birthPlace = birthPlace;
    } 

    public ArrayList<String> getIdols(){
        return idols;
    }

    public void addIdol(String name){
        idols.add(name);
    }

    //getter,setterメソッド
    public String getBirthPlace(){
        return birthPlace;
    }
    public void setBirthPlace(String birthPlace){
        this.birthPlace = birthPlace;
    }

    //メンバー一覧の表示
    public void idolGroup(){
        for(int i=0; i<idols.size();i++){
            System.out.println(idols.get(i));
        }
    }

    //メンバーのプロフィール表示
    public void displayIdolProfiles(){
        System.out.println( "(名前)" + getName() +
                            "(誕生日)" + getBirthDay()+ 
                            "(出身地)" + birthPlace);
        
    }

    
}
