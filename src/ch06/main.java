package ch06;

import java.util.ArrayList;
import java.util.List;

/**
 * @project kotlin-in-action
 * @author Jay Lee
 * @created 2019-03-28
 **/
class NotList{
  public String toString(){
    return "It's not a list";
  }
}
public class main {
  public static void main(String[] args){
    String a = null;
    System.out.println(a);
    List list = new ArrayList();
    if (list instanceof NotList) {
      NotList notList = (NotList)list;
      System.out.println(notList);
    }
    //NotList notList = (NotList)list;
    //System.out.println(notList);
  }
}
