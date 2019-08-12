
package structure;

public class  cust_requirement
{
       private String cust_id;
       private String cname;
       private String cquantity;
       private String status;
       
      
     
       
       
        
        public cust_requirement()
        {
            this.cust_id="";
            this.cname="";
            this.cquantity="";
            this.status="";
            
            
        }

       
    public String getcust_id() 
    {
        return cust_id;
        
    }

    public void setcust_id(String cust_id) 
    {
        this.cust_id = cust_id;
    }

     public String getcname() 
        {
            return cname;
        }

    public void setcname(String cname)
    {
        this.cname = cname;
    }

        
    
    public String getcquantity() 
    {
        return cquantity;
    }

    public void setcquantity(String cquantity)
    {
        this.cquantity = cquantity;
    }

    
    public String getstatus() 
        {
            return status;
        }

    public void setstatus(String status)
    {
        this.status = status;
    }
     
    
        
        public cust_requirement(String cust_id,String cname,String cquantity,String status)
        {
            this.cust_id= cust_id;
            this.cname= cname;
            this.cquantity=cquantity;
            this.status=status;
            
            
           
            
            
        }

    @Override
    public String toString() {
        return "cust_requirement{" + "cust_id=" + cust_id + ",cname=" + cname + ",cquantity=" + cquantity + ",  status=" +  status + '}';
    }

   

}