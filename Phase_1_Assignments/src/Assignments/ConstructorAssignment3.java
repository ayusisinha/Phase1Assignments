package Assignments;

public class ConstructorAssignment3 {

	    public static void main(String[] args) {
	        Student s1 = new Student("S1", 22, 'A', 'M', 40, 70, 40);
	        s1.getTotalMarksAndPercentage();

	        Student s2 = new Student("S2", 22, 'B', 'F', 67, 89);
	        s2.getTotalMarksAndPercentage();

	        Student s3 = new Student("S3", 22, 'C', 'M', 69, 69);
	        s3.getTotalMarksAndPercentage();

	        Student s4 = new Student("S4", 22, 'D', 'F', 50, 60, 78);
	        s4.getTotalMarksAndPercentage();
	    }
	}

	class Student {
	    private final String name;
	    private final int age;
	    private final char section;
	    private final char gender;
	    private int subject1Marks = 0;
	    private int subject2Marks = 0;
	    private int subject3Marks = 0;

	    public Student(String name, int age, char section, char gender, int subject1Marks, int subject2Marks, int subject3Marks) {
	        this.name = name;
	        this.age = age;
	        this.section = section;
	        this.gender = gender;
	        this.subject1Marks = subject1Marks;
	        this.subject2Marks = subject2Marks;
	        this.subject3Marks = subject3Marks;
	    }

	    public Student(String name, int age, char section, char gender, int subject2Marks, int subject3Marks) {
	        this.name = name;
	        this.age = age;
	        this.section = section;
	        this.gender = gender;
	        this.subject2Marks = subject2Marks;
	        this.subject3Marks = subject3Marks;
	    }

	    public void getTotalMarksAndPercentage() {
	        int marksScored = subject1Marks + subject2Marks + subject3Marks;
	        int percentage = (marksScored * 100) / 300;

	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Section: " + section);
	        System.out.println("Gender: " + gender);
	        System.out.println("Total Marks Scored: " + marksScored);
	        System.out.println("Percentage: " + percentage);
	        System.out.println();
	    }
	}