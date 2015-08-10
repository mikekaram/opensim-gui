/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SurfaceAppearance extends Appearance {
  private long swigCPtr;

  public SurfaceAppearance(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SurfaceAppearance_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SurfaceAppearance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SurfaceAppearance(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SurfaceAppearance safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.SurfaceAppearance_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SurfaceAppearance(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.SurfaceAppearance_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.SurfaceAppearance_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.SurfaceAppearance_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SurfaceAppearance(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.SurfaceAppearance_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_texture_file(SurfaceAppearance source) {
    opensimModelJNI.SurfaceAppearance_copyProperty_texture_file(swigCPtr, this, SurfaceAppearance.getCPtr(source), source);
  }

  public String get_texture_file(int i) {
    return opensimModelJNI.SurfaceAppearance_get_texture_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_texture_file(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.SurfaceAppearance_upd_texture_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_texture_file(int i, String value) {
    opensimModelJNI.SurfaceAppearance_set_texture_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_texture_file(String value) {
    return opensimModelJNI.SurfaceAppearance_append_texture_file(swigCPtr, this, value);
  }

  public void constructProperty_texture_file() {
    opensimModelJNI.SurfaceAppearance_constructProperty_texture_file__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_texture_file(String initValue) {
    opensimModelJNI.SurfaceAppearance_constructProperty_texture_file__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_texture_file() {
    return opensimModelJNI.SurfaceAppearance_get_texture_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_texture_file() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.SurfaceAppearance_upd_texture_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_texture_file(String value) {
    opensimModelJNI.SurfaceAppearance_set_texture_file__SWIG_1(swigCPtr, this, value);
  }

  public SurfaceAppearance() {
    this(opensimModelJNI.new_SurfaceAppearance(), true);
  }

  public boolean hasTexture() {
    return opensimModelJNI.SurfaceAppearance_hasTexture(swigCPtr, this);
  }

}
