/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetMarkers extends SetMarkers {
  private long swigCPtr;

  public ModelComponentSetMarkers(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ModelComponentSetMarkers_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetMarkers obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ModelComponentSetMarkers(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetMarkers safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ModelComponentSetMarkers_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetMarkers(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ModelComponentSetMarkers_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ModelComponentSetMarkers_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ModelComponentSetMarkers_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetMarkers(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ModelComponentSetMarkers_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetMarkers() {
    this(opensimModelJNI.new_ModelComponentSetMarkers__SWIG_0(), true);
  }

  public ModelComponentSetMarkers(Model model) {
    this(opensimModelJNI.new_ModelComponentSetMarkers__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetMarkers(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_ModelComponentSetMarkers__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetMarkers(Model model, String fileName) {
    this(opensimModelJNI.new_ModelComponentSetMarkers__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetMarkers(ModelComponentSetMarkers source) {
    this(opensimModelJNI.new_ModelComponentSetMarkers__SWIG_4(ModelComponentSetMarkers.getCPtr(source), source), true);
  }

  public boolean insert(int aIndex, Marker aObject) {
    return opensimModelJNI.ModelComponentSetMarkers_insert(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, Marker aObject, boolean preserveGroups) {
    return opensimModelJNI.ModelComponentSetMarkers_set__SWIG_0(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Marker aObject) {
    return opensimModelJNI.ModelComponentSetMarkers_set__SWIG_1(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimModelJNI.ModelComponentSetMarkers_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeInitStateFromProperties(State state) {
    opensimModelJNI.ModelComponentSetMarkers_invokeInitStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeSetPropertiesFromState(State state) {
    opensimModelJNI.ModelComponentSetMarkers_invokeSetPropertiesFromState(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelJNI.ModelComponentSetMarkers_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}