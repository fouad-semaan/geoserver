/* (c) 2015 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.wms.topojson;

import com.vividsolutions.jts.geom.Envelope;
import com.vividsolutions.jts.geom.LineString;
import java.awt.geom.AffineTransform;
import java.util.List;
import java.util.Map;
import org.geoserver.wms.topojson.TopoGeom.GeometryColleciton;

public class Topology {

    private List<LineString> arcs;

    private AffineTransform screenToWorld;

    private Envelope envelope;

    private Map<String, GeometryColleciton> layers;

    public Topology(
            AffineTransform screenToWorld,
            List<LineString> arcs,
            Map<String, TopoGeom.GeometryColleciton> layers) {

        this.screenToWorld = screenToWorld;
        this.arcs = arcs;
        this.layers = layers;
    }

    public AffineTransform getScreenToWorldTransform() {
        return screenToWorld;
    }

    public List<LineString> getArcs() {
        return arcs;
    }

    public Envelope getEnvelope() {
        return envelope;
    }

    public Map<String, TopoGeom.GeometryColleciton> getLayers() {
        return layers;
    }
}
