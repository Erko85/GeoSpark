/*
 * 
 */
package org.datasyslab.geospark.utils;

import com.vividsolutions.jts.geom.Polygon;

import java.io.Serializable;
import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * Created by jinxuanw on 9/29/15.
 */
public class PolygonXMinComparator extends GemotryComparator implements Comparator<Polygon>, Serializable
{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Polygon polygon1, Polygon polygon2) {
	    if(polygon1.getEnvelopeInternal().getMinX()>polygon2.getEnvelopeInternal().getMinX())
	    {
	    	return 1;
	    }
	    else if (polygon1.getEnvelopeInternal().getMinX()<polygon2.getEnvelopeInternal().getMinX())
	    {
	    	return -1;
	    }
	    else return 0;
	    }
}
