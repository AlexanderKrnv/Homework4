import java.util.ArrayList;

import java.util.LinkedList;

public class Main {

 public static void main(String[] args) {

  ArrayList<Double> arrayList = new ArrayList<>();
  LinkedList<Double> linkedList = new LinkedList<>();

  final int N = 500000;
  final int M = 50000;

  long startTime1 = System.currentTimeMillis();
  for (int i = 0; i < N; i++) {
   arrayList.add(Math.random());
  }
  startTime1 = System.currentTimeMillis() - startTime1;
    System.out.println("Время добавления элементов в ArrayList " + startTime1);

  long startTime2 = System.currentTimeMillis();
  for (int i = 0; i < N; i++) {
   linkedList.add(Math.random());
  }
  startTime2 = System.currentTimeMillis() - startTime2;
  System.out.println("Время добавления элементов в LinkedList " + startTime2);

  if (startTime1 < startTime2) {
   System.out.println("В ArrayList элементы добавились быстрее, чем в  LinkedList ");
  } else {
   if (startTime1 > startTime2) {
    System.out.println("В LinkedList элементы добавились быстрее, чем в  ArrayList ");
   } else {
    System.out.println("В LinkedList и в ArrayList элементы добавились за одинаковое время  ");
   }

  }


  long startTime3 = System.currentTimeMillis();
  for (int i = 0; i < M; i++) {
   arrayList.get((int) (Math.random() * (N - 1)));
  }
  startTime3 = System.currentTimeMillis() - startTime3;
  System.out.println("Время выбора элементов из ArrayList " + startTime3);

  long startTime4 = System.currentTimeMillis();
  for (int i = 0; i < M; i++) {
   linkedList.get((int) (Math.random() * (N - 1)));
  }
  startTime4 = System.currentTimeMillis() - startTime4;
  System.out.println("Время выбора элементов из LinkedList " + startTime4);

  if (startTime3 !=0){
   System.out.println("Из ArrayList элементы выбрали быстрее, чем из  LinkedList в " + startTime4 / startTime3 + " раз ");
  } else {
   System.out.println("Из ArrayList элементы выбрали гораздо быстрее, чем из  LinkedList ");
  }
 }

}