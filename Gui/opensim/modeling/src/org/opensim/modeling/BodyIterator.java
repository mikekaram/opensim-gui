/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class BodyIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public BodyIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(BodyIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_BodyIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(BodyIterator other) {
    return opensimModelSimulationJNI.BodyIterator_equals(swigCPtr, this, BodyIterator.getCPtr(other), other);
  }

  public Body __ref__() {
    return new Body(opensimModelSimulationJNI.BodyIterator___ref__(swigCPtr, this), false);
  }

  public Body __deref__() {
    long cPtr = opensimModelSimulationJNI.BodyIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Body(cPtr, false);
  }

  public BodyIterator next() {
    return new BodyIterator(opensimModelSimulationJNI.BodyIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.BodyIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Body(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.BodyIterator_getConcreteClassName(swigCPtr, this);
  }

  public double get_mass(int i) {
    return opensimModelSimulationJNI.BodyIterator_get_mass__SWIG_0(swigCPtr, this, i);
  }

  public double get_mass() {
    return opensimModelSimulationJNI.BodyIterator_get_mass__SWIG_1(swigCPtr, this);
  }

  public Vec3 get_mass_center(int i) {
    return new Vec3(opensimModelSimulationJNI.BodyIterator_get_mass_center__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 get_mass_center() {
    return new Vec3(opensimModelSimulationJNI.BodyIterator_get_mass_center__SWIG_1(swigCPtr, this), false);
  }

  public Vec6 get_inertia(int i) {
    return new Vec6(opensimModelSimulationJNI.BodyIterator_get_inertia__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec6 get_inertia() {
    return new Vec6(opensimModelSimulationJNI.BodyIterator_get_inertia__SWIG_1(swigCPtr, this), false);
  }

  public double getMass() {
    return opensimModelSimulationJNI.BodyIterator_getMass(swigCPtr, this);
  }

  public Vec3 getMassCenter() {
    return new Vec3(opensimModelSimulationJNI.BodyIterator_getMassCenter(swigCPtr, this), false);
  }

  public Inertia getInertia() {
    return new Inertia(opensimModelSimulationJNI.BodyIterator_getInertia__SWIG_0(swigCPtr, this), false);
  }

  public MassProperties getMassProperties() {
    return new MassProperties(opensimModelSimulationJNI.BodyIterator_getMassProperties(swigCPtr, this), true);
  }

  public WrapObjectSet get_WrapObjectSet(int i) {
    return new WrapObjectSet(opensimModelSimulationJNI.BodyIterator_get_WrapObjectSet__SWIG_0(swigCPtr, this, i), false);
  }

  public WrapObjectSet get_WrapObjectSet() {
    return new WrapObjectSet(opensimModelSimulationJNI.BodyIterator_get_WrapObjectSet__SWIG_1(swigCPtr, this), false);
  }

  public int getMobilizedBodyIndex() {
    return opensimModelSimulationJNI.BodyIterator_getMobilizedBodyIndex(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__MobilizedBody getMobilizedBody() {
    return new SWIGTYPE_p_SimTK__MobilizedBody(opensimModelSimulationJNI.BodyIterator_getMobilizedBody(swigCPtr, this), false);
  }

  public WrapObject getWrapObject(String aName) {
    long cPtr = opensimModelSimulationJNI.BodyIterator_getWrapObject(swigCPtr, this, aName);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public WrapObjectSet getWrapObjectSet() {
    return new WrapObjectSet(opensimModelSimulationJNI.BodyIterator_getWrapObjectSet(swigCPtr, this), false);
  }

  public FrameGeometry get_frame_geometry(int i) {
    return new FrameGeometry(opensimModelSimulationJNI.BodyIterator_get_frame_geometry__SWIG_0(swigCPtr, this, i), false);
  }

  public FrameGeometry get_frame_geometry() {
    return new FrameGeometry(opensimModelSimulationJNI.BodyIterator_get_frame_geometry__SWIG_1(swigCPtr, this), false);
  }

  public Geometry get_attached_geometry(int i) {
    return new Geometry(opensimModelSimulationJNI.BodyIterator_get_attached_geometry(swigCPtr, this, i), false);
  }

  public boolean get_has_output_position() {
    return opensimModelSimulationJNI.BodyIterator__has_output_position_get(swigCPtr, this);
  }

  public boolean get_has_output_transform() {
    return opensimModelSimulationJNI.BodyIterator__has_output_transform_get(swigCPtr, this);
  }

  public boolean get_has_output_velocity() {
    return opensimModelSimulationJNI.BodyIterator__has_output_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_acceleration() {
    return opensimModelSimulationJNI.BodyIterator__has_output_acceleration_get(swigCPtr, this);
  }

  public Transform getTransformInGround(State state) {
    return new Transform(opensimModelSimulationJNI.BodyIterator_getTransformInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public SpatialVec getVelocityInGround(State state) {
    return new SpatialVec(opensimModelSimulationJNI.BodyIterator_getVelocityInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public SpatialVec getAccelerationInGround(State state) {
    return new SpatialVec(opensimModelSimulationJNI.BodyIterator_getAccelerationInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Transform findTransformBetween(State state, Frame otherFrame) {
    return new Transform(opensimModelSimulationJNI.BodyIterator_findTransformBetween(swigCPtr, this, State.getCPtr(state), state, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 expressVectorInAnotherFrame(State state, Vec3 vec_F, Frame otherFrame) {
    return new Vec3(opensimModelSimulationJNI.BodyIterator_expressVectorInAnotherFrame(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(vec_F), vec_F, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 findLocationInAnotherFrame(State state, Vec3 point_F, Frame otherFrame) {
    return new Vec3(opensimModelSimulationJNI.BodyIterator_findLocationInAnotherFrame(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(point_F), point_F, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Frame findBaseFrame() {
    return new Frame(opensimModelSimulationJNI.BodyIterator_findBaseFrame(swigCPtr, this), false);
  }

  public Transform findTransformInBaseFrame() {
    return new Transform(opensimModelSimulationJNI.BodyIterator_findTransformInBaseFrame(swigCPtr, this), true);
  }

  public Vec3 getPositionInGround(State state) {
    return new Vec3(opensimModelSimulationJNI.BodyIterator_getPositionInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public Model getModel() {
    return new Model(opensimModelSimulationJNI.BodyIterator_getModel(swigCPtr, this), false);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelSimulationJNI.BodyIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelSimulationJNI.BodyIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelSimulationJNI.BodyIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelSimulationJNI.BodyIterator_getSystem(swigCPtr, this), false);
  }

  public boolean hasSystem() {
    return opensimModelSimulationJNI.BodyIterator_hasSystem(swigCPtr, this);
  }

  public String getFullPathName() {
    return opensimModelSimulationJNI.BodyIterator_getFullPathName(swigCPtr, this);
  }

  public String getRelativePathName(Component wrt) {
    return opensimModelSimulationJNI.BodyIterator_getRelativePathName(swigCPtr, this, Component.getCPtr(wrt), wrt);
  }

  public boolean hasComponent(String pathname) {
    return opensimModelSimulationJNI.BodyIterator_hasComponent(swigCPtr, this, pathname);
  }

  public Component getComponent(String pathname) {
    return new Component(opensimModelSimulationJNI.BodyIterator_getComponent(swigCPtr, this, pathname), false);
  }

  public long printComponentsMatching(String substring) {
    return opensimModelSimulationJNI.BodyIterator_printComponentsMatching(swigCPtr, this, substring);
  }

  public int getNumStateVariables() {
    return opensimModelSimulationJNI.BodyIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelSimulationJNI.BodyIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelSimulationJNI.BodyIterator_getNumConnectors(swigCPtr, this);
  }

  public OpenSimObject getConnectee(String name) {
    return new OpenSimObject(opensimModelSimulationJNI.BodyIterator_getConnectee(swigCPtr, this, name), false);
  }

  public AbstractConnector getConnector(String name) {
    return new AbstractConnector(opensimModelSimulationJNI.BodyIterator_getConnector__SWIG_0(swigCPtr, this, name), false);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelSimulationJNI.BodyIterator_getConnector__SWIG_2(swigCPtr, this, i), false);
  }

  public int getNumInputs() {
    return opensimModelSimulationJNI.BodyIterator_getNumInputs(swigCPtr, this);
  }

  public int getNumOutputs() {
    return opensimModelSimulationJNI.BodyIterator_getNumOutputs(swigCPtr, this);
  }

  public StdVectorString getInputNames() {
    return new StdVectorString(opensimModelSimulationJNI.BodyIterator_getInputNames(swigCPtr, this), true);
  }

  public StdVectorString getOutputNames() {
    return new StdVectorString(opensimModelSimulationJNI.BodyIterator_getOutputNames(swigCPtr, this), true);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelSimulationJNI.BodyIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelSimulationJNI.BodyIterator_getOutput(swigCPtr, this, name), false);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelSimulationJNI.BodyIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelSimulationJNI.BodyIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelSimulationJNI.BodyIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelSimulationJNI.BodyIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelSimulationJNI.BodyIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelSimulationJNI.BodyIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelSimulationJNI.BodyIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelSimulationJNI.BodyIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelSimulationJNI.BodyIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelSimulationJNI.BodyIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelSimulationJNI.BodyIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void dumpSubcomponents(int depth) {
    opensimModelSimulationJNI.BodyIterator_dumpSubcomponents__SWIG_0(swigCPtr, this, depth);
  }

  public void dumpSubcomponents() {
    opensimModelSimulationJNI.BodyIterator_dumpSubcomponents__SWIG_1(swigCPtr, this);
  }

  public void dumpConnections() {
    opensimModelSimulationJNI.BodyIterator_dumpConnections(swigCPtr, this);
  }

  public AbstractConnector findConnector(String name) {
    long cPtr = opensimModelSimulationJNI.BodyIterator_findConnector(swigCPtr, this, name);
    return (cPtr == 0) ? null : new AbstractConnector(cPtr, false);
  }

  public Component getParent() {
    return new Component(opensimModelSimulationJNI.BodyIterator_getParent(swigCPtr, this), false);
  }

  public boolean hasParent() {
    return opensimModelSimulationJNI.BodyIterator_hasParent(swigCPtr, this);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimModelSimulationJNI.BodyIterator_getComponentsList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimModelSimulationJNI.BodyIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimModelSimulationJNI.BodyIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimModelSimulationJNI.BodyIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimModelSimulationJNI.BodyIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimModelSimulationJNI.BodyIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimModelSimulationJNI.BodyIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelSimulationJNI.BodyIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimModelSimulationJNI.BodyIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimModelSimulationJNI.BodyIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimModelSimulationJNI.BodyIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelSimulationJNI.BodyIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimModelSimulationJNI.BodyIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimModelSimulationJNI.BodyIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimModelSimulationJNI.BodyIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimModelSimulationJNI.BodyIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimModelSimulationJNI.BodyIterator_toString(swigCPtr, this);
  }

}
