class Employee {
    int id;
    String Name;
    float Salary;
    void insert(int i, String n, float s){
        id=i;
        Name=n;
        Salary=s;
    }
    void display(){
        System.out.println(id+" "+Name+" "+Salary);
    }
}
    public class TestEmployee{
        public static void main(String[] args) {
            Employee e1=new Employee();
            Employee e2=new Employee();
            Employee e3=new Employee();
            e1.insert(101,"Ankit kumar",45000);
            e2.insert(102,"Adarsh" ,40000);
            e3.insert(103,"anjali",50000);
            e1.display();
            e2.display();
            e3.display();

        }
    }
    
