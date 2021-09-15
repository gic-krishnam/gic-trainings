package JSONPROJECT;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.InputStream;

	import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
	import com.fasterxml.jackson.databind.JsonNode;
	import com.fasterxml.jackson.databind.ObjectMapper;
	import com.fasterxml.jackson.databind.ObjectWriter;
	import com.fasterxml.jackson.databind.node.ArrayNode;
	public class ReadJson {
		    public static void main(String[] args) throws Exception {
		    	try {
		    	InputStream in=new FileInputStream("C:\\Users\\Krishnam\\Downloads\\InputJson.json");
				int i=0;
				String s="";
				while ((i=in.read())!=-1) {
					System.out.print((char)i);
					s+=(char)i;
					
				}
			      ObjectMapper mapper = new ObjectMapper();
			      String fetch=null;
			      JsonNode node=mapper.readTree(s);
			      System.out.println(node);
			      ArrayNode arrayNode = (ArrayNode) mapper.readTree(s).get("data");
			      if(arrayNode.isArray()) {
			         for(JsonNode jsonNode : arrayNode) {
			            System.out.println("123::: "+jsonNode.get("taskSpecs"));
			            fetch=jsonNode.get("taskSpecs").toString();
			            
			           
			         }
			     
		String objJson="";
		objJson+="\"multiEngineResults\": {\"suspectResult\": \"\",\"cbvutvi4vResult\": \" \", \"wellknownResult\": \" \",\"uniqueResult\": \"\"}";
		JsonNode node2=new ObjectMapper().readTree(objJson);
		
				         ObjectMapper mapper1 = new ObjectMapper();
						 ObjectWriter writer = mapper1.writer(new DefaultPrettyPrinter());
						 writer.writeValue(new File("C:\\Users\\Krishnam\\Downloads\\Output.Json"), node2);
						 System.out.println("JSON string write to a file successfully");
					   
					System.out.println("12357::: "+node2);
				
			
		    	
			      }	
		    	in.close();
		    }catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
