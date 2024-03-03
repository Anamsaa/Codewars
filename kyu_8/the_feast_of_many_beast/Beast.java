package kyu_8.the_feast_of_many_beast;

public class Beast {
    public static boolean feast(String beast, String dish) {
        
        char[] firstBeast = beast.toCharArray(); 
        char[] firstDish = dish.toCharArray(); 
        if (firstBeast[0] == firstDish[0] && firstBeast[firstBeast.length - 1] == firstDish[firstDish.length - 1]){
        return true;
        }else{
        return false;
        }   
    }    
}
