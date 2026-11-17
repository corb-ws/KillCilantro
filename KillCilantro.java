public class KillCilantro {
   public static String killCilantro(String word) {
      int wordLength=word.length();
      int currentLetter=0;
      String newString="";
      while (currentLetter<wordLength) {
         String sub="";
         if (currentLetter+8<=wordLength) {
            sub=word.substring(currentLetter,currentLetter+8);
         }
         if (currentLetter+8>wordLength) {
            sub=word.substring(currentLetter-1,currentLetter+(wordLength-currentLetter));
         }
         //System.out.println(sub);
         if (sub.equals("cilantro")) {
            newString+="parsley";
            currentLetter+=8;
            
         }
         if (sub!="cilantro") {
            if(currentLetter<wordLength) {
               
               newString+=word.substring(currentLetter,currentLetter+1);
               currentLetter++;
            }
         }
  
      }
      
   return newString;
   }
   public static void main(String[] args) {
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println("parsleyparsleyparsley");
   }
}
      