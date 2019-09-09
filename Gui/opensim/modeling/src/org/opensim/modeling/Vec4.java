/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Vec4 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Vec4(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Vec4 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_Vec4(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static int size() {
    return opensimSimbodyJNI.Vec4_size();
  }

  public static int nrow() {
    return opensimSimbodyJNI.Vec4_nrow();
  }

  public static int ncol() {
    return opensimSimbodyJNI.Vec4_ncol();
  }

  public Vec4() {
    this(opensimSimbodyJNI.new_Vec4__SWIG_0(), true);
  }

  public Vec4(Vec4 src) {
    this(opensimSimbodyJNI.new_Vec4__SWIG_1(Vec4.getCPtr(src), src), true);
  }

  public Vec4(double e) {
    this(opensimSimbodyJNI.new_Vec4__SWIG_2(e), true);
  }

  public Vec4(int i) {
    this(opensimSimbodyJNI.new_Vec4__SWIG_3(i), true);
  }

  public Vec4(double e0, double e1) {
    this(opensimSimbodyJNI.new_Vec4__SWIG_4(e0, e1), true);
  }

  public Vec4(double e0, double e1, double e2) {
    this(opensimSimbodyJNI.new_Vec4__SWIG_5(e0, e1, e2), true);
  }

  public Vec4(double e0, double e1, double e2, double e3) {
    this(opensimSimbodyJNI.new_Vec4__SWIG_6(e0, e1, e2, e3), true);
  }

  public Vec4(double e0, double e1, double e2, double e3, double e4) {
    this(opensimSimbodyJNI.new_Vec4__SWIG_7(e0, e1, e2, e3, e4), true);
  }

  public Vec4(double e0, double e1, double e2, double e3, double e4, double e5) {
    this(opensimSimbodyJNI.new_Vec4__SWIG_8(e0, e1, e2, e3, e4, e5), true);
  }

  public Vec4(double e0, double e1, double e2, double e3, double e4, double e5, double e6) {
    this(opensimSimbodyJNI.new_Vec4__SWIG_9(e0, e1, e2, e3, e4, e5, e6), true);
  }

  public Vec4(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7) {
    this(opensimSimbodyJNI.new_Vec4__SWIG_10(e0, e1, e2, e3, e4, e5, e6, e7), true);
  }

  public Vec4(double e0, double e1, double e2, double e3, double e4, double e5, double e6, double e7, double e8) {
    this(opensimSimbodyJNI.new_Vec4__SWIG_11(e0, e1, e2, e3, e4, e5, e6, e7, e8), true);
  }

  public void setToNaN() {
    opensimSimbodyJNI.Vec4_setToNaN(swigCPtr, this);
  }

  public void setToZero() {
    opensimSimbodyJNI.Vec4_setToZero(swigCPtr, this);
  }

  public boolean isNaN() {
    return opensimSimbodyJNI.Vec4_isNaN(swigCPtr, this);
  }

  public boolean isInf() {
    return opensimSimbodyJNI.Vec4_isInf(swigCPtr, this);
  }

  public boolean isFinite() {
    return opensimSimbodyJNI.Vec4_isFinite(swigCPtr, this);
  }

  public static double getDefaultTolerance() {
    return opensimSimbodyJNI.Vec4_getDefaultTolerance();
  }

  public boolean isNumericallyEqual(double e, double tol) {
    return opensimSimbodyJNI.Vec4_isNumericallyEqual__SWIG_2(swigCPtr, this, e, tol);
  }

  public boolean isNumericallyEqual(double e) {
    return opensimSimbodyJNI.Vec4_isNumericallyEqual__SWIG_3(swigCPtr, this, e);
  }

  public String toString() {
    return opensimSimbodyJNI.Vec4_toString(swigCPtr, this);
  }

  public void set(int i, double value) {
    opensimSimbodyJNI.Vec4_set(swigCPtr, this, i, value);
  }

  public double get(int i) {
    return opensimSimbodyJNI.Vec4_get(swigCPtr, this, i);
  }

  public Vec4 scalarEq(double ee) {
    return new Vec4(opensimSimbodyJNI.Vec4_scalarEq(swigCPtr, this, ee), false);
  }

  public Vec4 scalarPlusEq(double ee) {
    return new Vec4(opensimSimbodyJNI.Vec4_scalarPlusEq(swigCPtr, this, ee), false);
  }

  public Vec4 scalarMinusEq(double ee) {
    return new Vec4(opensimSimbodyJNI.Vec4_scalarMinusEq(swigCPtr, this, ee), false);
  }

  public Vec4 scalarTimesEq(double ee) {
    return new Vec4(opensimSimbodyJNI.Vec4_scalarTimesEq(swigCPtr, this, ee), false);
  }

  public Vec4 scalarDivideEq(double ee) {
    return new Vec4(opensimSimbodyJNI.Vec4_scalarDivideEq(swigCPtr, this, ee), false);
  }

}
