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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeDomainTopUrlVisitResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainTopUrlVisitResponse.UrlList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainTopUrlVisitResponseUnmarshaller {

	public static DescribeDomainTopUrlVisitResponse unmarshall(DescribeDomainTopUrlVisitResponse describeDomainTopUrlVisitResponse, UnmarshallerContext _ctx) {
		
		describeDomainTopUrlVisitResponse.setRequestId(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.RequestId"));
		describeDomainTopUrlVisitResponse.setDomainName(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.DomainName"));
		describeDomainTopUrlVisitResponse.setStartTime(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.StartTime"));

		List<UrlList> allUrlList = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainTopUrlVisitResponse.AllUrlList.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.AllUrlList["+ i +"].UrlDetail"));
			urlList.setVisitData(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitData"));
			urlList.setVisitProportion(_ctx.floatValue("DescribeDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitProportion"));
			urlList.setFlow(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.AllUrlList["+ i +"].Flow"));
			urlList.setFlowProportion(_ctx.floatValue("DescribeDomainTopUrlVisitResponse.AllUrlList["+ i +"].FlowProportion"));

			allUrlList.add(urlList);
		}
		describeDomainTopUrlVisitResponse.setAllUrlList(allUrlList);

		List<UrlList> url200List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainTopUrlVisitResponse.Url200List.Length"); i++) {
			UrlList urlList1 = new UrlList();
			urlList1.setUrlDetail(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url200List["+ i +"].UrlDetail"));
			urlList1.setVisitData(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url200List["+ i +"].VisitData"));
			urlList1.setVisitProportion(_ctx.floatValue("DescribeDomainTopUrlVisitResponse.Url200List["+ i +"].VisitProportion"));
			urlList1.setFlow(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url200List["+ i +"].Flow"));
			urlList1.setFlowProportion(_ctx.floatValue("DescribeDomainTopUrlVisitResponse.Url200List["+ i +"].FlowProportion"));

			url200List.add(urlList1);
		}
		describeDomainTopUrlVisitResponse.setUrl200List(url200List);

		List<UrlList> url300List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainTopUrlVisitResponse.Url300List.Length"); i++) {
			UrlList urlList2 = new UrlList();
			urlList2.setUrlDetail(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url300List["+ i +"].UrlDetail"));
			urlList2.setVisitData(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url300List["+ i +"].VisitData"));
			urlList2.setVisitProportion(_ctx.floatValue("DescribeDomainTopUrlVisitResponse.Url300List["+ i +"].VisitProportion"));
			urlList2.setFlow(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url300List["+ i +"].Flow"));
			urlList2.setFlowProportion(_ctx.floatValue("DescribeDomainTopUrlVisitResponse.Url300List["+ i +"].FlowProportion"));

			url300List.add(urlList2);
		}
		describeDomainTopUrlVisitResponse.setUrl300List(url300List);

		List<UrlList> url400List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainTopUrlVisitResponse.Url400List.Length"); i++) {
			UrlList urlList3 = new UrlList();
			urlList3.setUrlDetail(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url400List["+ i +"].UrlDetail"));
			urlList3.setVisitData(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url400List["+ i +"].VisitData"));
			urlList3.setVisitProportion(_ctx.floatValue("DescribeDomainTopUrlVisitResponse.Url400List["+ i +"].VisitProportion"));
			urlList3.setFlow(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url400List["+ i +"].Flow"));
			urlList3.setFlowProportion(_ctx.floatValue("DescribeDomainTopUrlVisitResponse.Url400List["+ i +"].FlowProportion"));

			url400List.add(urlList3);
		}
		describeDomainTopUrlVisitResponse.setUrl400List(url400List);

		List<UrlList> url500List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainTopUrlVisitResponse.Url500List.Length"); i++) {
			UrlList urlList4 = new UrlList();
			urlList4.setUrlDetail(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url500List["+ i +"].UrlDetail"));
			urlList4.setVisitData(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url500List["+ i +"].VisitData"));
			urlList4.setVisitProportion(_ctx.floatValue("DescribeDomainTopUrlVisitResponse.Url500List["+ i +"].VisitProportion"));
			urlList4.setFlow(_ctx.stringValue("DescribeDomainTopUrlVisitResponse.Url500List["+ i +"].Flow"));
			urlList4.setFlowProportion(_ctx.floatValue("DescribeDomainTopUrlVisitResponse.Url500List["+ i +"].FlowProportion"));

			url500List.add(urlList4);
		}
		describeDomainTopUrlVisitResponse.setUrl500List(url500List);
	 
	 	return describeDomainTopUrlVisitResponse;
	}
}