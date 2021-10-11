package com.example.demo;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import com.openhtmltopdf.bidi.support.ICUBidiReorderer;
import com.openhtmltopdf.bidi.support.ICUBidiSplitter;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;

import freemarker.template.Configuration;

public class tesat1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String body="";
		Writer out=null;
	        String html = "<!DOCTYPE html>\n" + 
	        		"<html>\n" + 
	        		"<title>HTML Tutorial</title>\n" + 
	        		"<body>\n" + 
	        		"\n" + 
	        		"<h1>This is a heading</h1>\n" + 
	        		"<p>This is a paragraph.</p>\n" + 
	        		"\n" + 
	        		"</body>\n" + 
	        		"</html>";
	        String reportFilePath="/home/vivek/Documents/abc.ftl";
	        File myFile=new File(reportFilePath);
	        System.out.println(myFile.exists());
			BufferedWriter bufferedWriter = null;
				try{
				if (!myFile.exists()) {
	                myFile.createNewFile();
	            }
	            Writer writer = new FileWriter(myFile);
	            bufferedWriter = new BufferedWriter(writer);
	            bufferedWriter.write(html);
				}
				catch(Exception e){
				}
				finally{
		            try{
		                if(bufferedWriter != null) bufferedWriter.close();
		            } catch(Exception ex){
		                 
		            }
				}
				String filePath="/home/vivek/Documents/abc.pdf";
				Map<String,Object> component= new HashMap<String, Object>();
				component.put("name", "vivv");
				try
		        {
					try {
					      FileWriter myWriter = new FileWriter(reportFilePath);
					      myWriter.write(html);
					      myWriter.close();
					    } catch (IOException e) {
					      e.printStackTrace();
					    }
					Configuration cfg = new Configuration();
		            freemarker.template.Template freemarkerTemplate = cfg.getTemplate(reportFilePath);
		            
		            out = new StringWriter();
		            freemarkerTemplate.process(component, out);
		            body = out.toString();
		            out.flush();
		          }
		        catch(Exception e)
		        {
		            e.printStackTrace();
		        }
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		           try  {

		   			String url = new File(filePath).toURI().toURL().toString();
		   			PdfRendererBuilder builder = new PdfRendererBuilder();
		   			builder.useUnicodeBidiSplitter(new ICUBidiSplitter.ICUBidiSplitterFactory());
		   			builder.useUnicodeBidiReorderer(new ICUBidiReorderer());
		   			builder.withHtmlContent(body, "pathforpdf");
		   			builder.withUri(url);
		   			builder.toStream(outputStream);
		   			
		   				builder.run();
		   		}
			        catch (Exception e) {
				        e.printStackTrace();
				    }
				
					/*
					 * StringBuilder sb = new StringBuilder("<body>"); sb.append(html);
					 * sb.append("</body>"); Document doc = Jsoup.parseBodyFragment(sb.toString());
					 * Element body1 = doc.body(); for(Node node: body1.childNodes()) { if(node
					 * instanceof TextNode) { TextNode tn = (TextNode) node;
					 * tn.text(tn.getWholeText().replace("\n","<br/>")); }
					 * 
					 * sb.append(Parser.unescapeEntities(node.toString(), true)); }
					 * System.out.println(sb.toString());
					 */
			//html= doc.body().unwrap().toString();
	    
	}

}
