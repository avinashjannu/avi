
package structure;

public class  crop
{   
    
       private String farmerid;
       private String crq_id;
       private String crname;
       private String crquantity;
       private String cramount;
       private String status;

      
     
       
       
        
        public crop()
        {
            this.farmerid="";
            this.crq_id="";
            this.crname="";
            this.crquantity="";
            this.cramount="";
            this.status="";
            
        }

    public String getfarmerid() 
    {
        return farmerid;
        
    }

    public void setfarmerid(String farmerid) 
    {
        this.farmerid = farmerid;
    } 
        
    public String getcrq_id() 
    {
        return crq_id;
        
    }

    public void setcrq_id(String crq_id) 
    {
        this.crq_id = crq_id;
    }

     public String getcrname() 
        {
            return crname;
        }

    public void setcrname(String crname)
    {
        this.crname = crname;
    }

        
    
    public String getcrquantity() 
    {
        return crquantity;
    }

    public void setcrquantity(String crquantity)
    {
        this.crquantity = crquantity;
    }

     public String getcramount() 
     {
        return cramount;
    }

    public void setcramount(String cramount)
    {
        this.cramount = cramount;
    }
 
     public String getstatus() 
        {
            return status;
        }

    public void setstatus(String status)
    {
        this.status = status;
    }
   
    
        
        public crop(String farmerid,String crq_id,String crname,String crquantity,String cramount,String status)
        {
            this.farmerid= farmerid;
            this.crq_id= crq_id;
            this.crname= crname;
            this.crquantity=crquantity;
            this.cramount= cramount;
            this.status=status;
           
            
            
        }

    @Override
    public String toString() {
        return "crop{" + "farmerid=" + farmerid + ",crq_id=" + crq_id + ",crname=" + crname + ", crquantity=" + crquantity + ", cramount=" + cramount + " , status=" +  status + '}';
    }

   

}