/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TabOpConvertDegreesToRadians extends TableOperator {
  private transient long swigCPtr;

  public TabOpConvertDegreesToRadians(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.TabOpConvertDegreesToRadians_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TabOpConvertDegreesToRadians obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_TabOpConvertDegreesToRadians(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TabOpConvertDegreesToRadians safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.TabOpConvertDegreesToRadians_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TabOpConvertDegreesToRadians(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.TabOpConvertDegreesToRadians_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.TabOpConvertDegreesToRadians_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.TabOpConvertDegreesToRadians_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TabOpConvertDegreesToRadians(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.TabOpConvertDegreesToRadians_getConcreteClassName(swigCPtr, this);
  }

  public TabOpConvertDegreesToRadians() {
    this(opensimSimulationJNI.new_TabOpConvertDegreesToRadians(), true);
  }

}