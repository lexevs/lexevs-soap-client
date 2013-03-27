## LexEVS 6.0 caCORE SOAP Client

### Building
    mvn clean install

### Usage
Example client usage:


```java
package org.LexGrid.ws;

import gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.LexEVSWSQueryImpl;
import gov.nih.nci.lexevsapi60.lexevsapi60.services.lexevsapi60Service.LexEVSWSQueryImplServiceLocator;

import org.LexGrid.concepts.Entity;

public class LexEvsSoapClientTest {
	
	/*
	 * Example client for connecting to a LexEVS 6.0 caCORE SDK
	 * SOAP Endpoint.
	 */
	public static void main(String[] args) throws Exception {
		LexEVSWSQueryImplServiceLocator locator = new LexEVSWSQueryImplServiceLocator();
		LexEVSWSQueryImpl service = locator.getlexevsapi60Service();
		
		//get caCORE SDK service version
		System.out.println("caCORE SDK Version: " + service.getVersion());	
		
		//query by example
		Entity entity = new Entity();
		entity.setEntityCode("C12727");
		Object[] result = service.queryObject(Entity.class.getName(), entity);
		Entity returnedEntity = (Entity)result[0];
		
		System.out.println("C12727 Description: " + returnedEntity.getEntityDescription().getContent());
	}

}
```
