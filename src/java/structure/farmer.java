
package structure;

public class  farmer
{
       private String fid;
       private String fname;
       private String flast;
       private String faddress;
       private String fpassword;
       private String fcontact;
     
       
       
        
        public farmer()
        {
            this.fid="";
            this.fname="";
            this.flast="";
            this.faddress="";
            this.fpassword="";
            this.fcontact="";
        }

       
    public String getfid() 
    {
        return fid;
        
    }

    public void setfid(String fid) 
    {
        this.fid = fid;
    }

     public String getfname() 
        {
            return fname;
        }

    public void setfname(String fname)
    {
        this.fname = fname;
    }

        
    
    public String getflast() 
    {
        return flast;
    }

    public void setflast(String flast)
    {
        this.flast = flast;
    }

     public String getfaddress() 
     {
        return faddress;
    }

    public void setfaddress(String faddress)
    {
        this.faddress = faddress;
    }
    
    public String getfpassword() 
    {
        return fpassword;
    }

    public void setfpassword(String fpassword) 
    {
        this.fpassword = fpassword;
    }

   
    public String getfcontact()
    {
        return fcontact;
    }

    public void setfcontact(String fcontact)
    {
        this.fcontact = fcontact;
    }
        
        public farmer(String fid,String fname,String flast,String faddress,String fpassword,String fcontact)
        {
            this.fid= fid;
            this.fname= fname;
            this.flast=flast;
            this.faddress= faddress;
            this.fpassword=fpassword;
            this.fcontact=fcontact;
            
            
        }

    @Override
    public String toString() {
        return "farmer{" + "fid=" + fid + ",fname=" + fname + ", flast=" + flast + ", faddress=" + faddress + ", fpassword=" + fpassword + ", fcontact=" + fcontact + '}';
    }

   

}