package jp.ac.uryukyu.ie.e245715;

import java.time.LocalDate;

public class Person {

    //フィールド
    private String name;
    private LocalDate birthDay;
    private LocalDate joinDate;

    //コンストラクタ
    Person(String name,LocalDate birDate,LocalDate joiDate){
        this.name = name;
        this.birthDay = birDate;
        this.joinDate = joinDate;
    }

    //getterメソッド
    public String getName(){
        return name;
    }

    public LocalDate getBirthDay(){
        return birthDay;
    }

    public LocalDate getJoinDate(){
        return joinDate;
    }

    
}
