/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MocoFinalTimeGoal extends MocoGoal {
  private transient long swigCPtr;

  public MocoFinalTimeGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoFinalTimeGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoFinalTimeGoal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimMocoJNI.delete_MocoFinalTimeGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoFinalTimeGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoFinalTimeGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoFinalTimeGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoFinalTimeGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoFinalTimeGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoFinalTimeGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoFinalTimeGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoFinalTimeGoal_getConcreteClassName(swigCPtr, this);
  }

  public MocoFinalTimeGoal() {
    this(opensimMocoJNI.new_MocoFinalTimeGoal__SWIG_0(), true);
  }

  public MocoFinalTimeGoal(String name) {
    this(opensimMocoJNI.new_MocoFinalTimeGoal__SWIG_1(name), true);
  }

  public MocoFinalTimeGoal(String name, double weight) {
    this(opensimMocoJNI.new_MocoFinalTimeGoal__SWIG_2(name, weight), true);
  }

}
