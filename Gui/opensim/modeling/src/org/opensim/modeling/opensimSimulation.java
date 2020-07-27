/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class opensimSimulation {
  public static State simulate(Model model, State initialState, double finalTime, boolean saveStatesFile) {
    return new State(opensimSimulationJNI.simulate__SWIG_0(Model.getCPtr(model), model, State.getCPtr(initialState), initialState, finalTime, saveStatesFile), true);
  }

  public static State simulate(Model model, State initialState, double finalTime) {
    return new State(opensimSimulationJNI.simulate__SWIG_1(Model.getCPtr(model), model, State.getCPtr(initialState), initialState, finalTime), true);
  }

  public static void updateStateLabels40(Model model, StdVectorString labels) {
    opensimSimulationJNI.updateStateLabels40(Model.getCPtr(model), model, StdVectorString.getCPtr(labels), labels);
  }

  public static void updatePre40KinematicsFilesFor40MotionType(Model model, StdVectorString filePaths, String suffix) {
    opensimSimulationJNI.updatePre40KinematicsFilesFor40MotionType__SWIG_0(Model.getCPtr(model), model, StdVectorString.getCPtr(filePaths), filePaths, suffix);
  }

  public static void updatePre40KinematicsFilesFor40MotionType(Model model, StdVectorString filePaths) {
    opensimSimulationJNI.updatePre40KinematicsFilesFor40MotionType__SWIG_1(Model.getCPtr(model), model, StdVectorString.getCPtr(filePaths), filePaths);
  }

  public static void updateSocketConnecteesBySearch(Model model) {
    opensimSimulationJNI.updateSocketConnecteesBySearch(Model.getCPtr(model), model);
  }

}
