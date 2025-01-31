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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListFpShotImportJobResponse;
import com.aliyuncs.mts.model.v20140618.ListFpShotImportJobResponse.FpShotImportJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFpShotImportJobResponseUnmarshaller {

	public static ListFpShotImportJobResponse unmarshall(ListFpShotImportJobResponse listFpShotImportJobResponse, UnmarshallerContext _ctx) {
		
		listFpShotImportJobResponse.setRequestId(_ctx.stringValue("ListFpShotImportJobResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListFpShotImportJobResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("ListFpShotImportJobResponse.NonExistIds["+ i +"]"));
		}
		listFpShotImportJobResponse.setNonExistIds(nonExistIds);

		List<FpShotImportJob> fpShotImportJobList = new ArrayList<FpShotImportJob>();
		for (int i = 0; i < _ctx.lengthValue("ListFpShotImportJobResponse.FpShotImportJobList.Length"); i++) {
			FpShotImportJob fpShotImportJob = new FpShotImportJob();
			fpShotImportJob.setId(_ctx.stringValue("ListFpShotImportJobResponse.FpShotImportJobList["+ i +"].Id"));
			fpShotImportJob.setFpDBId(_ctx.stringValue("ListFpShotImportJobResponse.FpShotImportJobList["+ i +"].FpDBId"));
			fpShotImportJob.setPipelineId(_ctx.stringValue("ListFpShotImportJobResponse.FpShotImportJobList["+ i +"].PipelineId"));
			fpShotImportJob.setFpImportConfig(_ctx.stringValue("ListFpShotImportJobResponse.FpShotImportJobList["+ i +"].FpImportConfig"));
			fpShotImportJob.setStatus(_ctx.stringValue("ListFpShotImportJobResponse.FpShotImportJobList["+ i +"].Status"));
			fpShotImportJob.setCode(_ctx.stringValue("ListFpShotImportJobResponse.FpShotImportJobList["+ i +"].Code"));
			fpShotImportJob.setMessage(_ctx.stringValue("ListFpShotImportJobResponse.FpShotImportJobList["+ i +"].Message"));
			fpShotImportJob.setCreateTime(_ctx.stringValue("ListFpShotImportJobResponse.FpShotImportJobList["+ i +"].CreateTime"));
			fpShotImportJob.setFinishTime(_ctx.stringValue("ListFpShotImportJobResponse.FpShotImportJobList["+ i +"].FinishTime"));
			fpShotImportJob.setUserData(_ctx.stringValue("ListFpShotImportJobResponse.FpShotImportJobList["+ i +"].UserData"));
			fpShotImportJob.setInput(_ctx.stringValue("ListFpShotImportJobResponse.FpShotImportJobList["+ i +"].Input"));

			fpShotImportJobList.add(fpShotImportJob);
		}
		listFpShotImportJobResponse.setFpShotImportJobList(fpShotImportJobList);
	 
	 	return listFpShotImportJobResponse;
	}
}