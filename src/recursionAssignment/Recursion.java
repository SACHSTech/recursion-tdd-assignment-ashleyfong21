package recursionAssignment;

public class Recursion{

  /**
   * Problem Set 1
   *
   * Given a non-negative int n, return the count of the occurrences of 7 as a digit
   *
   * @param n The value that is being checked 
   * @return the number of times 7 occurs 
   * @author A. Fong
   * 
   */
  public static int count7 (int n) { 
    
    //if n < 7, return 0
    if (n < 7) {
      return 0; 
    }

    //if the right most number is 7, return 1 and the number of times 7 occurs in the rest of the input 
    else if (n % 10 == 7) { 
      return 1 + count7 (n / 10); 
    }

    //if the right digit is not 7, return the number of 7s in the rest of the input 
    else { 
      return count7 (n / 10); 
    } 
  }

  /**
   * Problem Set 2
   *
   * Given a string, compute a new string where all appearances of "pi" have been replaced by "3.14"
   *
   * @param str The string that is being changed  
   * @return str but every occurance of pi is replaced with 3.14 
   * @author A. Fong
   * 
   */
  public static String changePi(String str){ 
    
    //if the length of str is less than 2, return str
    if (str.length() < 2){ 
      return str; 
    }

    //if letters p and i are beside each other, replace it with 3.14 and continue with the rest of the string
    else if (str.charAt(0) == 'p' && str.charAt(1) == 'i') { 
      return str.substring(0,0) + "3.14" + changePi(str.substring(2));
    }

    //if the letters p and i are not beside each other, call the rest of the string 
    else {
      return str.charAt(0) + changePi(str.substring(1));
    }
  }

  /**
   * Problem Set 3
   *
   * Given a string, return a "cleaned" string where adjacent chars that are the same have been reduced to a single char 
   *
   * @param str The string that is being reduced 
   * @return str but every occurance of adjacent chars that are the same is reduced to one 
   * @author A. Fong
   * 
   */
  public static String stringClean (String str) { 
    
    //if the length of str is less than/equal to 1, return str
    if (str.length() <= 1){
      return str; 
    }

    //if the first character is equal to the second character, return str without the first character 
    else if (str.charAt(0) == str.charAt(1)) { 
      return stringClean(str.substring(1)); 
    }
    
    //if the first and second character are not the same, call the rest of the string 
    else {
      return str.charAt(0) + stringClean(str.substring(1)); 
    }
  }

}
