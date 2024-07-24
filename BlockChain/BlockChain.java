import java.util.ArrayList;

public class BlockChain{
    ArrayList<Block> chain ;
    public BlockChain() {
        chain =  new ArrayList<Block>();
        Block genesisBlock = new Block("Franklin", "Ngongang");
        genesisBlock.setBlockID("0");
        chain.add(genesisBlock) ;
    }

    public void addBlock(Block newBlock){
        if (newBlock == null ) 
            return ;

        newBlock.setPreviousHash(chain.get(chain.size()-1).getHash());
        chain.add(newBlock);


    }

    public String toString() {
        String s = "";
        Block b ;
        for(int q=0 ; q < chain.size(); q++) {
            b = chain.get(q) ;
            s += b.toString();
            s += "\n";

        }
        return s ;
    }

    public boolean chainIsValid(){
        for(int x=chain.size()-1; x >0 ; x--) {
            Block bend = chain.get(x);
            Block bfront = chain.get(x-1) ;
            if (bend.getPreviousHash() != bfront.getHash())
                return false ;

        } ;
        return true ;
    } 

    public static void main(String[] args) {

        BlockChain bc = new BlockChain();
        Block b1 = new Block("Pratyush", "S.");
        
        Block b10 = new Block("Scarlett", "C.");

        Block b2 = new Block("David", "B.");
        Block b3 = new Block("Caitlin", "C.");
        bc.addBlock(b1);
        if (!bc.chainIsValid())
            System.out.println("Chain is not valid");
        bc.addBlock(b10);
        if (!bc.chainIsValid())
            System.out.println("Chain is not valid");
        bc.addBlock(b2);
        if (!bc.chainIsValid())
            System.out.println("Chain is not valid");
        bc.addBlock(b3);
        if (!bc.chainIsValid())
            System.out.println("Chain is not valid");

        System.out.println(bc);

    }
}