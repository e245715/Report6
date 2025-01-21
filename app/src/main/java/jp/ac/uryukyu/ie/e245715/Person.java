package jp.ac.uryukyu.ie.e245715;

import java.time.LocalDate;

public class Person {

    //フィールド
    private String name;
    private LocalDate birthDay;
    
    //コンストラクタ
    Person(String name,LocalDate birDate,LocalDate joiDate){
        this.name = name;
        this.birthDay = birDate;
        
    }

    //getterメソッド
    public String getName(){
        return name;
    }

    public LocalDate getBirthDay(){
        return birthDay;
    }

    
    
}
