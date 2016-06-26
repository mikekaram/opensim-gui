/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MatrixView extends MatrixBaseDouble {
  private long swigCPtr;

  protected MatrixView(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.MatrixView_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MatrixView obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_MatrixView(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MatrixView(MatrixView m) {
    this(opensimSimbodyJNI.new_MatrixView(MatrixView.getCPtr(m), m), true);
  }

}