package Baby_level;

// Java program to illustrate creating
//  an array of objects

class Obj {
    public int roll_no;
    public String name;

    Obj(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class _7b_Array_Of_Objects {
    public static void main(String[] args){

        // declares an Array of Student
        Obj[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Obj[5];

        // initialize the elements of the array
        arr[0] = new Obj(1, "Aman");
        arr[1] = new Obj(2, "Vaibhav");
        arr[2] = new Obj(3, "Shikar");
        arr[3] = new Obj(4, "Dharmesh");
        arr[4] = new Obj(5, "Mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { "
                    + arr[i].roll_no + " "
                    + arr[i].name+" }");
    }
}
