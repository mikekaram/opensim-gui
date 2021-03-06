/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MocoSumSquaredStateGoal extends MocoGoal {
  private transient long swigCPtr;

  public MocoSumSquaredStateGoal(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.MocoSumSquaredStateGoal_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MocoSumSquaredStateGoal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimMocoJNI.delete_MocoSumSquaredStateGoal(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MocoSumSquaredStateGoal safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.MocoSumSquaredStateGoal_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MocoSumSquaredStateGoal(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.MocoSumSquaredStateGoal_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.MocoSumSquaredStateGoal_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.MocoSumSquaredStateGoal_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MocoSumSquaredStateGoal(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.MocoSumSquaredStateGoal_getConcreteClassName(swigCPtr, this);
  }

  public MocoSumSquaredStateGoal() {
    this(opensimMocoJNI.new_MocoSumSquaredStateGoal__SWIG_0(), true);
  }

  public MocoSumSquaredStateGoal(String name) {
    this(opensimMocoJNI.new_MocoSumSquaredStateGoal__SWIG_1(name), true);
  }

  public MocoSumSquaredStateGoal(String name, double weight) {
    this(opensimMocoJNI.new_MocoSumSquaredStateGoal__SWIG_2(name, weight), true);
  }

  public void setWeightSet(MocoWeightSet weightSet) {
    opensimMocoJNI.MocoSumSquaredStateGoal_setWeightSet(swigCPtr, this, MocoWeightSet.getCPtr(weightSet), weightSet);
  }

  public void setWeightForState(String stateName, double weight) {
    opensimMocoJNI.MocoSumSquaredStateGoal_setWeightForState(swigCPtr, this, stateName, weight);
  }

  public void setPattern(String pattern) {
    opensimMocoJNI.MocoSumSquaredStateGoal_setPattern(swigCPtr, this, pattern);
  }

  public void clearPattern() {
    opensimMocoJNI.MocoSumSquaredStateGoal_clearPattern(swigCPtr, this);
  }

  public String getPattern() {
    return opensimMocoJNI.MocoSumSquaredStateGoal_getPattern(swigCPtr, this);
  }

}
