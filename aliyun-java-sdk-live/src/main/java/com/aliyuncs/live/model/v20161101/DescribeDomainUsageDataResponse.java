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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeDomainUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainUsageDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private String area;

	private String field;

	private String domainName;

	private String dataInterval;

	private List<DataModule> usageDataPerInterval;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<DataModule> getUsageDataPerInterval() {
		return this.usageDataPerInterval;
	}

	public void setUsageDataPerInterval(List<DataModule> usageDataPerInterval) {
		this.usageDataPerInterval = usageDataPerInterval;
	}

	public static class DataModule {

		private String value;

		private String timeStamp;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeDomainUsageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainUsageDataResponseUnmarshaller.unmarshall(this, context);
	}
}
