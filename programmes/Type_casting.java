package programmes;

public class Type_casting {
    public static void main (String[] args){
        int myNum = 9;
        double myDouble = myNum;
        //Autoamtic casting : int to double 
        System.out.println(myNum);
        System.out.println(myDouble);

        double mydouble = 9.352;
        int mynum = (int)myDouble;
        //manual casting : double to int
        System.out.println(mydouble);
        System.out.println(mynum);

    }

    
}
/* Java Type Casting
Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte */