package kyu_6.emotional_sort;

import java.util.Map;
import java.util.HashMap;

public class Emotional {

    public static String[] sortEmotions(boolean order,String[] emotions) {
        // (ง •̀_•́)ง

      Map <String, Integer> emoOrder = new HashMap <>();
      if (order){
        emoOrder.put (":D", 0);
        emoOrder.put (":)", 1);
        emoOrder.put (":|", 2);
        emoOrder.put (":(", 3);
        emoOrder.put ("T_T", 4);
      }else{
        emoOrder.put (":D", 4);
        emoOrder.put (":)", 3);
        emoOrder.put (":|", 2);
        emoOrder.put (":(", 1);
        emoOrder.put ("T_T", 0);
      }
      
      for (int i = 0; i < emotions.length; i ++){ //Funciona como limitador del segundo
        for (int j = 0; j < emotions.length - i - 1; j++){ // 
          if (emoOrder.get(emotions[j]) > emoOrder.get(emotions[j + 1]) ){
            String aux = emotions[j];
            emotions[j] = emotions[j + 1];
            emotions[j + 1] = aux; 
          }
        }
      }
      
      return emotions; 
  }
}