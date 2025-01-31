/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.lmztest.model.v20100101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lmztest.transform.v20100101.DemoGetGroupApiResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DemoGetGroupApiResponse extends AcsResponse {

	private Map<Object,Object> id;

	private String name;

	private List<InfosItem> infos;

	public Map<Object,Object> getId() {
		return this.id;
	}

	public void setId(Map<Object,Object> id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<InfosItem> getInfos() {
		return this.infos;
	}

	public void setInfos(List<InfosItem> infos) {
		this.infos = infos;
	}

	public static class InfosItem {

		private Map<Object,Object> param0;

		public Map<Object,Object> getParam0() {
			return this.param0;
		}

		public void setParam0(Map<Object,Object> param0) {
			this.param0 = param0;
		}
	}

	@Override
	public DemoGetGroupApiResponse getInstance(UnmarshallerContext context) {
		return	DemoGetGroupApiResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
