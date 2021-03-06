package cs4620.ray1.camera;

import cs4620.ray1.Ray;
import egl.math.Vector3d;

/**
 * Represents a camera with perspective view. For this camera, the view window
 * corresponds to a rectangle on a plane perpendicular to viewDir but at
 * distance projDistance from viewPoint in the direction of viewDir. A ray with
 * its origin at viewPoint going in the direction of viewDir should intersect
 * the center of the image plane. Given u and v, you should compute a point on
 * the rectangle corresponding to (u,v), and create a ray from viewPoint that
 * passes through the computed point.
 */
public class PerspectiveCamera extends Camera {

    protected double projDistance = 1.0;

    public void setprojDistance(double projDistance) {
        this.projDistance = projDistance;
    }

    /*
     * Derived values that are computed before ray generation. basisU, basisV,
     * and basisW form an orthonormal basis. basisW is parallel to projNormal.
     */
    protected final Vector3d basisU = new Vector3d();
    protected final Vector3d basisV = new Vector3d();
    protected final Vector3d basisW = new Vector3d();
    protected final Vector3d centerDir = new Vector3d();

    // Has the view been initialized?
    protected boolean initialized = false;

    /**
     * Initialize the derived view variables to prepare for using the camera.
     */
    public void initView() {
        // TODO#A2: Fill in this function.
        // 1) Set basisU, basisV, basisW to be the 3 basis vectors,
        // based on viewDir and viewUp
        
        initialized = true;
    }

    /**
     * Set outRay to be a ray from the camera through a point in the image.
     *
     * @param outRay The output ray (not normalized)
     * @param inU The u coord of the image point (range [0,1])
     * @param inV The v coord of the image point (range [0,1])
     */
    public void getRay(Ray outRay, double inU, double inV) {
        // TODO#A2: Fill in this function.
        // 1) If the view is not yet initialized, initialize it.
        // 2) Transform inU so that it lies between [-viewWidth / 2, +viewWidth / 2] 
        //    instead of [0, 1]. Similarly, transform inV so that its range is
        //    [-vieHeight / 2, +viewHeight / 2]
        // 3) Set the origin field of outRay for a perspective camera.
        // 4) Set the direction field of outRay for an orthographic camera. This
        //    should depend on your transformed inU and inV and basisU and basisV,
        //    as well as the projection distance.
    }
}