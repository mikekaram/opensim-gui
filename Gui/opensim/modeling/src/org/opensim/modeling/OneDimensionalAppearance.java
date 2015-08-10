/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class OneDimensionalAppearance extends Appearance {
  private long swigCPtr;

  public OneDimensionalAppearance(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.OneDimensionalAppearance_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(OneDimensionalAppearance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_OneDimensionalAppearance(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static OneDimensionalAppearance safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.OneDimensionalAppearance_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new OneDimensionalAppearance(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.OneDimensionalAppearance_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.OneDimensionalAppearance_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.OneDimensionalAppearance_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new OneDimensionalAppearance(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.OneDimensionalAppearance_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_thickness(OneDimensionalAppearance source) {
    opensimModelJNI.OneDimensionalAppearance_copyProperty_thickness(swigCPtr, this, OneDimensionalAppearance.getCPtr(source), source);
  }

  public double get_thickness(int i) {
    return opensimModelJNI.OneDimensionalAppearance_get_thickness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_thickness(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.OneDimensionalAppearance_upd_thickness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_thickness(int i, double value) {
    opensimModelJNI.OneDimensionalAppearance_set_thickness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_thickness(double value) {
    return opensimModelJNI.OneDimensionalAppearance_append_thickness(swigCPtr, this, value);
  }

  public void constructProperty_thickness(double initValue) {
    opensimModelJNI.OneDimensionalAppearance_constructProperty_thickness(swigCPtr, this, initValue);
  }

  public double get_thickness() {
    return opensimModelJNI.OneDimensionalAppearance_get_thickness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_thickness() {
    return new SWIGTYPE_p_double(opensimModelJNI.OneDimensionalAppearance_upd_thickness__SWIG_1(swigCPtr, this), false);
  }

  public void set_thickness(double value) {
    opensimModelJNI.OneDimensionalAppearance_set_thickness__SWIG_1(swigCPtr, this, value);
  }

  public OneDimensionalAppearance() {
    this(opensimModelJNI.new_OneDimensionalAppearance(), true);
  }

}
