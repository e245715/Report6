import java.time.LocalDate;
import java.util.ArrayList;

import jp.ac.uryukyu.ie.e245715.*;

public class Main {

    /* メインクラスで行いたいこと
     * 「Person」「Idol」「FcMember」「BirthDay」クラスのインスタンス作成
     * 「FcMember」クラスでの会員歴の計算表示
     * 「BirthDay」クラスでの誕生日チェック
     */
    
    public static void main(String args[]){
        
        // Idolのインスタンス作成
        Idol Kaito = new Idol("佐藤海音", LocalDate.of(2005, 7, 3),"新潟県");
        Idol Haruku = new Idol("斎木春空", LocalDate.of(2004, 5, 20),"東京都");

        //idolsリストに追加
        Kaito.addIdol("佐藤海音");
        Haruku.addIdol("斎木春空");

        // FcMemberのインスタンス作成
        var Keigo = new FcMember("伊藤圭吾", LocalDate.of(2005, 12, 27), LocalDate.of(2024, 6, 1), "佐藤海音");

        //アイドルプロフィール
        Kaito.displayIdolProfiles();
        Haruku.displayIdolProfiles();

        //メンバー一覧
        System.out.println("アイドルグループのメンバー：");
        Kaito.idolGroup();

        // マイプロフィール
        Keigo.displayMyProfile();

        // 誕生日をチェックしてメッセージを表示
        

    }
}

