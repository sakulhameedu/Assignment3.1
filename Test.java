//Given programme

public class Test{
static{               //Incorrect declaration of main method 
print(10);            //  passing agrugement 10 to Print method
}
static void print (int x) {        
System.out.println (x);   //print value passed in argument
System.exit(0);
}
}

//Out put returned: Option B  Will throw a NoSuchMethod error at runtime.
//error :  Will throw a NoSuchMethod error at runtime.


//Corrected programme 
//Given programme

public class Test{
public static void main(String[] args){               //COrrect  declaration of main method 
print(10);            //  passing agrugement 10 to Print method
}
static void print (int x) {        
System.out.println (x);   //print value passed in argument
System.exit(0);
}
}

//OUtput: 10
