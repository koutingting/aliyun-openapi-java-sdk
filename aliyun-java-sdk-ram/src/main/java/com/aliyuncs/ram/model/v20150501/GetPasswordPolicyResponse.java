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

package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ram.transform.v20150501.GetPasswordPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPasswordPolicyResponse extends AcsResponse {

	private String requestId;

	private PasswordPolicy passwordPolicy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PasswordPolicy getPasswordPolicy() {
		return this.passwordPolicy;
	}

	public void setPasswordPolicy(PasswordPolicy passwordPolicy) {
		this.passwordPolicy = passwordPolicy;
	}

	public static class PasswordPolicy {

		private Boolean requireNumbers;

		private Boolean requireLowercaseCharacters;

		private Boolean hardExpiry;

		private Integer passwordReusePrevention;

		private Boolean requireSymbols;

		private Integer maxPasswordAge;

		private Integer minimumPasswordLength;

		private Boolean requireUppercaseCharacters;

		private Integer maxLoginAttemps;

		public Boolean getRequireNumbers() {
			return this.requireNumbers;
		}

		public void setRequireNumbers(Boolean requireNumbers) {
			this.requireNumbers = requireNumbers;
		}

		public Boolean getRequireLowercaseCharacters() {
			return this.requireLowercaseCharacters;
		}

		public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
			this.requireLowercaseCharacters = requireLowercaseCharacters;
		}

		public Boolean getHardExpiry() {
			return this.hardExpiry;
		}

		public void setHardExpiry(Boolean hardExpiry) {
			this.hardExpiry = hardExpiry;
		}

		public Integer getPasswordReusePrevention() {
			return this.passwordReusePrevention;
		}

		public void setPasswordReusePrevention(Integer passwordReusePrevention) {
			this.passwordReusePrevention = passwordReusePrevention;
		}

		public Boolean getRequireSymbols() {
			return this.requireSymbols;
		}

		public void setRequireSymbols(Boolean requireSymbols) {
			this.requireSymbols = requireSymbols;
		}

		public Integer getMaxPasswordAge() {
			return this.maxPasswordAge;
		}

		public void setMaxPasswordAge(Integer maxPasswordAge) {
			this.maxPasswordAge = maxPasswordAge;
		}

		public Integer getMinimumPasswordLength() {
			return this.minimumPasswordLength;
		}

		public void setMinimumPasswordLength(Integer minimumPasswordLength) {
			this.minimumPasswordLength = minimumPasswordLength;
		}

		public Boolean getRequireUppercaseCharacters() {
			return this.requireUppercaseCharacters;
		}

		public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
			this.requireUppercaseCharacters = requireUppercaseCharacters;
		}

		public Integer getMaxLoginAttemps() {
			return this.maxLoginAttemps;
		}

		public void setMaxLoginAttemps(Integer maxLoginAttemps) {
			this.maxLoginAttemps = maxLoginAttemps;
		}
	}

	@Override
	public GetPasswordPolicyResponse getInstance(UnmarshallerContext context) {
		return	GetPasswordPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
