package structure;

public class  bill
{
       private String bid ;
       private String crname;
        private String fid ;
         private String cust_id ;
       private String quantity;
       private String amount;
       
      
     
       
       
        
        public bill()
        {
            this.bid="";
            this.crname="";
            this.fid="";
            this.cust_id="";
            this.quantity="";
            this.amount="";
            
            
        }

       
    public String getbid() 
    {
        return bid;
        
    }

    public void setbid(String bid) 
    {
        this.bid = bid;
    }

     public String getcrname() 
        {
            return crname;
        }

    public void setcrname(String crname)
    {
        this.crname = crname;
    }

    
     public String getfid() 
    {
        return fid;
        
    }

    public void setfid(String fid) 
    {
        this.fid = fid;
    }

     public String getcust_id() 
    {
        return cust_id;
        
    }

    public void setcust_id(String cust_id) 
    {
        this.cust_id = cust_id;
    }

     
    public String getquantity() 
    {
        return quantity;
    }

    public void setquantity(String quantity)
    {
        this.quantity = quantity;
    }

     public String getamount() 
     {
        return amount;
    }

    public void setamount(String amount)
    {
        this.amount = amount;
    }
    
    
        
        public bill(String bid,String crname,String fid,String cust_id,String quantity,String amount)
        {
            this.bid= bid;
            this.crname= crname;
            this.fid= fid;
            this.cust_id= cust_id;
            this.quantity=quantity;
            this.amount= amount;
            
           
            
            
        }

    @Override
    public String toString() {
        return "bill{" + "bid=" + bid + ",crname=" + crname + ", fid=" + fid + ",cust_id=" + cust_id + ",quantity=" + quantity + ",  amount=" +  amount + '}';
    }

   

}