package Assignments;

public class ConstructorsAssignment4 {

	public static void main(String[] args) {

	    s1 a = new s1(66, 78, 95);

	       System.out.println(a.getPercentage());

	       s2 b = new s2(77, 83, 59, 97);

	       System.out.println(b.getPercentage());

	}

	}

	abstract class  Mark {

	   public abstract float getPercentage();

	}

	class s1 extends Mark{

	   int marks1, marks2, marks3;

	   s1(int m1, int m2, int m3){

	       marks1=m1;

	       marks2=m2;

	       marks3=m3;

	   }

	   public float getPercentage(){

	       float total=((marks1+marks2+marks3)/(float)300)*100;

	       return total;

	   }

	}

	class s2 extends Mark{

	   int marks1, marks2, marks3, marks4;

	   s2(int m1, int m2, int m3, int m4){

	       marks1=m1;

	       marks2=m2;

	       marks3=m3;

	       marks4=m4;

	   }

	   public float getPercentage(){

	       float total=((marks1+marks2+marks3+marks4)/(float)400)*100;

	       return total;

	   }

	}

