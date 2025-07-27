package p1;

import java.io.PrintWriter;

public class main2 {
    //try with resources
    //combination of try and finally block

    //autocloseable interface: the object of that class is need to be close after job is done
    public static void main(String[] args) {

        try( PrintWriter pw = new PrintWriter("src/Hemantxception.txt");) {
            pw.write("hemant is learning java");
        }
        catch(Exception exception){
            System.out.println("inside the catch block");
        }finally{
         //there is no need to write finally block here
            // try with resources will handle it

            //if we have backend of an application, and 1000 users use the backend application at a same time
            //and for every database operation , we are creating a database connection in terms of cun-currency 1000 of
            // database connection can be instantiated at once when the load is coming on backend ,which will over run the database
            // and database failed, therefor backend creats only one instance of database connection for  one request that is called
            // database bin and therefor maintain the connection until request is ful-filled
        }
    }
}
