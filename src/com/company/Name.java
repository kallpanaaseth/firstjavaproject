package com.company;

public class Name {   //name of Class is Name, PUBLIC IS called a ACCESS PACIFIERS
// here you have the main function
    public static void main(String[] args) {  //this is  function of name "main" this is called when program starts

        //Object seth = null; //define variable seth of type object and then set it to null

        String firstname = "kalpana";//defining a variable firstname of type String and assign String "kalpana" to it
        String lastname = "seth";
        //System.out.println(getName(firstname, lastname));
        Name name1 = new Name("Luis","Deleon");// Name(class name) can also be at the same time Object
        Name name2 = new Name("Carlos", "Chicas");//all classes in Java are derived from Object
        Name name3= new Name(firstname , lastname);//calling the constructor new Name with the variables firstname and lastname and assign to name 3(Object of type Name)
        System.out.println(Name.MISTER + " " + name1.getName());
        System.out.println(name2.toString());
        System.out.println(Name.MISTER + " " + name2.getName());
        System.out.println(Name.MISS + " " + name3.getName());
        System.out.println("HelloWorld");
    }
     //here starts the definition of the class
    public String getName() {  //function is like a recipe (series of steps)
        // we try to put the actions and the information on the same place
        return firstname + " " + lastname; //joining  3 Strings firstname space and lastname

    }
    String firstname;//we are defining 2 variables of type String.These 2 will be created for every Object we create of type Name
    //if these were static there will only be 2 variables in the whole program no matter how many Objects
    String lastname;
   static String MISTER = "MISTER";//there is only 1 variable name.MISTER
   static String MISS = "MISS";

    public Name (String sfirstname , String slastname)// CONSTRUCTOR
    {
    this.firstname = sfirstname;//this is used to set the fields of the Objects
    this.lastname = slastname;
    }
}

