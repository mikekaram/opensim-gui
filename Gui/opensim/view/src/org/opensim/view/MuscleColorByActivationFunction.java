/* -------------------------------------------------------------------------- *
 * OpenSim: MuscleColorByActivationFunction.java                              *
 * -------------------------------------------------------------------------- *
 * OpenSim is a toolkit for musculoskeletal modeling and simulation,          *
 * developed as an open source project by a worldwide community. Development  *
 * and support is coordinated from Stanford University, with funding from the *
 * U.S. NIH and DARPA. See http://opensim.stanford.edu and the README file    *
 * for more information including specific grant numbers.                     *
 *                                                                            *
 * Copyright (c) 2005-2017 Stanford University and the Authors                *
 * Author(s): Ayman Habib                                                     *
 *                                                                            *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain a  *
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0          *
 *                                                                            *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 * -------------------------------------------------------------------------- */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.view;

import org.opensim.modeling.Muscle;
import org.opensim.modeling.OpenSimContext;

/**
 *
 * @author ayman
 */
public class MuscleColorByActivationFunction extends MuscleColoringFunction {
    final static double activationColorTau = 5;
    final static double activationColorFactor = 1/(1-Math.exp(-activationColorTau));
    OpenSimContext dContext;
    MuscleColorByActivationFunction(OpenSimContext context){
        dContext = context;
    }
    @Override
    public double getColor(Muscle msl){
        double color = dContext.getActivation(msl);
        // Apply this transfer function to get better results from the color map
        color = activationColorFactor * (1-Math.exp(-activationColorTau*color));
        //dContext.getStateVariable(msl, "activation");
        return color;
    }
}
