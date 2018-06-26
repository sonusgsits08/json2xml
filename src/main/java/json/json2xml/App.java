package json.json2xml;

import org.json.JSONObject;
import org.json.XML;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String str = "{'name':'JSON','integer':1,'double':2.0,'boolean':true,'nested':{'id':42},'array':[1,2,3]}";          
        
        
        JSONObject json = new JSONObject(str);
        String xml = XML.toString(json);
        
        System.out.println("xml is "+xml);
        
        
        
    }
}
