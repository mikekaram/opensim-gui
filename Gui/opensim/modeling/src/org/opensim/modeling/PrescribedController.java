/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PrescribedController extends Controller {
  private long swigCPtr;

  public PrescribedController(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.PrescribedController_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PrescribedController obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PrescribedController(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PrescribedController safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.PrescribedController_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PrescribedController(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.PrescribedController_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.PrescribedController_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.PrescribedController_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PrescribedController(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.PrescribedController_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_ControlFunctions(PrescribedController source) {
    opensimModelJNI.PrescribedController_copyProperty_ControlFunctions(swigCPtr, this, PrescribedController.getCPtr(source), source);
  }

  public FunctionSet get_ControlFunctions(int i) {
    return new FunctionSet(opensimModelJNI.PrescribedController_get_ControlFunctions__SWIG_0(swigCPtr, this, i), false);
  }

  public FunctionSet upd_ControlFunctions(int i) {
    return new FunctionSet(opensimModelJNI.PrescribedController_upd_ControlFunctions__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_ControlFunctions(int i, FunctionSet value) {
    opensimModelJNI.PrescribedController_set_ControlFunctions__SWIG_0(swigCPtr, this, i, FunctionSet.getCPtr(value), value);
  }

  public int append_ControlFunctions(FunctionSet value) {
    return opensimModelJNI.PrescribedController_append_ControlFunctions(swigCPtr, this, FunctionSet.getCPtr(value), value);
  }

  public void constructProperty_ControlFunctions(FunctionSet initValue) {
    opensimModelJNI.PrescribedController_constructProperty_ControlFunctions(swigCPtr, this, FunctionSet.getCPtr(initValue), initValue);
  }

  public FunctionSet get_ControlFunctions() {
    return new FunctionSet(opensimModelJNI.PrescribedController_get_ControlFunctions__SWIG_1(swigCPtr, this), false);
  }

  public FunctionSet upd_ControlFunctions() {
    return new FunctionSet(opensimModelJNI.PrescribedController_upd_ControlFunctions__SWIG_1(swigCPtr, this), false);
  }

  public void set_ControlFunctions(FunctionSet value) {
    opensimModelJNI.PrescribedController_set_ControlFunctions__SWIG_1(swigCPtr, this, FunctionSet.getCPtr(value), value);
  }

  public void copyProperty_controls_file(PrescribedController source) {
    opensimModelJNI.PrescribedController_copyProperty_controls_file(swigCPtr, this, PrescribedController.getCPtr(source), source);
  }

  public String get_controls_file(int i) {
    return opensimModelJNI.PrescribedController_get_controls_file__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_controls_file(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.PrescribedController_upd_controls_file__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_controls_file(int i, String value) {
    opensimModelJNI.PrescribedController_set_controls_file__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_controls_file(String value) {
    return opensimModelJNI.PrescribedController_append_controls_file(swigCPtr, this, value);
  }

  public void constructProperty_controls_file() {
    opensimModelJNI.PrescribedController_constructProperty_controls_file__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_controls_file(String initValue) {
    opensimModelJNI.PrescribedController_constructProperty_controls_file__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_controls_file() {
    return opensimModelJNI.PrescribedController_get_controls_file__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_controls_file() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.PrescribedController_upd_controls_file__SWIG_1(swigCPtr, this), false);
  }

  public void set_controls_file(String value) {
    opensimModelJNI.PrescribedController_set_controls_file__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_interpolation_method(PrescribedController source) {
    opensimModelJNI.PrescribedController_copyProperty_interpolation_method(swigCPtr, this, PrescribedController.getCPtr(source), source);
  }

  public int get_interpolation_method(int i) {
    return opensimModelJNI.PrescribedController_get_interpolation_method__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_int upd_interpolation_method(int i) {
    return new SWIGTYPE_p_int(opensimModelJNI.PrescribedController_upd_interpolation_method__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_interpolation_method(int i, int value) {
    opensimModelJNI.PrescribedController_set_interpolation_method__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_interpolation_method(int value) {
    return opensimModelJNI.PrescribedController_append_interpolation_method(swigCPtr, this, value);
  }

  public void constructProperty_interpolation_method() {
    opensimModelJNI.PrescribedController_constructProperty_interpolation_method__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_interpolation_method(int initValue) {
    opensimModelJNI.PrescribedController_constructProperty_interpolation_method__SWIG_1(swigCPtr, this, initValue);
  }

  public int get_interpolation_method() {
    return opensimModelJNI.PrescribedController_get_interpolation_method__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_int upd_interpolation_method() {
    return new SWIGTYPE_p_int(opensimModelJNI.PrescribedController_upd_interpolation_method__SWIG_1(swigCPtr, this), false);
  }

  public void set_interpolation_method(int value) {
    opensimModelJNI.PrescribedController_set_interpolation_method__SWIG_1(swigCPtr, this, value);
  }

  public PrescribedController() {
    this(opensimModelJNI.new_PrescribedController__SWIG_0(), true);
  }

  public PrescribedController(String controlsFileName, int interpMethodType) {
    this(opensimModelJNI.new_PrescribedController__SWIG_1(controlsFileName, interpMethodType), true);
  }

  public PrescribedController(String controlsFileName) {
    this(opensimModelJNI.new_PrescribedController__SWIG_2(controlsFileName), true);
  }

  public void computeControls(State s, Vector controls) {
    opensimModelJNI.PrescribedController_computeControls(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(controls), controls);
  }

  public void prescribeControlForActuator(int index, Function prescribedFunction) {
    opensimModelJNI.PrescribedController_prescribeControlForActuator__SWIG_0(swigCPtr, this, index, Function.getCPtr(prescribedFunction), prescribedFunction);
    prescribedFunction.markAdopted();
  }

  public void prescribeControlForActuator(String actName, Function prescribedFunction) {
    opensimModelJNI.PrescribedController_prescribeControlForActuator__SWIG_1(swigCPtr, this, actName, Function.getCPtr(prescribedFunction), prescribedFunction);
    prescribedFunction.markAdopted();
  }

}
