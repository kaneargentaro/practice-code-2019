public class Application {
    
    public static void main(String[] args) {
        Application Application = new Application();
        
        //===========================================
        
        int value = 7;
        System.out.println("1. Value is: " + value);
        
        Application.show(value);
        
        System.out.println("4. Value is: " + value);
        
        //===========================================
        System.out.println();
        
        Person person = new Person("Bob");
        System.out.println("1. Person is: " + person);
        
        Application.show(person);
        
        System.out.println("4. Person is: " + person);
    }
    
    public void show(int value) {
        System.out.println("2. Value is: " + value);
        
        value = 8;
        
        System.out.println("3. Value is: " + value);
    }
    
    public void show(Person person) {
        System.out.println("2. Person is: " + person);
        
        
        
        person = new Person("Mike");
        person.setName("Sue");
        
        System.out.println("3. Person is: " + person);
        
    }
    
    
}
