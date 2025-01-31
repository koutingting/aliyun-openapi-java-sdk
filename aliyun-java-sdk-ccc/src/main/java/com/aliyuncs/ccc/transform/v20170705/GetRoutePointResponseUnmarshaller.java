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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.GetRoutePointResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRoutePointResponseUnmarshaller {

	public static GetRoutePointResponse unmarshall(GetRoutePointResponse getRoutePointResponse, UnmarshallerContext _ctx) {
		
		getRoutePointResponse.setRequestId(_ctx.stringValue("GetRoutePointResponse.RequestId"));
		getRoutePointResponse.setHttpStatusCode(_ctx.integerValue("GetRoutePointResponse.HttpStatusCode"));
		getRoutePointResponse.setRoutePoint(_ctx.stringValue("GetRoutePointResponse.RoutePoint"));
		getRoutePointResponse.setSuccess(_ctx.booleanValue("GetRoutePointResponse.Success"));
		getRoutePointResponse.setStatusCode(_ctx.stringValue("GetRoutePointResponse.StatusCode"));
		getRoutePointResponse.setCode(_ctx.stringValue("GetRoutePointResponse.Code"));
		getRoutePointResponse.setMessage(_ctx.stringValue("GetRoutePointResponse.Message"));
		getRoutePointResponse.setStatusDesc(_ctx.stringValue("GetRoutePointResponse.StatusDesc"));
	 
	 	return getRoutePointResponse;
	}
}