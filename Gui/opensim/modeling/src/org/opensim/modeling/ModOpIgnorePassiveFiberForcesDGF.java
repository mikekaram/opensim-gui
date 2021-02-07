/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModOpIgnorePassiveFiberForcesDGF extends ModelOperator {
  private transient long swigCPtr;

  public ModOpIgnorePassiveFiberForcesDGF(long cPtr, boolean cMemoryOwn) {
    super(opensimMocoJNI.ModOpIgnorePassiveFiberForcesDGF_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModOpIgnorePassiveFiberForcesDGF obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimMocoJNI.delete_ModOpIgnorePassiveFiberForcesDGF(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModOpIgnorePassiveFiberForcesDGF safeDownCast(OpenSimObject obj) {
    long cPtr = opensimMocoJNI.ModOpIgnorePassiveFiberForcesDGF_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModOpIgnorePassiveFiberForcesDGF(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimMocoJNI.ModOpIgnorePassiveFiberForcesDGF_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimMocoJNI.ModOpIgnorePassiveFiberForcesDGF_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimMocoJNI.ModOpIgnorePassiveFiberForcesDGF_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModOpIgnorePassiveFiberForcesDGF(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimMocoJNI.ModOpIgnorePassiveFiberForcesDGF_getConcreteClassName(swigCPtr, this);
  }

  public void operate(Model model, String arg1) {
    opensimMocoJNI.ModOpIgnorePassiveFiberForcesDGF_operate(swigCPtr, this, Model.getCPtr(model), model, arg1);
  }

  public ModOpIgnorePassiveFiberForcesDGF() {
    this(opensimMocoJNI.new_ModOpIgnorePassiveFiberForcesDGF(), true);
  }

}