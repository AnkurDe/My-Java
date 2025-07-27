package Baby_level;

// Java program to illustrate creating
//  an array of objects

public class _7c_Array_Of_Objects_2{

    private static class Student{
        public String name;

        Student(String name){
            this.name = name;
        }

        @Override
        public String toString(){
            return name;
        }
    }

// SOMETHING WRONG HERE

    public static void main (String[] args){

        // declares an Array and initializing the
        // elements of the array


        Student[] myStudents = new Student[]{
                new Student("Dharma"),new Student("sanvi"),
                new Student("Rupa"),new Student("Ajay")
        };

        // accessing the elements of the specified array
        for(Student m:myStudents){
            System.out.println(m);
        }
    }
}
