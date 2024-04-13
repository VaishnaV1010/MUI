class Employee {
    private int age;

    public void setAge(int age) {
        
        if (age>100) 
        {
            this.age=100;   
        }
        else if (age<0) 
        {
            this.age=0;
        }
        else
        {
            this.age = age;
        }
            
    }

    public int getAge()
    {
        return age;
    }

    
}
class Main
{
    public static void main(String[] args) 
    {
        Employee obj=new Employee();
        
        obj.setAge(200);
        int x=obj.getAge();
        System.out.println("The age of employee is:"+" "+x);
    }
}
