package com.company;

public class Main {
      public static void main(String[] args) {
          LinkList list = new LinkList();
          list.add("Антон");
          list.add("я");
          list.add("Привет");
          list.add("говорю");
          list.add("Привет");
          //
          list.add("Привет");
          list.add("говорю");
          list.add("Привет");
          list.removeDup();
          list.print();







          //Ввод списка for {list.add()}
          //Решить задачу list.removeDup()
          //Вывод содержимого листа. for {list.get()}
      }

}


