/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package docking;

import java.awt.Component;

/**
 * A class used by the {@link KeyBindingOverrideKeyEventDispatcher}.  It represents an action and 
 * the context in which that action should operate if {@link #execute()} is called.   This class is
 * created for each keystroke that maps to a tool action.
 * <p>
 * This is not meant to be used outside of this API.
 */
public interface ExecutableAction {

	public boolean isValid();

	public boolean isEnabled();

	public void reportNotEnabled(Component focusOwner);

	public KeyBindingPrecedence getKeyBindingPrecedence();

	public void execute();
}
