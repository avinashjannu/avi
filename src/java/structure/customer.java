
package structure;

public class  customer
{
       private String id;
       private String name;
       private String last;
       private String address;
       private String password;
       private String contact;
     
       
       
        
        public customer()
        {
            this.id="";
            this.name="";
            this.last="";
            this.address="";
            this.password="";
            this.contact="";
        }

       
    public String getName() 
    {
        return id;
        
    }

    public void setName(String id) 
    {
        this.id = id;
    }

     public String getname() 
        {
            return name;
        }

    public void setname(String name)
    {
        this.name = name;
    }

        
    
    public String getLast() 
    {
        return last;
    }

    public void setLast(String last)
    {
        this.last = last;
    }

     public String getAddress() 
     {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

   
    public String getContact()
    {
        return contact;
    }

    public void setContact(String contact)
    {
        this.contact = contact;
    }
        
        public customer(String id,String name,String last,String address,String password,String contact)
        {
            this.id= id;
            this.name= name;
            this.last=last;
            this.address= address;
            this.password=password;
            this.contact=contact;
            
            
        }

    @Override
    public String toString() {
        return "customer{" + "id=" + id + ",name=" + name + ", last=" + last + ", address=" + address + ", password=" + password + ", contact=" + contact + '}';
    }

   

}