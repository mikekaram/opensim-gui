/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ModelComponentIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_ModelComponentIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(ModelComponentIterator other) {
    return opensimModelSimulationJNI.ModelComponentIterator_equals(swigCPtr, this, ModelComponentIterator.getCPtr(other), other);
  }

  public ModelComponent __ref__() {
    return new ModelComponent(opensimModelSimulationJNI.ModelComponentIterator___ref__(swigCPtr, this), false);
  }

  public ModelComponent __deref__() {
    long cPtr = opensimModelSimulationJNI.ModelComponentIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponent(cPtr, false);
  }

  public ModelComponentIterator next() {
    return new ModelComponentIterator(opensimModelSimulationJNI.ModelComponentIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.ModelComponentIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponent(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.ModelComponentIterator_getConcreteClassName(swigCPtr, this);
  }

  public Model getModel() {
    return new Model(opensimModelSimulationJNI.ModelComponentIterator_getModel(swigCPtr, this), false);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelSimulationJNI.ModelComponentIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelSimulationJNI.ModelComponentIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelSimulationJNI.ModelComponentIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelSimulationJNI.ModelComponentIterator_getSystem(swigCPtr, this), false);
  }

  public boolean hasSystem() {
    return opensimModelSimulationJNI.ModelComponentIterator_hasSystem(swigCPtr, this);
  }

  public String getFullPathName() {
    return opensimModelSimulationJNI.ModelComponentIterator_getFullPathName(swigCPtr, this);
  }

  public String getRelativePathName(Component wrt) {
    return opensimModelSimulationJNI.ModelComponentIterator_getRelativePathName(swigCPtr, this, Component.getCPtr(wrt), wrt);
  }

  public boolean hasComponent(String pathname) {
    return opensimModelSimulationJNI.ModelComponentIterator_hasComponent(swigCPtr, this, pathname);
  }

  public Component getComponent(String pathname) {
    return new Component(opensimModelSimulationJNI.ModelComponentIterator_getComponent(swigCPtr, this, pathname), false);
  }

  public long printComponentsMatching(String substring) {
    return opensimModelSimulationJNI.ModelComponentIterator_printComponentsMatching(swigCPtr, this, substring);
  }

  public int getNumStateVariables() {
    return opensimModelSimulationJNI.ModelComponentIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelSimulationJNI.ModelComponentIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelSimulationJNI.ModelComponentIterator_getNumConnectors(swigCPtr, this);
  }

  public OpenSimObject getConnectee(String name) {
    return new OpenSimObject(opensimModelSimulationJNI.ModelComponentIterator_getConnectee(swigCPtr, this, name), false);
  }

  public AbstractConnector getConnector(String name) {
    return new AbstractConnector(opensimModelSimulationJNI.ModelComponentIterator_getConnector__SWIG_0(swigCPtr, this, name), false);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelSimulationJNI.ModelComponentIterator_getConnector__SWIG_2(swigCPtr, this, i), false);
  }

  public int getNumInputs() {
    return opensimModelSimulationJNI.ModelComponentIterator_getNumInputs(swigCPtr, this);
  }

  public int getNumOutputs() {
    return opensimModelSimulationJNI.ModelComponentIterator_getNumOutputs(swigCPtr, this);
  }

  public StdVectorString getInputNames() {
    return new StdVectorString(opensimModelSimulationJNI.ModelComponentIterator_getInputNames(swigCPtr, this), true);
  }

  public StdVectorString getOutputNames() {
    return new StdVectorString(opensimModelSimulationJNI.ModelComponentIterator_getOutputNames(swigCPtr, this), true);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelSimulationJNI.ModelComponentIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelSimulationJNI.ModelComponentIterator_getOutput(swigCPtr, this, name), false);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelSimulationJNI.ModelComponentIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelSimulationJNI.ModelComponentIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelSimulationJNI.ModelComponentIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelSimulationJNI.ModelComponentIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelSimulationJNI.ModelComponentIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelSimulationJNI.ModelComponentIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelSimulationJNI.ModelComponentIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelSimulationJNI.ModelComponentIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelSimulationJNI.ModelComponentIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelSimulationJNI.ModelComponentIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelSimulationJNI.ModelComponentIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void dumpSubcomponents(int depth) {
    opensimModelSimulationJNI.ModelComponentIterator_dumpSubcomponents__SWIG_0(swigCPtr, this, depth);
  }

  public void dumpSubcomponents() {
    opensimModelSimulationJNI.ModelComponentIterator_dumpSubcomponents__SWIG_1(swigCPtr, this);
  }

  public void dumpConnections() {
    opensimModelSimulationJNI.ModelComponentIterator_dumpConnections(swigCPtr, this);
  }

  public AbstractConnector findConnector(String name) {
    long cPtr = opensimModelSimulationJNI.ModelComponentIterator_findConnector(swigCPtr, this, name);
    return (cPtr == 0) ? null : new AbstractConnector(cPtr, false);
  }

  public Component getParent() {
    return new Component(opensimModelSimulationJNI.ModelComponentIterator_getParent(swigCPtr, this), false);
  }

  public boolean hasParent() {
    return opensimModelSimulationJNI.ModelComponentIterator_hasParent(swigCPtr, this);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimModelSimulationJNI.ModelComponentIterator_getComponentsList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimModelSimulationJNI.ModelComponentIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimModelSimulationJNI.ModelComponentIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimModelSimulationJNI.ModelComponentIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimModelSimulationJNI.ModelComponentIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimModelSimulationJNI.ModelComponentIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimModelSimulationJNI.ModelComponentIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelSimulationJNI.ModelComponentIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimModelSimulationJNI.ModelComponentIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimModelSimulationJNI.ModelComponentIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimModelSimulationJNI.ModelComponentIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelSimulationJNI.ModelComponentIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimModelSimulationJNI.ModelComponentIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimModelSimulationJNI.ModelComponentIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimModelSimulationJNI.ModelComponentIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimModelSimulationJNI.ModelComponentIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimModelSimulationJNI.ModelComponentIterator_toString(swigCPtr, this);
  }

}
