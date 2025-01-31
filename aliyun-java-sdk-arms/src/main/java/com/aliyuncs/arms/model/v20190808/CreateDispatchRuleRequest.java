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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDispatchRuleRequest extends RpcAcsRequest<CreateDispatchRuleResponse> {
	   

	private String dispatchRule;
	public CreateDispatchRuleRequest() {
		super("ARMS", "2019-08-08", "CreateDispatchRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDispatchRule() {
		return this.dispatchRule;
	}

	public void setDispatchRule(String dispatchRule) {
		this.dispatchRule = dispatchRule;
		if(dispatchRule != null){
			putQueryParameter("DispatchRule", dispatchRule);
		}
	}

	@Override
	public Class<CreateDispatchRuleResponse> getResponseClass() {
		return CreateDispatchRuleResponse.class;
	}

}
