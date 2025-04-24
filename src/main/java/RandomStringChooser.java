import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> array;

  public RandomStringChooser(String [] wordarray){
    array = new ArrayList<String>();
    for(int i = 0; i < wordarray.length; i ++){
       array.add(wordarray[i]);
    }
    
  }
  //public int RandomNumber(){
  //randomnum=Math.random()*array.size();
  //}
  public String getNext(){
if(array.size()==0){
return "NONE";
}else{
return array.remove((int)(Math.random()*array.size()));
}

  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
