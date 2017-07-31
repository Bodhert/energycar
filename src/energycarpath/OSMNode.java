/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energycarpath;

import java.util.Map;

/**
 *
 * @author alejo
 */
public class OSMNode 
{
        private String id;
	
	private String lat;
	
	private String lon;
	
	private final Map<String, String> tags;

	private String version;
        
        OSMNode(String id,String latitude,String longitude,String version, Map<String, String> tags)
        {
            this.id = id;
            this.lat = latitude;
            this.lon = longitude;
            this.version = version;
            this.tags = tags;
        }
        
        public String getId()
        {
            return this.id;
        }
        
        
        public String getLat()
        {
            return this.lat;
        }
        
        public String getLon()
        {
            return this.lon;
        }
        
        public Map<String, String> getMap()
        {
            return this.tags;
        }
        
        public String getVersion()
        {
            return this.version;
        }
        
        public void  setId(String id)
        {
            this.id = id;
        }
        
        public void setLat(String lat)
        {
            this.lat = lat;
        }
        
        public void setLon(String lon)
        {
            this.lon = lon;
        }
        
        public void setVersion(String version)
        {
            this.version = version;
        }
        
}
