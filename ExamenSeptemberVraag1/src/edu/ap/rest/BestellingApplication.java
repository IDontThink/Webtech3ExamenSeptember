package edu.ap.rest;

import org.restlet.*;
import org.restlet.Application;
import org.restlet.routing.*;

public class BestellingApplication extends Application {

	@Override
	public synchronized Restlet createInboundRoot(){
		Router router = new Router(getContext());		
		router.attach("/bestelling", BestellingResource.class);
		return router;
	}
}
