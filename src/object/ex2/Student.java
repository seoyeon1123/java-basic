package object.ex2;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }
    public int getNo(){
        return no;
    }
    public String getName(){
        return name;
    }
    public int hashCode(){
        int hashCode = no+ name.hashCode();
        return hashCode;
    }
    public boolean equals(Object obj){
        if(obj instanceof Student student){
          if(no == student.getNo() && name.equals(student.getName())){
              return true;
          }
        }
        return false;
    }

}
