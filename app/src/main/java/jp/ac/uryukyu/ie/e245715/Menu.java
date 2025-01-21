package jp.ac.uryukyu.ie.e245715;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<Menu> menus;
    Scanner scanner;

    public Menu() {
        menus = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // コマンドリストにコマンドを追加
    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    // ユーザーの選択を待つ
    public int waitForUsersCommand(String prompt) {

        var i = 0;

        // コマンドを表示
        System.out.println(prompt);

        for (var menu : menus) {

            //選択肢を表示
            System.out.println(i + ":" + menu); 

            i += 1;
        }

        //標準入力から数値を入力
        while(true) {
            int menu_index = scanner.nextInt();

            if (menu_index >= 0 && menu_index < menus.size()) {
                return menu_index;
            }
        }
    }
    

}
