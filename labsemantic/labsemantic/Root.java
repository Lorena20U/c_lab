package labsemantic;


// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
import java.util.ArrayList;


public class Root{
    public ArrayList<Block> block;
    public ArrayList<VarUsage> varUsage;
}