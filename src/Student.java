public class Student {

    private String _name;

    public void setName(String name){
        _name = name;
    }

    public void printName(){
        System.out.println("My name is " + _name);
    }

    public void sing(){
        System.out.println("Singing...");
    }

    public int calculateTotal(int num1, int num2){

        if( 9 > 4)
            return num1 + num2;

        return 6;


    }

}
