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
package ghidra.app.util.bin.format.pdb2.pdbreader;

import ghidra.util.task.TaskMonitor;

/**
 * Class for C13Type FRAMEDATA.
 * <p>
 * This temporary class implementation currently extends {@link AbstractUnimplementedC13Section},
 * but this should be changed to {@link C13Section} when the format is understood and the
 * implementation is made concrete.
 */
class FrameDataC13Section extends AbstractUnimplementedC13Section {
	static FrameDataC13Section parse(PdbByteReader reader, boolean ignore, TaskMonitor monitor) {
		return new FrameDataC13Section(reader, ignore, monitor);
	}

	private FrameDataC13Section(PdbByteReader reader, boolean ignore, TaskMonitor monitor) {
		super(reader, ignore, monitor);
	}
}
