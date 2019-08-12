
package structure;

public class  admin
{
       private String id;
       private String password;
       
     
       
       
        
        public admin()
        {
            this.id="";
            this.password="";
           
        }

       
    public String getid() 
    {
        return id;
        
    }

    public void setid(String id) 
    {
        this.id = id;
    }

     
    public String getpassword() 
    {
        return password;
    }

    public void setpassword(String password) 
    {
        this.password = password;
    }

   
        
        public admin(String id,String password)
        {
            this.id= id;
            this.password=password;
            
            
            
        }

    @Override
    public String toString() {
        return "admin{" + "id=" + id + ", password=" + password + '}';
    }

   

}