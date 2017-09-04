package edu.ap.rest;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import edu.ap.xml.*;

public class BestellingResource extends ServerResource{
	
	@Post("txt")
	public String getBestellingen() {
		XML parser = new XML();
		return parser.getBestellingen();
	}
	
	@Get("html")
	public String addBestelling(String xml){
		XML parser = new XML();
		return parser.addBestelling(xml);
	}
	

}
