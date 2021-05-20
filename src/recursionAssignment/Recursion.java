 package recursionAssignment;

public class Recursion{

  //problem set 1
  public static int count7 (int n){ 
    if (n < 7) {
      return 0; 
    }

    else if (n % 10 == 7){ 
      return 1 + count7(n / 10); 
    }

    else { 
      return count7(n / 10); 
    } 
  }

    //problem set 2
  public static String changePi(String str){ 
    
    if (str.equals("")){ 
      return str; 
    }
    else if (str.charAt(0) == 'p' && str.charAt(1) == 'i'){ 
      String str2 = ""; 
      str2 = str.substring(0,0) +"3.14"+ changePi(str.substring(2));
      return str2;
    }
    else {
      return str.charAt(0) + changePi(str.substring(1));
    }
  }

}
