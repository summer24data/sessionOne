import java.util.Date;
public class Block{

    private String blockID ;
    private String firstName ;
    private String lastName ;
    private String createdAt;
    private String hash ;
    private String previousHash ;

    public Block() {
        this("","");
    }

    public Block(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname ;
        this.createdAt = (new Date()).toString();
        this.hash = "";
        this.blockID = (new String(firstName + lastName)).hashCode() + "";
        this.previousHash = "0";
        this.setHash();
    }

    public void setHash() {
        this.hash = this.createdAt.hashCode() + "";
    }
    
    public String getHash() {
        return this.hash ;
    }
    
    public String getPreviousHash() {
        return this.previousHash ;
    }

    public void setBlockID(String blockID) {
        this.blockID = blockID ;
    }

    public void setPreviousHash(String prevHash) {
        this.previousHash = prevHash ;
    }

    public String toString() {
        String r = "[" ;
        r +=  this.blockID ;
        r +=  this.hash+"-";
        r += this.firstName + "-"; 
        r += this.lastName + "-";
        r += this.createdAt + "-";
        r += this.previousHash ;
        r += "]\n" ;
        return r ;
    }
    
}